package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityInputMod.UnlinkDeveloperIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityOutputMod.UnlinkDeveloperIdentityOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/UnlinkDeveloperIdentityCommand", JSImport.Namespace)
@js.native
object unlinkDeveloperIdentityCommandMod extends js.Object {
  
  @js.native
  class UnlinkDeveloperIdentityCommand protected () extends Command[
          InputTypesUnion, 
          UnlinkDeveloperIdentityInput, 
          OutputTypesUnion, 
          UnlinkDeveloperIdentityOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: UnlinkDeveloperIdentityInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UnlinkDeveloperIdentityInput, UnlinkDeveloperIdentityOutput] = js.native
  }
}
