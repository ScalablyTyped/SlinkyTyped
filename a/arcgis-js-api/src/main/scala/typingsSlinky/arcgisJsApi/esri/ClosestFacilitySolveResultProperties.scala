package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClosestFacilitySolveResultProperties extends js.Object {
  /**
    * An array of directions. A direction is an instance of [DirectionsFeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html). Route directions are returned if `returnDirections = true` (default is false).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#directions)
    */
  var directions: js.UndefOr[DirectionsFeatureSetProperties] = js.native
  /**
    * An array of points representing facilities. Only returned when `ClosestFacilityParameters.returnFacilities = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#facilities)
    */
  var facilities: js.UndefOr[js.Array[PointProperties]] = js.native
  /**
    * An array of points representing incidents. Only returned when `ClosestFacilityParameters.returnIncidents = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#incidents)
    */
  var incidents: js.UndefOr[js.Array[PointProperties]] = js.native
  /**
    * Message received when the solve is complete. If a closest facility cannot be solved, the message returned by the server identifies the incident that could not be solved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#messages)
    */
  var messages: js.UndefOr[js.Array[NAMessageProperties]] = js.native
  /**
    * The point barriers are an array of points. They are returned only if `ClosestFacilityParameters.returnPointBarriers` was set to `true` (which is not the default). If you send in the point barriers as a FeatureSet (instead of using DataLayer), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[js.Array[PointProperties]] = js.native
  /**
    * The polygon barriers are an array of polygons. They are returned only if `ClosestFacilityParameters.returnPolygonBarriers` was set to `true` (which is not the default). If you send in the polygon barriers as a FeatureSet (instead of using DataLayer), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[js.Array[PolygonProperties]] = js.native
  /**
    * The polyline barriers are an array of polylines. They are returned only if `ClosestFacilityParameters.returnPolylineBarriers` was set to `true` (which is not the default). If you send in the polyline barriers as a FeatureSet (instead of using DataLayer), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[js.Array[PolylineProperties]] = js.native
  /**
    * The array of routes. Route graphics are returned if `returnRoutes = true` and `outputLines` does not equal `none`. From version 2.0 to 2.5 the type is an array of Polylines. At version 2.6 the type is an array of Graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#routes)
    */
  var routes: js.UndefOr[js.Array[GraphicProperties]] = js.native
}

object ClosestFacilitySolveResultProperties {
  @scala.inline
  def apply(): ClosestFacilitySolveResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosestFacilitySolveResultProperties]
  }
  @scala.inline
  implicit class ClosestFacilitySolveResultPropertiesOps[Self <: ClosestFacilitySolveResultProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirections(value: DirectionsFeatureSetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directions")(js.undefined)
        ret
    }
    @scala.inline
    def withFacilities(value: js.Array[PointProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFacilities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facilities")(js.undefined)
        ret
    }
    @scala.inline
    def withIncidents(value: js.Array[PointProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incidents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncidents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incidents")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: js.Array[NAMessageProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withPointBarriers(value: js.Array[PointProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBarriers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointBarriers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointBarriers")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygonBarriers(value: js.Array[PolygonProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonBarriers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonBarriers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonBarriers")(js.undefined)
        ret
    }
    @scala.inline
    def withPolylineBarriers(value: js.Array[PolylineProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineBarriers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolylineBarriers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineBarriers")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutes(value: js.Array[GraphicProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(js.undefined)
        ret
    }
  }
  
}

