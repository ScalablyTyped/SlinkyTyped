package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraProperties extends js.Object {
  /**
    * The field of view of the camera in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#fov)
    *
    * @default 55
    */
  var fov: js.UndefOr[Double] = js.native
  /**
    * The compass heading of the camera in degrees. Heading is zero when north is the top of the screen. It increases as the view rotates clockwise. The angles are always normalized between 0 and 360 degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading)
    *
    * @default 0
    */
  var heading: js.UndefOr[Double] = js.native
  /**
    * The position of the camera defined by a map point.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#position)
    */
  var position: js.UndefOr[PointProperties] = js.native
  /**
    * The tilt of the camera in degrees with respect to the surface as projected down from the camera position. Tilt is zero when looking straight down at the surface and 90 degrees when the camera is looking parallel to the surface.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#tilt)
    *
    * @default 0
    */
  var tilt: js.UndefOr[Double] = js.native
}

object CameraProperties {
  @scala.inline
  def apply(): CameraProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraProperties]
  }
  @scala.inline
  implicit class CameraPropertiesOps[Self <: CameraProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFov(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fov")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFov: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fov")(js.undefined)
        ret
    }
    @scala.inline
    def withHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: PointProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withTilt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTilt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilt")(js.undefined)
        ret
    }
  }
  
}

