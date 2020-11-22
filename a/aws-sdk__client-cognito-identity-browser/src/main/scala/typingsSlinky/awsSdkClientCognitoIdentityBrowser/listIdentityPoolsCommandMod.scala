package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsInputMod.ListIdentityPoolsInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsOutputMod.ListIdentityPoolsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/ListIdentityPoolsCommand", JSImport.Namespace)
@js.native
object listIdentityPoolsCommandMod extends js.Object {
  
  @js.native
  class ListIdentityPoolsCommand protected () extends Command[
          InputTypesUnion, 
          ListIdentityPoolsInput, 
          OutputTypesUnion, 
          ListIdentityPoolsOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: ListIdentityPoolsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[ListIdentityPoolsInput, ListIdentityPoolsOutput] = js.native
  }
}
