package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesInputMod.SetIdentityPoolRolesInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesOutputMod.SetIdentityPoolRolesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/SetIdentityPoolRolesCommand", JSImport.Namespace)
@js.native
object setIdentityPoolRolesCommandMod extends js.Object {
  @js.native
  class SetIdentityPoolRolesCommand protected () extends Command[
          InputTypesUnion, 
          SetIdentityPoolRolesInput, 
          OutputTypesUnion, 
          SetIdentityPoolRolesOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: SetIdentityPoolRolesInput) = this()
    /* CompleteClass */
    override val input: SetIdentityPoolRolesInput = js.native
    val middlewareStack: MiddlewareStack[SetIdentityPoolRolesInput, SetIdentityPoolRolesOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[SetIdentityPoolRolesInput, SetIdentityPoolRolesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[SetIdentityPoolRolesInput, SetIdentityPoolRolesOutput] = js.native
  }
  
}

