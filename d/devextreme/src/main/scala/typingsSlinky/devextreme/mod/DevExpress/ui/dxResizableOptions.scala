package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.EventHeight
import typingsSlinky.devextreme.devextremeStrings.all
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.top
import typingsSlinky.devextreme.mod.DevExpress.DOMComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxResizableOptions extends DOMComponentOptions[dxResizable] {
  /** Specifies which borders of the widget element are used as a handle. */
  var handles: js.UndefOr[bottom | left | right | top | all | String] = js.native
  /** Specifies the upper height boundary for resizing. */
  var maxHeight: js.UndefOr[Double] = js.native
  /** Specifies the upper width boundary for resizing. */
  var maxWidth: js.UndefOr[Double] = js.native
  /** Specifies the lower height boundary for resizing. */
  var minHeight: js.UndefOr[Double] = js.native
  /** Specifies the lower width boundary for resizing. */
  var minWidth: js.UndefOr[Double] = js.native
  /** A function that is executed each time the widget is resized by one pixel. */
  var onResize: js.UndefOr[js.Function1[/* e */ EventHeight, _]] = js.native
  /** A function that is executed when resizing ends. */
  var onResizeEnd: js.UndefOr[js.Function1[/* e */ EventHeight, _]] = js.native
  /** A function that is executed when resizing starts. */
  var onResizeStart: js.UndefOr[js.Function1[/* e */ EventHeight, _]] = js.native
}

object dxResizableOptions {
  @scala.inline
  def apply(): dxResizableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxResizableOptions]
  }
  @scala.inline
  implicit class dxResizableOptionsOps[Self <: dxResizableOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandles(value: bottom | left | right | top | all | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handles")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(value: /* e */ EventHeight => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResizeEnd(value: /* e */ EventHeight => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResizeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResizeStart(value: /* e */ EventHeight => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResizeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeStart")(js.undefined)
        ret
    }
  }
  
}

