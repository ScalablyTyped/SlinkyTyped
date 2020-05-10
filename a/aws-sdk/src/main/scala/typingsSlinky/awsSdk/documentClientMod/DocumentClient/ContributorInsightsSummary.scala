package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContributorInsightsSummary extends js.Object {
  /**
    * Describes the current status for contributor insights for the given table and index, if applicable.
    */
  var ContributorInsightsStatus: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ContributorInsightsStatus] = js.native
  /**
    * Name of the index associated with the summary, if any.
    */
  var IndexName: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
  /**
    * Name of the table associated with the summary.
    */
  var TableName: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
}

object ContributorInsightsSummary {
  @scala.inline
  def apply(): ContributorInsightsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContributorInsightsSummary]
  }
  @scala.inline
  implicit class ContributorInsightsSummaryOps[Self <: ContributorInsightsSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContributorInsightsStatus(value: ContributorInsightsStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContributorInsightsStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContributorInsightsStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContributorInsightsStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexName(value: IndexName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexName")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(js.undefined)
        ret
    }
  }
  
}

