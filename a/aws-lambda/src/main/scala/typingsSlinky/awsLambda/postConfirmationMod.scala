package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.anon.AwsSdkVersion
import typingsSlinky.awsLambda.anon.UserAttributes
import typingsSlinky.awsLambda.awsLambdaStrings.PostConfirmation_ConfirmForgotPassword
import typingsSlinky.awsLambda.awsLambdaStrings.PostConfirmation_ConfirmSignUp
import typingsSlinky.awsLambda.commonMod.BaseTriggerEvent
import typingsSlinky.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postConfirmationMod {
  
  @js.native
  trait BasePostConfirmationTriggerEvent[T /* <: String */] extends BaseTriggerEvent[T] {
    
    var request: UserAttributes = js.native
  }
  object BasePostConfirmationTriggerEvent {
    
    @scala.inline
    def apply[T /* <: String */](
      callerContext: AwsSdkVersion,
      region: String,
      request: UserAttributes,
      triggerSource: T,
      userName: String,
      userPoolId: String,
      version: String
    ): BasePostConfirmationTriggerEvent[T] = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasePostConfirmationTriggerEvent[T]]
    }
    
    @scala.inline
    implicit class BasePostConfirmationTriggerEventMutableBuilder[Self <: BasePostConfirmationTriggerEvent[_], T /* <: String */] (val x: Self with BasePostConfirmationTriggerEvent[T]) extends AnyVal {
      
      @scala.inline
      def setRequest(value: UserAttributes): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type PostConfirmationConfirmForgotPassword = BasePostConfirmationTriggerEvent[PostConfirmation_ConfirmForgotPassword]
  
  type PostConfirmationConfirmSignUpTriggerEvent = BasePostConfirmationTriggerEvent[PostConfirmation_ConfirmSignUp]
  
  type PostConfirmationTriggerEvent = PostConfirmationConfirmSignUpTriggerEvent | PostConfirmationConfirmForgotPassword
  
  type PostConfirmationTriggerHandler = Handler[PostConfirmationTriggerEvent, js.Any]
}
