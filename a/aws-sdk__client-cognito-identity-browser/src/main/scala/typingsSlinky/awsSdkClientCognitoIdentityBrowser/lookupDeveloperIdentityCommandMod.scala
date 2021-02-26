package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityInputMod.LookupDeveloperIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityOutputMod.LookupDeveloperIdentityOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lookupDeveloperIdentityCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/LookupDeveloperIdentityCommand", "LookupDeveloperIdentityCommand")
  @js.native
  class LookupDeveloperIdentityCommand protected () extends Command[
          InputTypesUnion, 
          LookupDeveloperIdentityInput, 
          OutputTypesUnion, 
          LookupDeveloperIdentityOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: LookupDeveloperIdentityInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[LookupDeveloperIdentityInput, LookupDeveloperIdentityOutput] = js.native
  }
}
