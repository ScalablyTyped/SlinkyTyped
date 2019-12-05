package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser

import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteEmailChannelInputMod.DeleteEmailChannelInput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteEmailChannelOutputMod.DeleteEmailChannelOutput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteEmailChannelCommand", JSImport.Namespace)
@js.native
object commandsDeleteEmailChannelCommandMod extends js.Object {
  @js.native
  class DeleteEmailChannelCommand protected () extends Command[
          InputTypesUnion, 
          DeleteEmailChannelInput, 
          OutputTypesUnion, 
          DeleteEmailChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteEmailChannelInput) = this()
    /* CompleteClass */
    override val input: DeleteEmailChannelInput = js.native
    val middlewareStack: MiddlewareStack[DeleteEmailChannelInput, DeleteEmailChannelOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteEmailChannelInput, DeleteEmailChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteEmailChannelInput, DeleteEmailChannelOutput] = js.native
  }
  
}

