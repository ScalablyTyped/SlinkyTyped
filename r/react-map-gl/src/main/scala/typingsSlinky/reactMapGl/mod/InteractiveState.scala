package typingsSlinky.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractiveState extends js.Object {
  var startBearing: js.UndefOr[Double] = js.native
  var startPanLngLat: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var startPitch: js.UndefOr[Double] = js.native
  var startZoom: js.UndefOr[Double] = js.native
  var startZoomLngLat: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object InteractiveState {
  @scala.inline
  def apply(): InteractiveState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractiveState]
  }
  @scala.inline
  implicit class InteractiveStateOps[Self <: InteractiveState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartBearing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startBearing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartBearing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startBearing")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPanLngLat(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPanLngLat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPanLngLat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPanLngLat")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startPitch")(js.undefined)
        ret
    }
    @scala.inline
    def withStartZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withStartZoomLngLat(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startZoomLngLat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartZoomLngLat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startZoomLngLat")(js.undefined)
        ret
    }
  }
  
}

