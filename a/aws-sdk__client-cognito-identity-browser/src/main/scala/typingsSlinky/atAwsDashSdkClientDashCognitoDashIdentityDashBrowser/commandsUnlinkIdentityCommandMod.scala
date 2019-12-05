package typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser

import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnlinkIdentityInputMod.UnlinkIdentityInput
import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesUnlinkIdentityOutputMod.UnlinkIdentityOutput
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/UnlinkIdentityCommand", JSImport.Namespace)
@js.native
object commandsUnlinkIdentityCommandMod extends js.Object {
  @js.native
  class UnlinkIdentityCommand protected () extends Command[
          InputTypesUnion, 
          UnlinkIdentityInput, 
          OutputTypesUnion, 
          UnlinkIdentityOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: UnlinkIdentityInput) = this()
    /* CompleteClass */
    override val input: UnlinkIdentityInput = js.native
    val middlewareStack: MiddlewareStack[UnlinkIdentityInput, UnlinkIdentityOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UnlinkIdentityInput, UnlinkIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UnlinkIdentityInput, UnlinkIdentityOutput] = js.native
  }
  
}

