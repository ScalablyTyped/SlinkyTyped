package typingsSlinky.pulumiAws.outputMod.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlanQuotaSettings extends js.Object {
  /**
    * The maximum number of requests that can be made in a given time period.
    */
  var limit: Double = js.native
  /**
    * The number of requests subtracted from the given limit in the initial time period.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * The time period in which the limit applies. Valid values are "DAY", "WEEK" or "MONTH".
    */
  var period: String = js.native
}

object UsagePlanQuotaSettings {
  @scala.inline
  def apply(limit: Double, period: String): UsagePlanQuotaSettings = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlanQuotaSettings]
  }
  @scala.inline
  implicit class UsagePlanQuotaSettingsOps[Self <: UsagePlanQuotaSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeriod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
  }
  
}

