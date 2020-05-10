package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceStatsGetindex extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Day of month. Must be from 1 to 31 and valid for the year and month.
    */
  @JSName("fromDate.day")
  var fromDateDotday: js.UndefOr[Double] = js.native
  /**
    * Month of date. Must be from 1 to 12.
    */
  @JSName("fromDate.month")
  var fromDateDotmonth: js.UndefOr[Double] = js.native
  /**
    * Year of date. Must be from 1 to 9999.
    */
  @JSName("fromDate.year")
  var fromDateDotyear: js.UndefOr[Double] = js.native
  /**
    * Day of month. Must be from 1 to 31 and valid for the year and month.
    */
  @JSName("toDate.day")
  var toDateDotday: js.UndefOr[Double] = js.native
  /**
    * Month of date. Must be from 1 to 12.
    */
  @JSName("toDate.month")
  var toDateDotmonth: js.UndefOr[Double] = js.native
  /**
    * Year of date. Must be from 1 to 9999.
    */
  @JSName("toDate.year")
  var toDateDotyear: js.UndefOr[Double] = js.native
}

object ParamsResourceStatsGetindex {
  @scala.inline
  def apply(): ParamsResourceStatsGetindex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceStatsGetindex]
  }
  @scala.inline
  implicit class ParamsResourceStatsGetindexOps[Self <: ParamsResourceStatsGetindex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withFromDateDotday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDate.day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromDateDotday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDate.day")(js.undefined)
        ret
    }
    @scala.inline
    def withFromDateDotmonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDate.month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromDateDotmonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDate.month")(js.undefined)
        ret
    }
    @scala.inline
    def withFromDateDotyear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDate.year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromDateDotyear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromDate.year")(js.undefined)
        ret
    }
    @scala.inline
    def withToDateDotday(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate.day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToDateDotday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate.day")(js.undefined)
        ret
    }
    @scala.inline
    def withToDateDotmonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate.month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToDateDotmonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate.month")(js.undefined)
        ret
    }
    @scala.inline
    def withToDateDotyear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate.year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToDateDotyear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate.year")(js.undefined)
        ret
    }
  }
  
}

