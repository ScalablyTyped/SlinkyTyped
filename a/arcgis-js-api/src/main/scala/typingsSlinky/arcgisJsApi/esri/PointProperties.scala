package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointProperties extends GeometryProperties {
  /**
    * The latitude of the point. If the spatial reference is Web Mercator, the latitude will be given in WGS84. In any geographic spatial reference, the latitude will equal the [y](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#y) coordinate. In all other cases the latitude will be null.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#latitude)
    */
  var latitude: js.UndefOr[Double] = js.native
  /**
    * The longitude of the point. If the spatial reference is Web Mercator, the longitude will be given in WGS84. In any geographic spatial reference, the longitude will equal the [x](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#x) coordinate. In all other cases the longitude will be null.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#longitude)
    */
  var longitude: js.UndefOr[Double] = js.native
  /**
    * The m-coordinate of the point in map units.
    * > **M-values** (measure) allow attribute values to be stored at the vertex of a point. A common usage for storing a measurement in the vertices along a linear feature are [linear referencing](https://desktop.arcgis.com/en/arcmap/latest/extensions/roads-and-highways/advanced-linear-referencing-multiple-linear-referencing-methods.htm) applications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#m)
    *
    * @default undefined
    */
  var m: js.UndefOr[Double] = js.native
  /**
    * The x-coordinate (easting) of the point in map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#x)
    *
    * @default 0
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The y-coordinate (northing) of the point in map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#y)
    *
    * @default 0
    */
  var y: js.UndefOr[Double] = js.native
  /**
    * The z-coordinate (or elevation) of the point in map units.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#z)
    *
    * @default undefined
    */
  var z: js.UndefOr[Double] = js.native
}

object PointProperties {
  @scala.inline
  def apply(): PointProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointProperties]
  }
  @scala.inline
  implicit class PointPropertiesOps[Self <: PointProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(js.undefined)
        ret
    }
    @scala.inline
    def withM(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withZ(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("z")(js.undefined)
        ret
    }
  }
  
}

