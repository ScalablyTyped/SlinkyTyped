package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtentProperties extends GeometryProperties {
  /**
    * The maximum possible `m` value in an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#mmax)
    *
    * @default undefined
    */
  var mmax: js.UndefOr[Double] = js.native
  /**
    * The minimum possible `m` value of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#mmin)
    *
    * @default undefined
    */
  var mmin: js.UndefOr[Double] = js.native
  /**
    * The maximum X-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmax)
    *
    * @default 0
    */
  var xmax: js.UndefOr[Double] = js.native
  /**
    * The minimum X-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmin)
    *
    * @default 0
    */
  var xmin: js.UndefOr[Double] = js.native
  /**
    * The maximum Y-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymax)
    *
    * @default 0
    */
  var ymax: js.UndefOr[Double] = js.native
  /**
    * The minimum Y-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymin)
    *
    * @default 0
    */
  var ymin: js.UndefOr[Double] = js.native
  /**
    * The maximum possible `z`, or elevation, value in an extent envelope.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#zmax)
    *
    * @default undefined
    */
  var zmax: js.UndefOr[Double] = js.native
  /**
    * The minimum possible `z`, or elevation, value of an extent envelope.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#zmin)
    *
    * @default undefined
    */
  var zmin: js.UndefOr[Double] = js.native
}

object ExtentProperties {
  @scala.inline
  def apply(): ExtentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtentProperties]
  }
  @scala.inline
  implicit class ExtentPropertiesOps[Self <: ExtentProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMmax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMmax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mmax")(js.undefined)
        ret
    }
    @scala.inline
    def withMmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mmin")(js.undefined)
        ret
    }
    @scala.inline
    def withXmax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmax")(js.undefined)
        ret
    }
    @scala.inline
    def withXmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmin")(js.undefined)
        ret
    }
    @scala.inline
    def withYmax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ymax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYmax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ymax")(js.undefined)
        ret
    }
    @scala.inline
    def withYmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ymin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ymin")(js.undefined)
        ret
    }
    @scala.inline
    def withZmax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZmax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zmax")(js.undefined)
        ret
    }
    @scala.inline
    def withZmin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zmin")(js.undefined)
        ret
    }
  }
  
}

