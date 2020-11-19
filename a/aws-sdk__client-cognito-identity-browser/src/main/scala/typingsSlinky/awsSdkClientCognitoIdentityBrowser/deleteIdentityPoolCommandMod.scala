package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolInputMod.DeleteIdentityPoolInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentityPoolOutputMod.DeleteIdentityPoolOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/DeleteIdentityPoolCommand", JSImport.Namespace)
@js.native
object deleteIdentityPoolCommandMod extends js.Object {
  
  @js.native
  class DeleteIdentityPoolCommand protected () extends Command[
          InputTypesUnion, 
          DeleteIdentityPoolInput, 
          OutputTypesUnion, 
          DeleteIdentityPoolOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteIdentityPoolInput) = this()
    
    val middlewareStack: MiddlewareStack[DeleteIdentityPoolInput, DeleteIdentityPoolOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DeleteIdentityPoolInput, DeleteIdentityPoolOutput] = js.native
  }
}
