package typingsSlinky.reactDnd.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragPreviewOptions extends js.Object {
  /**
    * Optional. A number between 0 and 1. By default, 0.5. Specifies how the offset relative to the drag source node is translated
    * into the horizontal offset of the drag preview when their sizes don't match. 0 means “dock the preview to the left”, 0.5 means
    * “interpolate linearly” and 1 means “dock the preview to the right”.
    */
  var anchorX: js.UndefOr[Double] = js.native
  /**
    * Optional. A number between 0 and 1. By default, 0.5. Specifies how the offset relative to the drag source node is translated into
    * the vertical offset of the drag preview when their sizes don't match. 0 means “dock the preview to the top, 0.5 means “interpolate
    * linearly” and 1 means “dock the preview to the bottom.
    */
  var anchorY: js.UndefOr[Double] = js.native
  /**
    * Optional. A boolean. By default, false. If true, the component will learn that it is being dragged immediately as the drag
    * starts instead of the next tick. This means that the screenshotting would occur with monitor.isDragging() already being true,
    * and if you apply any styling like a decreased opacity to the dragged element, this styling will also be reflected on the
    * screenshot. This is rarely desirable, so false is a sensible default. However, you might want to set it to true in rare cases,
    * such as if you want to make the custom drag layers work in IE and you need to hide the original element without resorting to
    * an empty drag preview which IE doesn't support.
    */
  var captureDraggingState: js.UndefOr[Boolean] = js.native
  /**
    * Optional. A number or null if not needed. By default, null. Specifies the vertical offset between the cursor and the drag preview
    * element. If offsetX has a value, anchorX won't be used.
    */
  var offsetX: js.UndefOr[Double] = js.native
  /**
    *  Optional. A number or null if not needed. By default, null. Specifies the vertical offset between the cursor and the drag
    *  preview element. If offsetY has a value, anchorY won't be used.
    */
  var offsetY: js.UndefOr[Double] = js.native
}

object DragPreviewOptions {
  @scala.inline
  def apply(): DragPreviewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragPreviewOptions]
  }
  @scala.inline
  implicit class DragPreviewOptionsOps[Self <: DragPreviewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorX")(js.undefined)
        ret
    }
    @scala.inline
    def withAnchorY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorY")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptureDraggingState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureDraggingState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptureDraggingState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captureDraggingState")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(js.undefined)
        ret
    }
  }
  
}

