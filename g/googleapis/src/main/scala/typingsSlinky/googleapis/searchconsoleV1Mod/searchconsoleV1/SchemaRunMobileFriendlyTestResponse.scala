package typingsSlinky.googleapis.searchconsoleV1Mod.searchconsoleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mobile-friendly test response, including mobile-friendly issues and
  * resource issues.
  */
@js.native
trait SchemaRunMobileFriendlyTestResponse extends js.Object {
  /**
    * Test verdict, whether the page is mobile friendly or not.
    */
  var mobileFriendliness: js.UndefOr[String] = js.native
  /**
    * List of mobile-usability issues.
    */
  var mobileFriendlyIssues: js.UndefOr[js.Array[SchemaMobileFriendlyIssue]] = js.native
  /**
    * Information about embedded resources issues.
    */
  var resourceIssues: js.UndefOr[js.Array[SchemaResourceIssue]] = js.native
  /**
    * Screenshot of the requested URL.
    */
  var screenshot: js.UndefOr[SchemaImage] = js.native
  /**
    * Final state of the test, can be either complete or an error.
    */
  var testStatus: js.UndefOr[SchemaTestStatus] = js.native
}

object SchemaRunMobileFriendlyTestResponse {
  @scala.inline
  def apply(): SchemaRunMobileFriendlyTestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunMobileFriendlyTestResponse]
  }
  @scala.inline
  implicit class SchemaRunMobileFriendlyTestResponseOps[Self <: SchemaRunMobileFriendlyTestResponse] (val x: Self) extends AnyVal {
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
    def withMobileFriendlyIssues(value: js.Array[SchemaMobileFriendlyIssue]): Self = {
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
    def withResourceIssues(value: js.Array[SchemaResourceIssue]): Self = {
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
    def withScreenshot(value: SchemaImage): Self = {
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
    def withTestStatus(value: SchemaTestStatus): Self = {
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

