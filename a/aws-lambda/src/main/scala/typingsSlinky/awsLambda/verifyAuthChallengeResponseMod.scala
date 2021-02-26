package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.anon.AnswerCorrectBoolean
import typingsSlinky.awsLambda.anon.AwsSdkVersion
import typingsSlinky.awsLambda.anon.PrivateChallengeParameters
import typingsSlinky.awsLambda.awsLambdaStrings.VerifyAuthChallengeResponse_Authentication
import typingsSlinky.awsLambda.commonMod.BaseTriggerEvent
import typingsSlinky.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verifyAuthChallengeResponseMod {
  
  @js.native
  trait VerifyAuthChallengeResponseTriggerEvent extends BaseTriggerEvent[VerifyAuthChallengeResponse_Authentication] {
    
    var request: PrivateChallengeParameters = js.native
    
    var response: AnswerCorrectBoolean = js.native
  }
  object VerifyAuthChallengeResponseTriggerEvent {
    
    @scala.inline
    def apply(
      callerContext: AwsSdkVersion,
      region: String,
      request: PrivateChallengeParameters,
      response: AnswerCorrectBoolean,
      triggerSource: VerifyAuthChallengeResponse_Authentication,
      userName: String,
      userPoolId: String,
      version: String
    ): VerifyAuthChallengeResponseTriggerEvent = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyAuthChallengeResponseTriggerEvent]
    }
    
    @scala.inline
    implicit class VerifyAuthChallengeResponseTriggerEventMutableBuilder[Self <: VerifyAuthChallengeResponseTriggerEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: PrivateChallengeParameters): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: AnswerCorrectBoolean): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type VerifyAuthChallengeResponseTriggerHandler = Handler[VerifyAuthChallengeResponseTriggerEvent, js.Any]
}
