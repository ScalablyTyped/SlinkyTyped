package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateContributorInsightsInput extends js.Object {
  /**
    * Represents the contributor insights action.
    */
  var ContributorInsightsAction: typingsSlinky.awsSdk.dynamodbMod.ContributorInsightsAction = js.native
  /**
    * The global secondary index name, if applicable.
    */
  var IndexName: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.IndexName] = js.native
  /**
    * The name of the table.
    */
  var TableName: typingsSlinky.awsSdk.dynamodbMod.TableName = js.native
}

object UpdateContributorInsightsInput {
  @scala.inline
  def apply(ContributorInsightsAction: ContributorInsightsAction, TableName: TableName): UpdateContributorInsightsInput = {
    val __obj = js.Dynamic.literal(ContributorInsightsAction = ContributorInsightsAction.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContributorInsightsInput]
  }
  @scala.inline
  implicit class UpdateContributorInsightsInputOps[Self <: UpdateContributorInsightsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContributorInsightsAction(value: ContributorInsightsAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContributorInsightsAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
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
  }
  
}

