package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object preSignupMod {
  
  type PreSignUpAdminCreateUserTriggerEvent = typingsSlinky.awsLambda.preSignupMod.BasePreSignUpTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.PreSignUp_AdminCreateUser]
  
  type PreSignUpEmailTriggerEvent = typingsSlinky.awsLambda.preSignupMod.BasePreSignUpTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.PreSignUp_SignUp]
  
  type PreSignUpExternalProviderTriggerEvent = typingsSlinky.awsLambda.preSignupMod.BasePreSignUpTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.PreSignUp_ExternalProvider]
  
  type PreSignUpTriggerEvent = typingsSlinky.awsLambda.preSignupMod.PreSignUpEmailTriggerEvent | typingsSlinky.awsLambda.preSignupMod.PreSignUpExternalProviderTriggerEvent | typingsSlinky.awsLambda.preSignupMod.PreSignUpAdminCreateUserTriggerEvent
  
  type PreSignUpTriggerHandler = typingsSlinky.awsLambda.handlerMod.Handler[typingsSlinky.awsLambda.preSignupMod.PreSignUpTriggerEvent, js.Any]
}
