package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolInputMod.CreateIdentityPoolInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolOutputMod.CreateIdentityPoolOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/CreateIdentityPoolCommand", JSImport.Namespace)
@js.native
object createIdentityPoolCommandMod extends js.Object {
  
  @js.native
  class CreateIdentityPoolCommand protected () extends Command[
          InputTypesUnion, 
          CreateIdentityPoolInput, 
          OutputTypesUnion, 
          CreateIdentityPoolOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: CreateIdentityPoolInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[CreateIdentityPoolInput, CreateIdentityPoolOutput] = js.native
  }
}
