package typingsSlinky.materialUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHandleColorZero extends js.Object {
  var handleColorZero: js.UndefOr[String] = js.native
  var handleFillColor: js.UndefOr[String] = js.native
  var handleSize: js.UndefOr[Double] = js.native
  var handleSizeActive: js.UndefOr[Double] = js.native
  var handleSizeDisabled: js.UndefOr[Double] = js.native
  var rippleColor: js.UndefOr[String] = js.native
  var selectionColor: js.UndefOr[String] = js.native
  var trackColor: js.UndefOr[String] = js.native
  var trackColorSelected: js.UndefOr[String] = js.native
  var trackSize: js.UndefOr[Double] = js.native
}

object AnonHandleColorZero {
  @scala.inline
  def apply(): AnonHandleColorZero = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHandleColorZero]
  }
  @scala.inline
  implicit class AnonHandleColorZeroOps[Self <: AnonHandleColorZero] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleColorZero(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleColorZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleColorZero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleColorZero")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleFillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleSizeActive(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSizeActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleSizeActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSizeActive")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleSizeDisabled(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSizeDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleSizeDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSizeDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRippleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRippleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rippleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackColorSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackColorSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackColorSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackColorSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackSize")(js.undefined)
        ret
    }
  }
  
}

