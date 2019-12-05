package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser

import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentsInputMod.GetSegmentsInput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentsOutputMod.GetSegmentsOutput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentsCommand", JSImport.Namespace)
@js.native
object commandsGetSegmentsCommandMod extends js.Object {
  @js.native
  class GetSegmentsCommand protected () extends Command[
          InputTypesUnion, 
          GetSegmentsInput, 
          OutputTypesUnion, 
          GetSegmentsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetSegmentsInput) = this()
    /* CompleteClass */
    override val input: GetSegmentsInput = js.native
    val middlewareStack: MiddlewareStack[GetSegmentsInput, GetSegmentsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentsInput, GetSegmentsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentsInput, GetSegmentsOutput] = js.native
  }
  
}

