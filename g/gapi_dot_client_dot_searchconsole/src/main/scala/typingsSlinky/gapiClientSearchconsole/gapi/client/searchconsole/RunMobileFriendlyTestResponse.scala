package typingsSlinky.gapiClientSearchconsole.gapi.client.searchconsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunMobileFriendlyTestResponse extends js.Object {
  /** Test verdict, whether the page is mobile friendly or not. */
  var mobileFriendliness: js.UndefOr[String] = js.native
  /** List of mobile-usability issues. */
  var mobileFriendlyIssues: js.UndefOr[js.Array[MobileFriendlyIssue]] = js.native
  /** Information about embedded resources issues. */
  var resourceIssues: js.UndefOr[js.Array[ResourceIssue]] = js.native
  /** Screenshot of the requested URL. */
  var screenshot: js.UndefOr[Image] = js.native
  /** Final state of the test, can be either complete or an error. */
  var testStatus: js.UndefOr[TestStatus] = js.native
}

object RunMobileFriendlyTestResponse {
  @scala.inline
  def apply(): RunMobileFriendlyTestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunMobileFriendlyTestResponse]
  }
  @scala.inline
  implicit class RunMobileFriendlyTestResponseOps[Self <: RunMobileFriendlyTestResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMobileFriendliness(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileFriendliness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileFriendliness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileFriendliness")(js.undefined)
        ret
    }
    @scala.inline
    def withMobileFriendlyIssues(value: js.Array[MobileFriendlyIssue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileFriendlyIssues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileFriendlyIssues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileFriendlyIssues")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceIssues(value: js.Array[ResourceIssue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIssues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceIssues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceIssues")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenshot(value: Image): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshot")(js.undefined)
        ret
    }
    @scala.inline
    def withTestStatus(value: TestStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testStatus")(js.undefined)
        ret
    }
  }
  
}

