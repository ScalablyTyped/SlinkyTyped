package typingsSlinky.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContributorInsightsInput extends js.Object {
  /**
    * The name of the global secondary index to describe, if applicable.
    */
  var IndexName: js.UndefOr[typingsSlinky.awsDashSdk.clientsDynamodbMod.IndexName] = js.native
  /**
    * The name of the table to describe.
    */
  var TableName: typingsSlinky.awsDashSdk.clientsDynamodbMod.TableName = js.native
}

object DescribeContributorInsightsInput {
  @scala.inline
  def apply(TableName: TableName, IndexName: IndexName = null): DescribeContributorInsightsInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContributorInsightsInput]
  }
}

