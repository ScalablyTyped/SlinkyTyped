package typingsSlinky.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmSubscriptionInput extends StObject {
  
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
  implicit class ConfirmSubscriptionInputMutableBuilder[Self <: ConfirmSubscriptionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticateOnUnsubscribe(value: authenticateOnUnsubscribe): Self = StObject.set(x, "AuthenticateOnUnsubscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticateOnUnsubscribeUndefined: Self = StObject.set(x, "AuthenticateOnUnsubscribe", js.undefined)
    
    @scala.inline
    def setToken(value: token): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicArn(value: topicARN): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
  }
}
