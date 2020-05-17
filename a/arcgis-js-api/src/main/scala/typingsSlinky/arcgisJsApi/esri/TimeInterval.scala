package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.centuries
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.days
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.decades
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.hours
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.milliseconds
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.minutes
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.months
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.seconds
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.weeks
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeInterval extends JSONSupport {
  /**
    * Temporal units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#unit)
    *
    * @default milliseconds
    */
  var unit: milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries = js.native
  /**
    * The numerical value of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html#value)
    *
    * @default 0
    */
  var value: Double = js.native
}

object TimeInterval {
  @scala.inline
  def apply(
    toJSON: () => js.Any,
    unit: milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries,
    value: Double
  ): TimeInterval = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON), unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeInterval]
  }
  @scala.inline
  implicit class TimeIntervalOps[Self <: TimeInterval] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnit(
      value: milliseconds | seconds | minutes | hours | days | weeks | months | years | decades | centuries
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

