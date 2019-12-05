package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser

import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesGetCampaignVersionInputMod.GetCampaignVersionInput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesGetCampaignVersionOutputMod.GetCampaignVersionOutput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignVersionCommand", JSImport.Namespace)
@js.native
object commandsGetCampaignVersionCommandMod extends js.Object {
  @js.native
  class GetCampaignVersionCommand protected () extends Command[
          InputTypesUnion, 
          GetCampaignVersionInput, 
          OutputTypesUnion, 
          GetCampaignVersionOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetCampaignVersionInput) = this()
    /* CompleteClass */
    override val input: GetCampaignVersionInput = js.native
    val middlewareStack: MiddlewareStack[GetCampaignVersionInput, GetCampaignVersionOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignVersionInput, GetCampaignVersionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignVersionInput, GetCampaignVersionOutput] = js.native
  }
  
}

