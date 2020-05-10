package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElevationLayerCreateElevationSamplerOptions extends Object {
  /**
    * Controls the horizontal resolution (cell size) in meters from which elevation data is sampled (defaults to `auto`). See [ElevationLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation) for more details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#createElevationSampler)
    *
    * @default auto
    */
  var demResolution: js.UndefOr[Double | String] = js.native
  /**
    * The value to use when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#createElevationSampler)
    *
    * @default 0
    */
  var noDataValue: js.UndefOr[Double] = js.native
}

object ElevationLayerCreateElevationSamplerOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ElevationLayerCreateElevationSamplerOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ElevationLayerCreateElevationSamplerOptions]
  }
  @scala.inline
  implicit class ElevationLayerCreateElevationSamplerOptionsOps[Self <: ElevationLayerCreateElevationSamplerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDemResolution(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDemResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demResolution")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDataValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDataValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDataValue")(js.undefined)
        ret
    }
  }
  
}

