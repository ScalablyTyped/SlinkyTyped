package typingsSlinky.reactDashDnd

import typingsSlinky.dndDashCore.libInterfacesMod.DragDropManager
import typingsSlinky.dndDashCore.libInterfacesMod.DragSource
import typingsSlinky.dndDashCore.libInterfacesMod.DropTarget
import typingsSlinky.dndDashCore.libInterfacesMod.Identifier
import typingsSlinky.dndDashCore.libInterfacesMod.SourceType
import typingsSlinky.dndDashCore.libInterfacesMod.TargetType
import typingsSlinky.dndDashCore.libInterfacesMod.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/registration", JSImport.Namespace)
@js.native
object libCommonRegistrationMod extends js.Object {
  def registerSource(`type`: SourceType, source: DragSource, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = js.native
  def registerTarget(`type`: TargetType, target: DropTarget, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = js.native
}

