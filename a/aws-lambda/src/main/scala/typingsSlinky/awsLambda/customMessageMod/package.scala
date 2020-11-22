package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object customMessageMod {
  
  type CustomMessageAdminCreateUserTriggerEvent = typingsSlinky.awsLambda.customMessageMod.BaseCustomMessageTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.CustomMessage_AdminCreateUser]
  
  type CustomMessageAuthenticationTriggerEvent = typingsSlinky.awsLambda.customMessageMod.BaseCustomMessageTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.CustomMessage_Authentication]
  
  type CustomMessageForgotPasswordTriggerEvent = typingsSlinky.awsLambda.customMessageMod.BaseCustomMessageTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.CustomMessage_ForgotPassword]
  
  type CustomMessageResendCodeTriggerEvent = typingsSlinky.awsLambda.customMessageMod.BaseCustomMessageTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.CustomMessage_ResendCode]
  
  type CustomMessageSignUpTriggerEvent = typingsSlinky.awsLambda.customMessageMod.BaseCustomMessageTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.CustomMessage_SignUp]
  
  type CustomMessageTriggerEvent = typingsSlinky.awsLambda.customMessageMod.CustomMessageSignUpTriggerEvent | typingsSlinky.awsLambda.customMessageMod.CustomMessageAdminCreateUserTriggerEvent | typingsSlinky.awsLambda.customMessageMod.CustomMessageResendCodeTriggerEvent | typingsSlinky.awsLambda.customMessageMod.CustomMessageForgotPasswordTriggerEvent | typingsSlinky.awsLambda.customMessageMod.CustomMessageUpdateUserAttributeTriggerEvent | typingsSlinky.awsLambda.customMessageMod.CustomMessageVerifyUserAttributeTriggerEvent | typingsSlinky.awsLambda.customMessageMod.CustomMessageAuthenticationTriggerEvent
  
  type CustomMessageTriggerHandler = typingsSlinky.awsLambda.handlerMod.Handler[typingsSlinky.awsLambda.customMessageMod.CustomMessageTriggerEvent, js.Any]
  
  type CustomMessageUpdateUserAttributeTriggerEvent = typingsSlinky.awsLambda.customMessageMod.BaseCustomMessageTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.CustomMessage_UpdateUserAttribute]
  
  type CustomMessageVerifyUserAttributeTriggerEvent = typingsSlinky.awsLambda.customMessageMod.BaseCustomMessageTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.CustomMessage_VerifyUserAttribute]
}
