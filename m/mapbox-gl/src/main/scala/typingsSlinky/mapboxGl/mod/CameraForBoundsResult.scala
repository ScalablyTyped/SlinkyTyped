package typingsSlinky.mapboxGl.mod

import typingsSlinky.mapboxGl.AnonLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<mapbox-gl.mapbox-gl.CameraOptions, 'zoom' | 'bearing'>> & {  center  :{  lng  :number,   lat  :number}} */
@js.native
trait CameraForBoundsResult extends js.Object {
  var bearing: Double = js.native
  /** Map center */
  var center: AnonLat = js.native
  var zoom: Double = js.native
}

object CameraForBoundsResult {
  @scala.inline
  def apply(bearing: Double, center: AnonLat, zoom: Double): CameraForBoundsResult = {
    val __obj = js.Dynamic.literal(bearing = bearing.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraForBoundsResult]
  }
  @scala.inline
  implicit class CameraForBoundsResultOps[Self <: CameraForBoundsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBearing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bearing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenter(value: AnonLat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

