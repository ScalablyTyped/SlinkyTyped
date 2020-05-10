package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficPercentStrategy extends js.Object {
  /**
    * Maps service configuration IDs to their corresponding traffic percentage.
    * Key is the service configuration ID, Value is the traffic percentage
    * which must be greater than 0.0 and the sum must equal to 100.0.
    */
  var percentages: js.UndefOr[Record[String, Double]] = js.native
}

object TrafficPercentStrategy {
  @scala.inline
  def apply(): TrafficPercentStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficPercentStrategy]
  }
  @scala.inline
  implicit class TrafficPercentStrategyOps[Self <: TrafficPercentStrategy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPercentages(value: Record[String, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentages")(js.undefined)
        ret
    }
  }
  
}

