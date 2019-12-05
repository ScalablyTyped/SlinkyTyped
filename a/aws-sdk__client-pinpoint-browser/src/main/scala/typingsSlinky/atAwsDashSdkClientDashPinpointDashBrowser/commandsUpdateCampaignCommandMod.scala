package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser

import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateCampaignInputMod.UpdateCampaignInput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateCampaignOutputMod.UpdateCampaignOutput
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateCampaignCommand", JSImport.Namespace)
@js.native
object commandsUpdateCampaignCommandMod extends js.Object {
  @js.native
  class UpdateCampaignCommand protected () extends Command[
          InputTypesUnion, 
          UpdateCampaignInput, 
          OutputTypesUnion, 
          UpdateCampaignOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateCampaignInput) = this()
    /* CompleteClass */
    override val input: UpdateCampaignInput = js.native
    val middlewareStack: MiddlewareStack[UpdateCampaignInput, UpdateCampaignOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateCampaignInput, UpdateCampaignOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateCampaignInput, UpdateCampaignOutput] = js.native
  }
  
}

