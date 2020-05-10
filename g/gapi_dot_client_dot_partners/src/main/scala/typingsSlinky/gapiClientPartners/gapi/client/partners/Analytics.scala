package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analytics extends js.Object {
  /**
    * Instances of users contacting the `Company`
    * on the specified date.
    */
  var contacts: js.UndefOr[AnalyticsDataPoint] = js.native
  /** Date on which these events occurred. */
  var eventDate: js.UndefOr[Date] = js.native
  /**
    * Instances of users viewing the `Company` profile
    * on the specified date.
    */
  var profileViews: js.UndefOr[AnalyticsDataPoint] = js.native
  /**
    * Instances of users seeing the `Company` in Google Partners Search results
    * on the specified date.
    */
  var searchViews: js.UndefOr[AnalyticsDataPoint] = js.native
}

object Analytics {
  @scala.inline
  def apply(): Analytics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Analytics]
  }
  @scala.inline
  implicit class AnalyticsOps[Self <: Analytics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContacts(value: AnalyticsDataPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contacts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContacts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contacts")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDate(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDate")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileViews(value: AnalyticsDataPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileViews")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchViews(value: AnalyticsDataPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchViews: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchViews")(js.undefined)
        ret
    }
  }
  
}

