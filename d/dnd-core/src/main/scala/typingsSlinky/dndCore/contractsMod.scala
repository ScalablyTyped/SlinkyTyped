package typingsSlinky.dndCore

import typingsSlinky.dndCore.interfacesMod.DragSource
import typingsSlinky.dndCore.interfacesMod.DropTarget
import typingsSlinky.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dnd-core/lib/contracts", JSImport.Namespace)
@js.native
object contractsMod extends js.Object {
  
  def validateSourceContract(source: DragSource): Unit = js.native
  
  def validateTargetContract(target: DropTarget): Unit = js.native
  
  def validateType(`type`: js.Array[Identifier]): Unit = js.native
  def validateType(`type`: js.Array[Identifier], allowArray: Boolean): Unit = js.native
  def validateType(`type`: Identifier): Unit = js.native
  def validateType(`type`: Identifier, allowArray: Boolean): Unit = js.native
}
