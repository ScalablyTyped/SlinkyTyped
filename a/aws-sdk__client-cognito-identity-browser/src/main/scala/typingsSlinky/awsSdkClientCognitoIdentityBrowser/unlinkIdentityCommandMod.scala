package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityInputMod.UnlinkIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityOutputMod.UnlinkIdentityOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/UnlinkIdentityCommand", JSImport.Namespace)
@js.native
object unlinkIdentityCommandMod extends js.Object {
  
  @js.native
  class UnlinkIdentityCommand protected () extends Command[
          InputTypesUnion, 
          UnlinkIdentityInput, 
          OutputTypesUnion, 
          UnlinkIdentityOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: UnlinkIdentityInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UnlinkIdentityInput, UnlinkIdentityOutput] = js.native
  }
}
