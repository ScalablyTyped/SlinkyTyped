package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesInputMod.ListIdentitiesInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesListIdentitiesOutputMod.ListIdentitiesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/ListIdentitiesCommand", JSImport.Namespace)
@js.native
object listIdentitiesCommandMod extends js.Object {
  @js.native
  class ListIdentitiesCommand protected () extends Command[
          InputTypesUnion, 
          ListIdentitiesInput, 
          OutputTypesUnion, 
          ListIdentitiesOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListIdentitiesInput) = this()
    val middlewareStack: MiddlewareStack[ListIdentitiesInput, ListIdentitiesOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[ListIdentitiesInput, ListIdentitiesOutput] = js.native
  }
  
}

