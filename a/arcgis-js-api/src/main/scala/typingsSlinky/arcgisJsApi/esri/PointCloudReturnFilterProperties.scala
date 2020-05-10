package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.firstOfMany
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.last
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.lastOfMany
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudReturnFilterProperties extends PointCloudFilterProperties {
  /**
    * An array of return types used to filter points. Possible values for the return types are:
    *
    * Value | Description
    * ------|------------
    * `firstOfMany` | The point was the first to be collected in a series of many returns.
    * `last` | The last point in a series of many returns or a single point.
    * `lastOfMany` | The last point in a series of many returns.
    * `single` | All the points that were collected from laser pulses with a single return.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html#includedReturns)
    */
  var includedReturns: js.UndefOr[js.Array[firstOfMany | last | lastOfMany | single]] = js.native
}

object PointCloudReturnFilterProperties {
  @scala.inline
  def apply(): PointCloudReturnFilterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudReturnFilterProperties]
  }
  @scala.inline
  implicit class PointCloudReturnFilterPropertiesOps[Self <: PointCloudReturnFilterProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludedReturns(value: js.Array[firstOfMany | last | lastOfMany | single]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedReturns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludedReturns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includedReturns")(js.undefined)
        ret
    }
  }
  
}

