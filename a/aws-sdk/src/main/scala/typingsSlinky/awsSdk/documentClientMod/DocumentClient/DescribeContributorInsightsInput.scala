package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContributorInsightsInput extends js.Object {
  /**
    * The name of the global secondary index to describe, if applicable.
    */
  var IndexName: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.IndexName] = js.native
  /**
    * The name of the table to describe.
    */
  var TableName: typingsSlinky.awsSdk.documentClientMod.DocumentClient.TableName = js.native
}

object DescribeContributorInsightsInput {
  @scala.inline
  def apply(TableName: TableName): DescribeContributorInsightsInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContributorInsightsInput]
  }
  @scala.inline
  implicit class DescribeContributorInsightsInputOps[Self <: DescribeContributorInsightsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

