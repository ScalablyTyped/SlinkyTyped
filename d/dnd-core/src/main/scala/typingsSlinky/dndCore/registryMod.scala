package typingsSlinky.dndCore

import typingsSlinky.dndCore.interfacesMod.Action
import typingsSlinky.dndCore.interfacesMod.SourceIdPayload
import typingsSlinky.dndCore.interfacesMod.TargetIdPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dnd-core/lib/actions/registry", JSImport.Namespace)
@js.native
object registryMod extends js.Object {
  
  val ADD_SOURCE: /* "dnd-core/ADD_SOURCE" */ String = js.native
  
  val ADD_TARGET: /* "dnd-core/ADD_TARGET" */ String = js.native
  
  val REMOVE_SOURCE: /* "dnd-core/REMOVE_SOURCE" */ String = js.native
  
  val REMOVE_TARGET: /* "dnd-core/REMOVE_TARGET" */ String = js.native
  
  def addSource(sourceId: String): Action[SourceIdPayload] = js.native
  
  def addTarget(targetId: String): Action[TargetIdPayload] = js.native
  
  def removeSource(sourceId: String): Action[SourceIdPayload] = js.native
  
  def removeTarget(targetId: String): Action[TargetIdPayload] = js.native
}
