package typingsSlinky.reactMosaicComponent.mosaicWindowMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactDnd.connectorsMod.ConnectDropTarget
import typingsSlinky.reactDnd.connectorsMod.ConnectableElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalDropTargetProps extends js.Object {
  var connectDropTarget: ConnectDropTarget = js.native
  var draggedMosaicId: js.UndefOr[String] = js.native
  var isOver: Boolean = js.native
}

object InternalDropTargetProps {
  @scala.inline
  def apply(
    connectDropTarget: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[js.Any]) => ReactElement | Null,
    isOver: Boolean
  ): InternalDropTargetProps = {
    val __obj = js.Dynamic.literal(connectDropTarget = js.Any.fromFunction2(connectDropTarget), isOver = isOver.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalDropTargetProps]
  }
  @scala.inline
  implicit class InternalDropTargetPropsOps[Self <: InternalDropTargetProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectDropTarget(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[js.Any]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectDropTarget")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsOver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDraggedMosaicId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedMosaicId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggedMosaicId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggedMosaicId")(js.undefined)
        ret
    }
  }
  
}

