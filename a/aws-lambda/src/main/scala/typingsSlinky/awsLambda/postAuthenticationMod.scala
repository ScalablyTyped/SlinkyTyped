package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.anon.AwsSdkVersion
import typingsSlinky.awsLambda.anon.NewDeviceUsed
import typingsSlinky.awsLambda.awsLambdaStrings.PostAuthentication_Authentication
import typingsSlinky.awsLambda.commonMod.BaseTriggerEvent
import typingsSlinky.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postAuthenticationMod {
  
  @js.native
  trait PostAuthenticationTriggerEvent extends BaseTriggerEvent[PostAuthentication_Authentication] {
    
    var request: NewDeviceUsed = js.native
  }
  object PostAuthenticationTriggerEvent {
    
    @scala.inline
    def apply(
      callerContext: AwsSdkVersion,
      region: String,
      request: NewDeviceUsed,
      triggerSource: PostAuthentication_Authentication,
      userName: String,
      userPoolId: String,
      version: String
    ): PostAuthenticationTriggerEvent = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostAuthenticationTriggerEvent]
    }
    
    @scala.inline
    implicit class PostAuthenticationTriggerEventMutableBuilder[Self <: PostAuthenticationTriggerEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: NewDeviceUsed): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type PostAuthenticationTriggerHandler = Handler[PostAuthenticationTriggerEvent, js.Any]
}
