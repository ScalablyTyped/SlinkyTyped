package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.firstOfMany
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.last
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.lastOfMany
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var includedReturns: js.UndefOr[js.Array[firstOfMany | last | lastOfMany | single]] = js.undefined
}

object PointCloudReturnFilterProperties {
  @scala.inline
  def apply(field: String = null, includedReturns: js.Array[firstOfMany | last | lastOfMany | single] = null): PointCloudReturnFilterProperties = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (includedReturns != null) __obj.updateDynamic("includedReturns")(includedReturns.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointCloudReturnFilterProperties]
  }
}

