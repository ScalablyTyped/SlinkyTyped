package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceQuotasRemaining extends js.Object {
  var dailyQuotaTokensRemaining: js.UndefOr[Double] = js.native
  var hourlyQuotaTokensRemaining: js.UndefOr[Double] = js.native
}

object ResourceQuotasRemaining {
  @scala.inline
  def apply(): ResourceQuotasRemaining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceQuotasRemaining]
  }
  @scala.inline
  implicit class ResourceQuotasRemainingOps[Self <: ResourceQuotasRemaining] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDailyQuotaTokensRemaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailyQuotaTokensRemaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDailyQuotaTokensRemaining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dailyQuotaTokensRemaining")(js.undefined)
        ret
    }
    @scala.inline
    def withHourlyQuotaTokensRemaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyQuotaTokensRemaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourlyQuotaTokensRemaining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourlyQuotaTokensRemaining")(js.undefined)
        ret
    }
  }
  
}

