package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolInputMod.CreateIdentityPoolInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolOutputMod.CreateIdentityPoolOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
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
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateIdentityPoolInput) = this()
    
    val middlewareStack: MiddlewareStack[CreateIdentityPoolInput, CreateIdentityPoolOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[CreateIdentityPoolInput, CreateIdentityPoolOutput] = js.native
  }
}
