package typingsSlinky.reactDnd

import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.dndCore.interfacesMod.DragSource
import typingsSlinky.dndCore.interfacesMod.DropTarget
import typingsSlinky.dndCore.interfacesMod.Identifier
import typingsSlinky.dndCore.interfacesMod.SourceType
import typingsSlinky.dndCore.interfacesMod.TargetType
import typingsSlinky.dndCore.interfacesMod.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/registration", JSImport.Namespace)
@js.native
object registrationMod extends js.Object {
  def registerSource(`type`: SourceType, source: DragSource, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = js.native
  def registerTarget(`type`: TargetType, target: DropTarget, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = js.native
}

