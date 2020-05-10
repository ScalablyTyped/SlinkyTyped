package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListContributorInsightsOutput extends js.Object {
  /**
    * A list of ContributorInsightsSummary.
    */
  var ContributorInsightsSummaries: js.UndefOr[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.ContributorInsightsSummaries
  ] = js.native
  /**
    * A token to go to the next page if there is one.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.native
}

object ListContributorInsightsOutput {
  @scala.inline
  def apply(): ListContributorInsightsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContributorInsightsOutput]
  }
  @scala.inline
  implicit class ListContributorInsightsOutputOps[Self <: ListContributorInsightsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContributorInsightsSummaries(value: ContributorInsightsSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContributorInsightsSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContributorInsightsSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContributorInsightsSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextTokenString): Self = {
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

