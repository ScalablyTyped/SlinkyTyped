package typingsSlinky.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object preTokenGenerationMod {
  
  type PreTokenGenerationAuthenticateDeviceTriggerEvent = typingsSlinky.awsLambda.preTokenGenerationMod.BasePreTokenGenerationTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.TokenGeneration_AuthenticateDevice]
  
  type PreTokenGenerationAuthenticationTriggerEvent = typingsSlinky.awsLambda.preTokenGenerationMod.BasePreTokenGenerationTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.TokenGeneration_Authentication]
  
  type PreTokenGenerationHostedAuthTriggerEvent = typingsSlinky.awsLambda.preTokenGenerationMod.BasePreTokenGenerationTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.TokenGeneration_HostedAuth]
  
  type PreTokenGenerationNewPasswordChallengeTriggerEvent = typingsSlinky.awsLambda.preTokenGenerationMod.BasePreTokenGenerationTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.TokenGeneration_NewPasswordChallenge]
  
  type PreTokenGenerationRefreshTokensTriggerEvent = typingsSlinky.awsLambda.preTokenGenerationMod.BasePreTokenGenerationTriggerEvent[typingsSlinky.awsLambda.awsLambdaStrings.TokenGeneration_RefreshTokens]
  
  type PreTokenGenerationTriggerEvent = typingsSlinky.awsLambda.preTokenGenerationMod.PreTokenGenerationHostedAuthTriggerEvent | typingsSlinky.awsLambda.preTokenGenerationMod.PreTokenGenerationAuthenticationTriggerEvent | typingsSlinky.awsLambda.preTokenGenerationMod.PreTokenGenerationNewPasswordChallengeTriggerEvent | typingsSlinky.awsLambda.preTokenGenerationMod.PreTokenGenerationAuthenticateDeviceTriggerEvent | typingsSlinky.awsLambda.preTokenGenerationMod.PreTokenGenerationRefreshTokensTriggerEvent
  
  type PreTokenGenerationTriggerHandler = typingsSlinky.awsLambda.handlerMod.Handler[
    typingsSlinky.awsLambda.preTokenGenerationMod.PreTokenGenerationTriggerEvent, 
    js.Any
  ]
}
