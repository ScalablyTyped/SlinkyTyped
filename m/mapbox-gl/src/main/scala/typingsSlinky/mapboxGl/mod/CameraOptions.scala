package typingsSlinky.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraOptions extends js.Object {
  /** If zooming, the zoom center (defaults to map center) */
  var around: js.UndefOr[LngLatLike] = js.native
  /** Map rotation bearing in degrees counter-clockwise from north */
  var bearing: js.UndefOr[Double] = js.native
  /** Map center */
  var center: js.UndefOr[LngLatLike] = js.native
  /** Map angle in degrees at which the camera is looking at the ground */
  var pitch: js.UndefOr[Double] = js.native
  /** Map zoom level */
  var zoom: js.UndefOr[Double] = js.native
}

object CameraOptions {
  @scala.inline
  def apply(): CameraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraOptions]
  }
  @scala.inline
  implicit class CameraOptionsOps[Self <: CameraOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAround(value: LngLatLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("around")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("around")(js.undefined)
        ret
    }
    @scala.inline
    def withBearing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBearing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearing")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: LngLatLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withPitch(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitch")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

