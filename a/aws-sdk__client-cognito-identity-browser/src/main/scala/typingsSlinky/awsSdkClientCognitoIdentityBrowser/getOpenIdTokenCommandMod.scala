package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenInputMod.GetOpenIdTokenInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenOutputMod.GetOpenIdTokenOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetOpenIdTokenCommand", JSImport.Namespace)
@js.native
object getOpenIdTokenCommandMod extends js.Object {
  @js.native
  class GetOpenIdTokenCommand protected () extends Command[
          InputTypesUnion, 
          GetOpenIdTokenInput, 
          OutputTypesUnion, 
          GetOpenIdTokenOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetOpenIdTokenInput) = this()
    /* CompleteClass */
    override val input: GetOpenIdTokenInput = js.native
    val middlewareStack: MiddlewareStack[GetOpenIdTokenInput, GetOpenIdTokenOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetOpenIdTokenInput, GetOpenIdTokenOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetOpenIdTokenInput, GetOpenIdTokenOutput] = js.native
  }
  
}

