package typingsSlinky.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHumanLoopsRequest extends js.Object {
  /**
    * (Optional) The timestamp of the date when you want the human loops to begin in ISO 8601 format. For example, 2020-02-24.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * (Optional) The timestamp of the date before which you want the human loops to begin in ISO 8601 format. For example, 2020-02-24.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of a flow definition.
    */
  var FlowDefinitionArn: typingsSlinky.awsSdk.augmentedairuntimeMod.FlowDefinitionArn = js.native
  /**
    * The total number of items to return. If the total number of available items is more than the value specified in MaxResults, then a NextToken will be provided in the output that you can use to resume pagination.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.augmentedairuntimeMod.MaxResults] = js.native
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.augmentedairuntimeMod.NextToken] = js.native
  /**
    * An optional value that specifies whether you want the results sorted in Ascending or Descending order.
    */
  var SortOrder: js.UndefOr[typingsSlinky.awsSdk.augmentedairuntimeMod.SortOrder] = js.native
}

object ListHumanLoopsRequest {
  @scala.inline
  def apply(FlowDefinitionArn: FlowDefinitionArn): ListHumanLoopsRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHumanLoopsRequest]
  }
  @scala.inline
  implicit class ListHumanLoopsRequestOps[Self <: ListHumanLoopsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlowDefinitionArn(value: FlowDefinitionArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FlowDefinitionArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationTimeAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimeAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimeAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimeAfter")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTimeBefore(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimeBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimeBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimeBefore")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    @scala.inline
    def withSortOrder(value: SortOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortOrder")(js.undefined)
        ret
    }
  }
  
}

