package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object userMigrationMod {
  
  type UserMigrationAuthenticationTriggerEvent = typingsSlinky.awsLambda.userMigrationMod.BaseUserMigrationTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.UserMigration_Authentication]
  
  type UserMigrationForgotPasswordTriggerEvent = typingsSlinky.awsLambda.userMigrationMod.BaseUserMigrationTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.UserMigration_ForgotPassword]
  
  type UserMigrationTriggerEvent = typingsSlinky.awsLambda.userMigrationMod.UserMigrationAuthenticationTriggerEvent | typingsSlinky.awsLambda.userMigrationMod.UserMigrationForgotPasswordTriggerEvent
  
  type UserMigrationTriggerHandler = typingsSlinky.awsLambda.handlerMod.Handler[typingsSlinky.awsLambda.userMigrationMod.UserMigrationTriggerEvent, js.Any]
}
