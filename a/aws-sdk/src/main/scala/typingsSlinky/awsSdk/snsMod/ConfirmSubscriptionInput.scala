package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmSubscriptionInput extends js.Object {
  /**
    * Disallows unauthenticated unsubscribes of the subscription. If the value of this parameter is true and the request has an AWS signature, then only the topic owner and the subscription owner can unsubscribe the endpoint. The unsubscribe action requires AWS authentication. 
    */
  var AuthenticateOnUnsubscribe: js.UndefOr[authenticateOnUnsubscribe] = js.native
  /**
    * Short-lived token sent to an endpoint during the Subscribe action.
    */
  var Token: token = js.native
  /**
    * The ARN of the topic for which you wish to confirm a subscription.
    */
  var TopicArn: topicARN = js.native
}

object ConfirmSubscriptionInput {
  @scala.inline
  def apply(Token: token, TopicArn: topicARN): ConfirmSubscriptionInput = {
    val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmSubscriptionInput]
  }
  @scala.inline
  implicit class ConfirmSubscriptionInputOps[Self <: ConfirmSubscriptionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToken(value: token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopicArn(value: topicARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopicArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthenticateOnUnsubscribe(value: authenticateOnUnsubscribe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticateOnUnsubscribe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticateOnUnsubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticateOnUnsubscribe")(js.undefined)
        ret
    }
  }
  
}

