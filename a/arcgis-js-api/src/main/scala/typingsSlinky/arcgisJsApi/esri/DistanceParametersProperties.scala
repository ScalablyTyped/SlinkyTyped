package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.feet_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.meters_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.miles_
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceParametersProperties extends js.Object {
  /**
    * Specifies the units for measuring distance between [geometry1](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry1) and [geometry2](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry2). If the unit is not specified the units are derived from the spatial reference. For a list of valid units, see [esriSRUnitType Constants](http://resources.arcgis.com/en/help/arcobjects-cpp/componenthelp/index.html#/esriSRUnitType_Constants/000w00000042000000/) and [esriSRUnit2Type Constants](http://resources.arcgis.com/en/help/arcobjects-cpp/componenthelp/index.html#/esriSRUnit2Type_Constants/000w00000041000000/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#distanceUnit)
    */
  var distanceUnit: js.UndefOr[feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards] = js.native
  /**
    * When `true`, the geodesic distance between [geometry1](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry1) and [geometry2](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry2) is measured.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geodesic)
    */
  var geodesic: js.UndefOr[Boolean] = js.native
  /**
    * The geometry from which the distance is to be measured. The geometry can be a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html), or a [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry1)
    */
  var geometry1: js.UndefOr[GeometryProperties] = js.native
  /**
    * The geometry to which the distance is to be measured. The geometry can be a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html), or a [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DistanceParameters.html#geometry2)
    */
  var geometry2: js.UndefOr[GeometryProperties] = js.native
}

object DistanceParametersProperties {
  @scala.inline
  def apply(): DistanceParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceParametersProperties]
  }
  @scala.inline
  implicit class DistanceParametersPropertiesOps[Self <: DistanceParametersProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistanceUnit(value: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withGeodesic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geodesic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeodesic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geodesic")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometry1(value: GeometryProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometry1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry1")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometry2(value: GeometryProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometry2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry2")(js.undefined)
        ret
    }
  }
  
}

