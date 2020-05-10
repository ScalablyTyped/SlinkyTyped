package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElevationLayerElevationQueryResult extends Object {
  /**
    * The geometry with sampled z-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#ElevationQueryResult)
    */
  var geometry: Point | Multipoint | Polyline = js.native
  /**
    * The value used when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#ElevationQueryResult)
    */
  var noDataValue: Double = js.native
  /**
    * Contains additional information about how the geometry was sampled. This property is present depending on whether the user set `options.returnSampleInfo = true`, for each coordinate in the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#ElevationQueryResult)
    */
  var sampleInfo: js.UndefOr[js.Array[ElevationLayerElevationQueryResultSampleInfo]] = js.native
}

object ElevationLayerElevationQueryResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    geometry: Point | Multipoint | Polyline,
    hasOwnProperty: PropertyKey => Boolean,
    noDataValue: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ElevationLayerElevationQueryResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), noDataValue = noDataValue.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ElevationLayerElevationQueryResult]
  }
  @scala.inline
  implicit class ElevationLayerElevationQueryResultOps[Self <: ElevationLayerElevationQueryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeometry(value: Point | Multipoint | Polyline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoDataValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSampleInfo(value: js.Array[ElevationLayerElevationQueryResultSampleInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleInfo")(js.undefined)
        ret
    }
  }
  
}

