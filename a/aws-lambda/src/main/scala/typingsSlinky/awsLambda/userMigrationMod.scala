package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.anon.AwsSdkVersion
import typingsSlinky.awsLambda.anon.DesiredDeliveryMediums
import typingsSlinky.awsLambda.anon.Password
import typingsSlinky.awsLambda.awsLambdaStrings.UserMigration_Authentication
import typingsSlinky.awsLambda.awsLambdaStrings.UserMigration_ForgotPassword
import typingsSlinky.awsLambda.commonMod.BaseTriggerEvent
import typingsSlinky.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userMigrationMod {
  
  @js.native
  trait BaseUserMigrationTriggerEvent[T /* <: String */] extends BaseTriggerEvent[T] {
    
    var request: Password = js.native
    
    var response: DesiredDeliveryMediums = js.native
  }
  object BaseUserMigrationTriggerEvent {
    
    @scala.inline
    def apply[T /* <: String */](
      callerContext: AwsSdkVersion,
      region: String,
      request: Password,
      response: DesiredDeliveryMediums,
      triggerSource: T,
      userName: String,
      userPoolId: String,
      version: String
    ): BaseUserMigrationTriggerEvent[T] = {
      val __obj = js.Dynamic.literal(callerContext = callerContext.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triggerSource = triggerSource.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseUserMigrationTriggerEvent[T]]
    }
    
    @scala.inline
    implicit class BaseUserMigrationTriggerEventMutableBuilder[Self <: BaseUserMigrationTriggerEvent[_], T /* <: String */] (val x: Self with BaseUserMigrationTriggerEvent[T]) extends AnyVal {
      
      @scala.inline
      def setRequest(value: Password): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: DesiredDeliveryMediums): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  type UserMigrationAuthenticationTriggerEvent = BaseUserMigrationTriggerEvent[UserMigration_Authentication]
  
  type UserMigrationForgotPasswordTriggerEvent = BaseUserMigrationTriggerEvent[UserMigration_ForgotPassword]
  
  type UserMigrationTriggerEvent = UserMigrationAuthenticationTriggerEvent | UserMigrationForgotPasswordTriggerEvent
  
  type UserMigrationTriggerHandler = Handler[UserMigrationTriggerEvent, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsLambda.awsLambdaStrings.UNCONFIRMED
    - typingsSlinky.awsLambda.awsLambdaStrings.CONFIRMED
    - typingsSlinky.awsLambda.awsLambdaStrings.ARCHIVED
    - typingsSlinky.awsLambda.awsLambdaStrings.COMPROMISED
    - typingsSlinky.awsLambda.awsLambdaStrings.UNKNOWN
    - typingsSlinky.awsLambda.awsLambdaStrings.RESET_REQUIRED
    - typingsSlinky.awsLambda.awsLambdaStrings.FORCE_CHANGE_PASSWORD
  */
  trait UserStatus extends StObject
  object UserStatus {
    
    @scala.inline
    def ARCHIVED: typingsSlinky.awsLambda.awsLambdaStrings.ARCHIVED = "ARCHIVED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.ARCHIVED]
    
    @scala.inline
    def COMPROMISED: typingsSlinky.awsLambda.awsLambdaStrings.COMPROMISED = "COMPROMISED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.COMPROMISED]
    
    @scala.inline
    def CONFIRMED: typingsSlinky.awsLambda.awsLambdaStrings.CONFIRMED = "CONFIRMED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.CONFIRMED]
    
    @scala.inline
    def FORCE_CHANGE_PASSWORD: typingsSlinky.awsLambda.awsLambdaStrings.FORCE_CHANGE_PASSWORD = "FORCE_CHANGE_PASSWORD".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.FORCE_CHANGE_PASSWORD]
    
    @scala.inline
    def RESET_REQUIRED: typingsSlinky.awsLambda.awsLambdaStrings.RESET_REQUIRED = "RESET_REQUIRED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.RESET_REQUIRED]
    
    @scala.inline
    def UNCONFIRMED: typingsSlinky.awsLambda.awsLambdaStrings.UNCONFIRMED = "UNCONFIRMED".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.UNCONFIRMED]
    
    @scala.inline
    def UNKNOWN: typingsSlinky.awsLambda.awsLambdaStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typingsSlinky.awsLambda.awsLambdaStrings.UNKNOWN]
  }
}
