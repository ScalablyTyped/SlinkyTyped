package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTopicRuleDestinationsResponse extends js.Object {
  /**
    * Information about a topic rule destination.
    */
  var destinationSummaries: js.UndefOr[TopicRuleDestinationSummaries] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListTopicRuleDestinationsResponse {
  @scala.inline
  def apply(): ListTopicRuleDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicRuleDestinationsResponse]
  }
  @scala.inline
  implicit class ListTopicRuleDestinationsResponseOps[Self <: ListTopicRuleDestinationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationSummaries(value: TopicRuleDestinationSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

