package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateContributorInsightsOutput extends js.Object {
  /**
    * The status of contributor insights
    */
  var ContributorInsightsStatus: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ContributorInsightsStatus] = js.native
  /**
    * The name of the global secondary index, if applicable.
    */
  var IndexName: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
}

object UpdateContributorInsightsOutput {
  @scala.inline
  def apply(): UpdateContributorInsightsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContributorInsightsOutput]
  }
  @scala.inline
  implicit class UpdateContributorInsightsOutputOps[Self <: UpdateContributorInsightsOutput] (val x: Self) extends AnyVal {
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

