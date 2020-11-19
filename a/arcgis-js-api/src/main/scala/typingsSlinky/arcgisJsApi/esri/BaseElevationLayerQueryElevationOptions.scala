package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseElevationLayerQueryElevationOptions extends Object {
  
  /**
    * Controls the horizontal resolution (cell size) in meters from which elevation data is sampled (defaults to `auto`). See the table below for more details on the different settings.
    *
    * demResolution          | Description
    * -----------------------|-------------
    * `auto`                 | Automatically chooses an appropriate resolution for each coordinate of the input geometry. The current implementation will try to use the finest available resolution given that the total required number of tile requests does not exceed a certain maximum amount (currently 20). Note that this may result in values being sampled from different resolutions.
    * `finest-contiguous`    | Sample elevation from the finest available resolution (cell size) across the entire geometry.
    * `{number}`             | Sample elevation from the resolution closest to the specified resolution (in meters).
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#queryElevation)
    *
    * @default auto
    */
  var demResolution: js.UndefOr[Double | String] = js.native
  
  /**
    * The value to use when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#queryElevation)
    *
    * @default 0
    */
  var noDataValue: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether to return additional sample information for each coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#queryElevation)
    *
    * @default false
    */
  var returnSampleInfo: js.UndefOr[Boolean] = js.native
}
object BaseElevationLayerQueryElevationOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): BaseElevationLayerQueryElevationOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[BaseElevationLayerQueryElevationOptions]
  }
  
  @scala.inline
  implicit class BaseElevationLayerQueryElevationOptionsOps[Self <: BaseElevationLayerQueryElevationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDemResolution(value: Double | String): Self = this.set("demResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDemResolution: Self = this.set("demResolution", js.undefined)
    
    @scala.inline
    def setNoDataValue(value: Double): Self = this.set("noDataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDataValue: Self = this.set("noDataValue", js.undefined)
    
    @scala.inline
    def setReturnSampleInfo(value: Boolean): Self = this.set("returnSampleInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnSampleInfo: Self = this.set("returnSampleInfo", js.undefined)
  }
}
