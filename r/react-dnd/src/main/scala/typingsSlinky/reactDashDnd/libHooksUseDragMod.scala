package typingsSlinky.reactDashDnd

import typingsSlinky.reactDashDnd.libInterfacesConnectorsMod.ConnectDragPreview
import typingsSlinky.reactDashDnd.libInterfacesConnectorsMod.ConnectDragSource
import typingsSlinky.reactDashDnd.libInterfacesHooksApiMod.DragObjectWithType
import typingsSlinky.reactDashDnd.libInterfacesHooksApiMod.DragSourceHookSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/hooks/useDrag", JSImport.Namespace)
@js.native
object libHooksUseDragMod extends js.Object {
  def useDrag[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DragSourceHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = js.native
}

