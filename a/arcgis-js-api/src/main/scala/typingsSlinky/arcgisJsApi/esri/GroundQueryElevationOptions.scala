package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroundQueryElevationOptions extends Object {
  /**
    * The value that appears in the resulting geometry when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#queryElevation)
    *
    * @default 0
    */
  var noDataValue: js.UndefOr[Double] = js.native
  /**
    * Indicates whether to return additional sample information for each sampled coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#queryElevation)
    *
    * @default false
    */
  var returnSampleInfo: js.UndefOr[Boolean] = js.native
}

object GroundQueryElevationOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GroundQueryElevationOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[GroundQueryElevationOptions]
  }
  @scala.inline
  implicit class GroundQueryElevationOptionsOps[Self <: GroundQueryElevationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

