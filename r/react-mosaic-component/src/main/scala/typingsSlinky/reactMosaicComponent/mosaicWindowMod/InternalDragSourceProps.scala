package typingsSlinky.reactMosaicComponent.mosaicWindowMod

import slinky.core.facade.ReactElement
import typingsSlinky.reactDnd.connectorsMod.ConnectDragPreview
import typingsSlinky.reactDnd.connectorsMod.ConnectDragSource
import typingsSlinky.reactDnd.connectorsMod.ConnectableElement
import typingsSlinky.reactDnd.optionsMod.DragPreviewOptions
import typingsSlinky.reactDnd.optionsMod.DragSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalDragSourceProps extends js.Object {
  var connectDragPreview: ConnectDragPreview = js.native
  var connectDragSource: ConnectDragSource = js.native
}

object InternalDragSourceProps {
  @scala.inline
  def apply(
    connectDragPreview: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null,
    connectDragSource: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragSourceOptions]) => ReactElement | Null
  ): InternalDragSourceProps = {
    val __obj = js.Dynamic.literal(connectDragPreview = js.Any.fromFunction2(connectDragPreview), connectDragSource = js.Any.fromFunction2(connectDragSource))
    __obj.asInstanceOf[InternalDragSourceProps]
  }
  @scala.inline
  implicit class InternalDragSourcePropsOps[Self <: InternalDragSourceProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectDragPreview(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragPreviewOptions]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectDragPreview")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConnectDragSource(
      value: (/* elementOrNode */ ConnectableElement, /* options */ js.UndefOr[DragSourceOptions]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectDragSource")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

