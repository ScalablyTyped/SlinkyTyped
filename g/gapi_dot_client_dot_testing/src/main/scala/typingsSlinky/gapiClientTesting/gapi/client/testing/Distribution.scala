package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distribution extends js.Object {
  /**
    * The estimated fraction (0-1) of the total market with this configuration.
    * @OutputOnly
    */
  var marketShare: js.UndefOr[Double] = js.native
  /**
    * The time this distribution was measured.
    * @OutputOnly
    */
  var measurementTime: js.UndefOr[String] = js.native
}

object Distribution {
  @scala.inline
  def apply(): Distribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Distribution]
  }
  @scala.inline
  implicit class DistributionOps[Self <: Distribution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarketShare(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketShare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarketShare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marketShare")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasurementTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurementTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasurementTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurementTime")(js.undefined)
        ret
    }
  }
  
}

