package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolInputMod.DeleteIdentityPoolInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolOutputMod.DeleteIdentityPoolOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteIdentityPoolCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/DeleteIdentityPoolCommand", "DeleteIdentityPoolCommand")
  @js.native
  class DeleteIdentityPoolCommand protected () extends Command[
          InputTypesUnion, 
          DeleteIdentityPoolInput, 
          OutputTypesUnion, 
          DeleteIdentityPoolOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: DeleteIdentityPoolInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DeleteIdentityPoolInput, DeleteIdentityPoolOutput] = js.native
  }
}
