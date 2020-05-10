package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountStatusDataQualityIssue extends js.Object {
  /** Country for which this issue is reported. */
  var country: js.UndefOr[String] = js.native
  /** A more detailed description of the issue. */
  var detail: js.UndefOr[String] = js.native
  /** Actual value displayed on the landing page. */
  var displayedValue: js.UndefOr[String] = js.native
  /** Example items featuring the issue. */
  var exampleItems: js.UndefOr[js.Array[AccountStatusExampleItem]] = js.native
  /** Issue identifier. */
  var id: js.UndefOr[String] = js.native
  /** Last time the account was checked for this issue. */
  var lastChecked: js.UndefOr[String] = js.native
  /** The attribute name that is relevant for the issue. */
  var location: js.UndefOr[String] = js.native
  /** Number of items in the account found to have the said issue. */
  var numItems: js.UndefOr[Double] = js.native
  /** Severity of the problem. */
  var severity: js.UndefOr[String] = js.native
  /** Submitted value that causes the issue. */
  var submittedValue: js.UndefOr[String] = js.native
}

object AccountStatusDataQualityIssue {
  @scala.inline
  def apply(): AccountStatusDataQualityIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountStatusDataQualityIssue]
  }
  @scala.inline
  implicit class AccountStatusDataQualityIssueOps[Self <: AccountStatusDataQualityIssue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
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
    def withDisplayedValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withExampleItems(value: js.Array[AccountStatusExampleItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exampleItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExampleItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exampleItems")(js.undefined)
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
    def withLastChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastChecked")(js.undefined)
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
    def withNumItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numItems")(js.undefined)
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
    def withSubmittedValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submittedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmittedValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submittedValue")(js.undefined)
        ret
    }
  }
  
}

