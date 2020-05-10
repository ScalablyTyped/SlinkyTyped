package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The resource quota tokens remaining for the property after the request is
  * completed.
  */
@js.native
trait SchemaResourceQuotasRemaining extends js.Object {
  /**
    * Daily resource quota remaining remaining.
    */
  var dailyQuotaTokensRemaining: js.UndefOr[Double] = js.native
  /**
    * Hourly resource quota tokens remaining.
    */
  var hourlyQuotaTokensRemaining: js.UndefOr[Double] = js.native
}

object SchemaResourceQuotasRemaining {
  @scala.inline
  def apply(): SchemaResourceQuotasRemaining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceQuotasRemaining]
  }
  @scala.inline
  implicit class SchemaResourceQuotasRemainingOps[Self <: SchemaResourceQuotasRemaining] (val x: Self) extends AnyVal {
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

