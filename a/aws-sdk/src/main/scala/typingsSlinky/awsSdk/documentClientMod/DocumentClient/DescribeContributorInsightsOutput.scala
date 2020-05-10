package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContributorInsightsOutput extends js.Object {
  /**
    * List of names of the associated Alpine rules.
    */
  var ContributorInsightsRuleList: js.UndefOr[
    typingsSlinky.awsSdk.documentClientMod.DocumentClient.ContributorInsightsRuleList
  ] = js.native
  /**
    * Current Status contributor insights.
    */
  var ContributorInsightsStatus: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ContributorInsightsStatus] = js.native
  /**
    * Returns information about the last failure that encountered. The most common exceptions for a FAILED status are:   LimitExceededException - Per-account Amazon CloudWatch Contributor Insights rule limit reached. Please disable Contributor Insights for other tables/indexes OR disable Contributor Insights rules before retrying.   AccessDeniedException - Amazon CloudWatch Contributor Insights rules cannot be modified due to insufficient permissions.   AccessDeniedException - Failed to create service-linked role for Contributor Insights due to insufficient permissions.   InternalServerError - Failed to create Amazon CloudWatch Contributor Insights rules. Please retry request.  
    */
  var FailureException: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.FailureException] = js.native
  /**
    * The name of the global secondary index being described.
    */
  var IndexName: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
  /**
    * Timestamp of the last time the status was changed.
    */
  var LastUpdateDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the table being described.
    */
  var TableName: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
}

object DescribeContributorInsightsOutput {
  @scala.inline
  def apply(): DescribeContributorInsightsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContributorInsightsOutput]
  }
  @scala.inline
  implicit class DescribeContributorInsightsOutputOps[Self <: DescribeContributorInsightsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContributorInsightsRuleList(value: ContributorInsightsRuleList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContributorInsightsRuleList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContributorInsightsRuleList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContributorInsightsRuleList")(js.undefined)
        ret
    }
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
    def withFailureException(value: FailureException): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureException")(js.undefined)
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
    def withLastUpdateDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdateDateTime")(js.undefined)
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

