package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductStatusDataQualityIssue extends js.Object {
  /** A more detailed error string. */
  var detail: js.UndefOr[String] = js.native
  /** The fetch status for landing_page_errors. */
  var fetchStatus: js.UndefOr[String] = js.native
  /** The id of the data quality issue. */
  var id: js.UndefOr[String] = js.native
  /** The attribute name that is relevant for the issue. */
  var location: js.UndefOr[String] = js.native
  /** The severity of the data quality issue. */
  var severity: js.UndefOr[String] = js.native
  /** The time stamp of the data quality issue. */
  var timestamp: js.UndefOr[String] = js.native
  /** The value of that attribute that was found on the landing page */
  var valueOnLandingPage: js.UndefOr[String] = js.native
  /** The value the attribute had at time of evaluation. */
  var valueProvided: js.UndefOr[String] = js.native
}

object ProductStatusDataQualityIssue {
  @scala.inline
  def apply(): ProductStatusDataQualityIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductStatusDataQualityIssue]
  }
  @scala.inline
  implicit class ProductStatusDataQualityIssueOps[Self <: ProductStatusDataQualityIssue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detail")(js.undefined)
        ret
    }
    @scala.inline
    def withFetchStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withSeverity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("severity")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withValueOnLandingPage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueOnLandingPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueOnLandingPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueOnLandingPage")(js.undefined)
        ret
    }
    @scala.inline
    def withValueProvided(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueProvided")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueProvided: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueProvided")(js.undefined)
        ret
    }
  }
  
}

