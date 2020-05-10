package typingsSlinky.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsSummary extends js.Object {
  /**
    * Aggregated number of times users contacted the `Company`
    * for given date range.
    */
  var contactsCount: js.UndefOr[Double] = js.native
  /** Aggregated number of profile views for the `Company` for given date range. */
  var profileViewsCount: js.UndefOr[Double] = js.native
  /**
    * Aggregated number of times users saw the `Company`
    * in Google Partners Search results for given date range.
    */
  var searchViewsCount: js.UndefOr[Double] = js.native
}

object AnalyticsSummary {
  @scala.inline
  def apply(): AnalyticsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyticsSummary]
  }
  @scala.inline
  implicit class AnalyticsSummaryOps[Self <: AnalyticsSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileViewsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileViewsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileViewsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileViewsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchViewsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchViewsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchViewsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchViewsCount")(js.undefined)
        ret
    }
  }
  
}

