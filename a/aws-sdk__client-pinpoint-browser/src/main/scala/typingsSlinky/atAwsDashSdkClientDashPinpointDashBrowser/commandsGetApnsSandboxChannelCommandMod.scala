package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser

import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesGetApnsSandboxChannelInputMod.GetApnsSandboxChannelInput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesGetApnsSandboxChannelOutputMod.GetApnsSandboxChannelOutput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetApnsSandboxChannelCommand", JSImport.Namespace)
@js.native
object commandsGetApnsSandboxChannelCommandMod extends js.Object {
  @js.native
  class GetApnsSandboxChannelCommand protected () extends Command[
          InputTypesUnion, 
          GetApnsSandboxChannelInput, 
          OutputTypesUnion, 
          GetApnsSandboxChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetApnsSandboxChannelInput) = this()
    /* CompleteClass */
    override val input: GetApnsSandboxChannelInput = js.native
    val middlewareStack: MiddlewareStack[GetApnsSandboxChannelInput, GetApnsSandboxChannelOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApnsSandboxChannelInput, GetApnsSandboxChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetApnsSandboxChannelInput, GetApnsSandboxChannelOutput] = js.native
  }
  
}

