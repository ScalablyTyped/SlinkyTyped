package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAreaSolveResultProperties extends js.Object {
  /**
    * Array of points only returned if `ServiceAreaParameters.returnFacilities = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#facilities)
    */
  var facilities: js.UndefOr[js.Array[PointProperties]] = js.native
  /**
    * Message received when solve is completed. If a service area cannot be solved, the message returned by the server identifies the incident that could not be solved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#messages)
    */
  var messages: js.UndefOr[js.Array[NAMessageProperties]] = js.native
  /**
    * The point barriers are returned only if `ServiceAreaParameters.returnPointBarriers = true` (which is not the default). If you send in the point barriers as a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) (instead of using [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html)), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[js.Array[PointProperties]] = js.native
  /**
    * The polygon barriers are returned only if `ServiceAreaParameters.returnPolygonBarriers = true` (which is not the default). If you send in the polygon barriers as a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) (instead of using [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html)), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[js.Array[PolygonProperties]] = js.native
  /**
    * The polyline barriers are returned only if `ServiceAreaParameters.returnPolylineBarriers = true` (which is not the default). If you send in the polyline barriers as a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) (instead of using [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html)), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[js.Array[PolylineProperties]] = js.native
  /**
    * An array of service area polygon graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#serviceAreaPolygons)
    */
  var serviceAreaPolygons: js.UndefOr[js.Array[GraphicProperties]] = js.native
  /**
    * An array of service area polyline graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#serviceAreaPolylines)
    */
  var serviceAreaPolylines: js.UndefOr[js.Array[GraphicProperties]] = js.native
}

object ServiceAreaSolveResultProperties {
  @scala.inline
  def apply(): ServiceAreaSolveResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAreaSolveResultProperties]
  }
  @scala.inline
  implicit class ServiceAreaSolveResultPropertiesOps[Self <: ServiceAreaSolveResultProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withServiceAreaPolygons(value: js.Array[GraphicProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAreaPolygons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAreaPolygons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAreaPolygons")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAreaPolylines(value: js.Array[GraphicProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAreaPolylines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAreaPolylines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAreaPolylines")(js.undefined)
        ret
    }
  }
  
}

