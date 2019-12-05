package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser

import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesGetGcmChannelInputMod.GetGcmChannelInput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesGetGcmChannelOutputMod.GetGcmChannelOutput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetGcmChannelCommand", JSImport.Namespace)
@js.native
object commandsGetGcmChannelCommandMod extends js.Object {
  @js.native
  class GetGcmChannelCommand protected () extends Command[
          InputTypesUnion, 
          GetGcmChannelInput, 
          OutputTypesUnion, 
          GetGcmChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetGcmChannelInput) = this()
    /* CompleteClass */
    override val input: GetGcmChannelInput = js.native
    val middlewareStack: MiddlewareStack[GetGcmChannelInput, GetGcmChannelOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetGcmChannelInput, GetGcmChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetGcmChannelInput, GetGcmChannelOutput] = js.native
  }
  
}

