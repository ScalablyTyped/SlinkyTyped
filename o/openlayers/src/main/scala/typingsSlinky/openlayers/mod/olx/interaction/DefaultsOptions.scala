package typingsSlinky.openlayers.mod.olx.interaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interactions for the map. Default is `true` for all options.
  */
@js.native
trait DefaultsOptions extends js.Object {
  var altShiftDragRotate: js.UndefOr[Boolean] = js.native
  var constrainResolution: js.UndefOr[Boolean] = js.native
  var doubleClickZoom: js.UndefOr[Boolean] = js.native
  var dragPan: js.UndefOr[Boolean] = js.native
  var keyboard: js.UndefOr[Boolean] = js.native
  var mouseWheelZoom: js.UndefOr[Boolean] = js.native
  var pinchRotate: js.UndefOr[Boolean] = js.native
  var pinchZoom: js.UndefOr[Boolean] = js.native
  var shiftDragZoom: js.UndefOr[Boolean] = js.native
  var zoomDelta: js.UndefOr[Double] = js.native
  var zoomDuration: js.UndefOr[Double] = js.native
}

object DefaultsOptions {
  @scala.inline
  def apply(): DefaultsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultsOptions]
  }
  @scala.inline
  implicit class DefaultsOptionsOps[Self <: DefaultsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltShiftDragRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altShiftDragRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltShiftDragRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altShiftDragRotate")(js.undefined)
        ret
    }
    @scala.inline
    def withConstrainResolution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstrainResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainResolution")(js.undefined)
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
    def withDragPan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragPan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragPan")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseWheelZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseWheelZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withPinchRotate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchRotate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinchRotate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchRotate")(js.undefined)
        ret
    }
    @scala.inline
    def withPinchZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinchZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinchZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withShiftDragZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftDragZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShiftDragZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftDragZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomDuration")(js.undefined)
        ret
    }
  }
  
}

