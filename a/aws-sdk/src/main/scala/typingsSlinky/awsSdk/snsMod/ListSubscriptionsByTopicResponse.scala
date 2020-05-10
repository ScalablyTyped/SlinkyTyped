package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSubscriptionsByTopicResponse extends js.Object {
  /**
    * Token to pass along to the next ListSubscriptionsByTopic request. This element is returned if there are more subscriptions to retrieve.
    */
  var NextToken: js.UndefOr[nextToken] = js.native
  /**
    * A list of subscriptions.
    */
  var Subscriptions: js.UndefOr[SubscriptionsList] = js.native
}

object ListSubscriptionsByTopicResponse {
  @scala.inline
  def apply(): ListSubscriptionsByTopicResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubscriptionsByTopicResponse]
  }
  @scala.inline
  implicit class ListSubscriptionsByTopicResponseOps[Self <: ListSubscriptionsByTopicResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: nextToken): Self = {
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
    def withSubscriptions(value: SubscriptionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Subscriptions")(js.undefined)
        ret
    }
  }
  
}

