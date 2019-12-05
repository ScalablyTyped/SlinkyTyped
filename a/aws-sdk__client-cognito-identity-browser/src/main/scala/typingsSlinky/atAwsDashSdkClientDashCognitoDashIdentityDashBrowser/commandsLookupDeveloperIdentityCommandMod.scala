package typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser

import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesLookupDeveloperIdentityInputMod.LookupDeveloperIdentityInput
import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesLookupDeveloperIdentityOutputMod.LookupDeveloperIdentityOutput
import typingsSlinky.atAwsDashSdkClientDashCognitoDashIdentityDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/LookupDeveloperIdentityCommand", JSImport.Namespace)
@js.native
object commandsLookupDeveloperIdentityCommandMod extends js.Object {
  @js.native
  class LookupDeveloperIdentityCommand protected () extends Command[
          InputTypesUnion, 
          LookupDeveloperIdentityInput, 
          OutputTypesUnion, 
          LookupDeveloperIdentityOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: LookupDeveloperIdentityInput) = this()
    /* CompleteClass */
    override val input: LookupDeveloperIdentityInput = js.native
    val middlewareStack: MiddlewareStack[
        LookupDeveloperIdentityInput, 
        LookupDeveloperIdentityOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[LookupDeveloperIdentityInput, LookupDeveloperIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[LookupDeveloperIdentityInput, LookupDeveloperIdentityOutput] = js.native
  }
  
}

