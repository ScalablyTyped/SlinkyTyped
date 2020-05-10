package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewpointProperties extends js.Object {
  /**
    * The viewpoint camera (3D only).
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#camera)
    */
  var camera: js.UndefOr[CameraProperties] = js.native
  /**
    * The rotation of due north in relation to the top of the view in degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#rotation)
    *
    * @default 0
    */
  var rotation: js.UndefOr[Double] = js.native
  /**
    * The scale of the viewpoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#scale)
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * The target geometry framed by the viewpoint.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#targetGeometry)
    */
  var targetGeometry: js.UndefOr[GeometryProperties] = js.native
}

object ViewpointProperties {
  @scala.inline
  def apply(): ViewpointProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewpointProperties]
  }
  @scala.inline
  implicit class ViewpointPropertiesOps[Self <: ViewpointProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCamera(value: CameraProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamera: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetGeometry(value: GeometryProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGeometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetGeometry")(js.undefined)
        ret
    }
  }
  
}

