package typingsSlinky.reactDashDnd

import typingsSlinky.reactDashDnd.libInterfacesConnectorsMod.ConnectDropTarget
import typingsSlinky.reactDashDnd.libInterfacesHooksApiMod.DragObjectWithType
import typingsSlinky.reactDashDnd.libInterfacesHooksApiMod.DropTargetHookSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/useDrop", JSImport.Namespace)
@js.native
object libHooksUseDropMod extends js.Object {
  def useDrop[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DropTargetHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple2[CollectedProps, ConnectDropTarget] = js.native
}

