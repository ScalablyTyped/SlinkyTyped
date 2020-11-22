package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object postConfirmationMod {
  
  type PostConfirmationConfirmForgotPassword = typingsSlinky.awsLambda.postConfirmationMod.BasePostConfirmationTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.PostConfirmation_ConfirmForgotPassword]
  
  type PostConfirmationConfirmSignUpTriggerEvent = typingsSlinky.awsLambda.postConfirmationMod.BasePostConfirmationTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.PostConfirmation_ConfirmSignUp]
  
  type PostConfirmationTriggerEvent = typingsSlinky.awsLambda.postConfirmationMod.PostConfirmationConfirmSignUpTriggerEvent | typingsSlinky.awsLambda.postConfirmationMod.PostConfirmationConfirmForgotPassword
  
  type PostConfirmationTriggerHandler = typingsSlinky.awsLambda.handlerMod.Handler[typingsSlinky.awsLambda.postConfirmationMod.PostConfirmationTriggerEvent, js.Any]
}
