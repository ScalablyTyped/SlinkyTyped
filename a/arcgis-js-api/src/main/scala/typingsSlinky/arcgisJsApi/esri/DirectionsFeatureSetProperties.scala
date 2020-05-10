package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsFeatureSetProperties extends FeatureSetProperties {
  /**
    * The extent of the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.native
  /**
    * The geometry type of the FeatureSet.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#geometryType)
    */
  @JSName("geometryType")
  var geometryType_DirectionsFeatureSetProperties: js.UndefOr[polyline] = js.native
  /**
    * A single polyline representing the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#mergedGeometry)
    */
  var mergedGeometry: js.UndefOr[PolylineProperties] = js.native
  /**
    * The ID of the route returned from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#routeId)
    */
  var routeId: js.UndefOr[String] = js.native
  /**
    * Name specified in [RouteParameters.stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#routeName)
    */
  var routeName: js.UndefOr[String] = js.native
  /**
    * Lists additional information about the directions depending on the value of [RouteParameters.directionsOutputType](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsOutputType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#strings)
    */
  var strings: js.UndefOr[js.Array[_]] = js.native
  /**
    * Actual drive time calculated for the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#totalDriveTime)
    */
  var totalDriveTime: js.UndefOr[Double] = js.native
  /**
    * The length of the route as specified in the units set in [RouteParameters.directionsLengthUnits](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsLengthUnits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#totalLength)
    */
  var totalLength: js.UndefOr[Double] = js.native
  /**
    * The total time calculated for the route as specified in the units set in [RouteParameters.directionsTimeAttribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsTimeAttribute).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#totalTime)
    */
  var totalTime: js.UndefOr[Double] = js.native
}

object DirectionsFeatureSetProperties {
  @scala.inline
  def apply(): DirectionsFeatureSetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsFeatureSetProperties]
  }
  @scala.inline
  implicit class DirectionsFeatureSetPropertiesOps[Self <: DirectionsFeatureSetProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtent(value: ExtentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extent")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometryType(value: polyline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryType")(js.undefined)
        ret
    }
    @scala.inline
    def withMergedGeometry(value: PolylineProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergedGeometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMergedGeometry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergedGeometry")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeId")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeName")(js.undefined)
        ret
    }
    @scala.inline
    def withStrings(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalDriveTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalDriveTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalDriveTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalDriveTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalLength")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalTime")(js.undefined)
        ret
    }
  }
  
}

