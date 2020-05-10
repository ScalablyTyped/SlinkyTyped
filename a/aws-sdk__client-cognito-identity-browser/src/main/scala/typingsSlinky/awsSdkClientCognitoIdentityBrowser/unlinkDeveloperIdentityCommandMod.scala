package typingsSlinky.awsSdkClientCognitoIdentityBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityInputMod.UnlinkDeveloperIdentityInput
import typingsSlinky.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityOutputMod.UnlinkDeveloperIdentityOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
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
    val middlewareStack: MiddlewareStack[UnlinkDeveloperIdentityInput, UnlinkDeveloperIdentityOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UnlinkDeveloperIdentityInput, UnlinkDeveloperIdentityOutput] = js.native
  }
  
}

