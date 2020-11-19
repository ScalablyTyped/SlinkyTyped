package typingsSlinky.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventId(value: EventIdType): Self = this.set("EventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackToken(value: TokenModelType): Self = this.set("FeedbackToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackValue(value: FeedbackValueType): Self = this.set("FeedbackValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: UsernameType): Self = this.set("Username", value.asInstanceOf[js.Any])
  }
}
