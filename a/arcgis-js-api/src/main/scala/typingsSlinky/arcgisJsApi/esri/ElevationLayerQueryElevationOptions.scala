package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.experimental.AbortSignal
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElevationLayerQueryElevationOptions extends Object {
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation)
    *
    * @default auto
    */
  var demResolution: js.UndefOr[Double | String] = js.native
  /**
    * The value to use when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation)
    *
    * @default 0
    */
  var noDataValue: js.UndefOr[Double] = js.native
  /**
    * Indicates whether to return additional sample information for each coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation)
    *
    * @default false
    */
  var returnSampleInfo: js.UndefOr[Boolean] = js.native
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
}

object ElevationLayerQueryElevationOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ElevationLayerQueryElevationOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ElevationLayerQueryElevationOptions]
  }
  @scala.inline
  implicit class ElevationLayerQueryElevationOptionsOps[Self <: ElevationLayerQueryElevationOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withReturnSampleInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnSampleInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnSampleInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnSampleInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSignal(value: AbortSignal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signal")(js.undefined)
        ret
    }
  }
  
}

