package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityInputMod.UnlinkDeveloperIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityOutputMod.UnlinkDeveloperIdentityOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/UnlinkDeveloperIdentityCommand", JSImport.Namespace)
@js.native
object unlinkDeveloperIdentityCommandMod extends js.Object {
  @js.native
  class UnlinkDeveloperIdentityCommand protected () extends Command[
          InputTypesUnion, 
          UnlinkDeveloperIdentityInput, 
          OutputTypesUnion, 
          UnlinkDeveloperIdentityOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: UnlinkDeveloperIdentityInput) = this()
    /* CompleteClass */
    override val input: UnlinkDeveloperIdentityInput = js.native
    val middlewareStack: MiddlewareStack[
        UnlinkDeveloperIdentityInput, 
        UnlinkDeveloperIdentityOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UnlinkDeveloperIdentityInput, UnlinkDeveloperIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UnlinkDeveloperIdentityInput, UnlinkDeveloperIdentityOutput] = js.native
  }
  
}

