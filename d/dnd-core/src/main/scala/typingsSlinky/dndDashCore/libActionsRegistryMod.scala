package typingsSlinky.dndDashCore

import typingsSlinky.dndDashCore.dndDashCoreStrings.`dnd-core/ADD_SOURCE`
import typingsSlinky.dndDashCore.dndDashCoreStrings.`dnd-core/ADD_TARGET`
import typingsSlinky.dndDashCore.dndDashCoreStrings.`dnd-core/REMOVE_SOURCE`
import typingsSlinky.dndDashCore.dndDashCoreStrings.`dnd-core/REMOVE_TARGET`
import typingsSlinky.dndDashCore.libInterfacesMod.Action
import typingsSlinky.dndDashCore.libInterfacesMod.SourceIdPayload
import typingsSlinky.dndDashCore.libInterfacesMod.TargetIdPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/actions/registry", JSImport.Namespace)
@js.native
object libActionsRegistryMod extends js.Object {
  val ADD_SOURCE: `dnd-core/ADD_SOURCE` = js.native
  val ADD_TARGET: `dnd-core/ADD_TARGET` = js.native
  val REMOVE_SOURCE: `dnd-core/REMOVE_SOURCE` = js.native
  val REMOVE_TARGET: `dnd-core/REMOVE_TARGET` = js.native
  def addSource(sourceId: String): Action[SourceIdPayload] = js.native
  def addTarget(targetId: String): Action[TargetIdPayload] = js.native
  def removeSource(sourceId: String): Action[SourceIdPayload] = js.native
  def removeTarget(targetId: String): Action[TargetIdPayload] = js.native
}

