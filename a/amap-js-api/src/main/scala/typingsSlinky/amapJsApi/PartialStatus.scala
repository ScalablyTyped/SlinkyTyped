package typingsSlinky.amapJsApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<amap-js-api.AMap.Map.Status> */
@js.native
trait PartialStatus extends js.Object {
  var animateEnable: js.UndefOr[Boolean] = js.native
  var doubleClickZoom: js.UndefOr[Boolean] = js.native
  var dragEnable: js.UndefOr[Boolean] = js.native
  var isHotspot: js.UndefOr[Boolean] = js.native
  var jogEnable: js.UndefOr[Boolean] = js.native
  var keyboardEnable: js.UndefOr[Boolean] = js.native
  var pitchEnable: js.UndefOr[Boolean] = js.native
  var resizeEnable: js.UndefOr[Boolean] = js.native
  var rotateEnable: js.UndefOr[Boolean] = js.native
  var scrollWheel: js.UndefOr[Boolean] = js.native
  var touchZoom: js.UndefOr[Boolean] = js.native
  var zoomEnable: js.UndefOr[Boolean] = js.native
}

object PartialStatus {
  @scala.inline
  def apply(): PartialStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStatus]
  }
  @scala.inline
  implicit class PartialStatusOps[Self <: PartialStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimateEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleClickZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleClickZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleClickZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withDragEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHotspot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHotspot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHotspot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHotspot")(js.undefined)
        ret
    }
    @scala.inline
    def withJogEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jogEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJogEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jogEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withPitchEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitchEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withRotateEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotateEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotateEnable")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollWheel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withTouchZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouchZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnable")(js.undefined)
        ret
    }
  }
  
}

