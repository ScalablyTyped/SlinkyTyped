package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationsResponse extends js.Object {
  /**
    * A list of ApplicationSummary objects.
    */
  var ApplicationSummaries: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationSummaries = js.native
  /**
    * The pagination token for the next set of results, or null if there are no additional results. Pass this token into a subsequent command to retrieve the next set of items For more information about pagination, see Using the AWS Command Line Interface's Pagination Options.
    */
  var NextToken: js.UndefOr[ApplicationName] = js.native
}

object ListApplicationsResponse {
  @scala.inline
  def apply(ApplicationSummaries: ApplicationSummaries): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal(ApplicationSummaries = ApplicationSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationsResponse]
  }
  @scala.inline
  implicit class ListApplicationsResponseOps[Self <: ListApplicationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationSummaries(value: ApplicationSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: ApplicationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

