package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAuthEventFeedbackRequest extends js.Object {
  /**
    * The event ID.
    */
  var EventId: EventIdType = js.native
  /**
    * The feedback token.
    */
  var FeedbackToken: TokenModelType = js.native
  /**
    * The authentication event feedback value.
    */
  var FeedbackValue: FeedbackValueType = js.native
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType = js.native
  /**
    * The user pool username.
    */
  var Username: UsernameType = js.native
}

object UpdateAuthEventFeedbackRequest {
  @scala.inline
  def apply(
    EventId: EventIdType,
    FeedbackToken: TokenModelType,
    FeedbackValue: FeedbackValueType,
    UserPoolId: UserPoolIdType,
    Username: UsernameType
  ): UpdateAuthEventFeedbackRequest = {
    val __obj = js.Dynamic.literal(EventId = EventId.asInstanceOf[js.Any], FeedbackToken = FeedbackToken.asInstanceOf[js.Any], FeedbackValue = FeedbackValue.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAuthEventFeedbackRequest]
  }
  @scala.inline
  implicit class UpdateAuthEventFeedbackRequestOps[Self <: UpdateAuthEventFeedbackRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventId(value: EventIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeedbackToken(value: TokenModelType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeedbackToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeedbackValue(value: FeedbackValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FeedbackValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserPoolId(value: UserPoolIdType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserPoolId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: UsernameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

