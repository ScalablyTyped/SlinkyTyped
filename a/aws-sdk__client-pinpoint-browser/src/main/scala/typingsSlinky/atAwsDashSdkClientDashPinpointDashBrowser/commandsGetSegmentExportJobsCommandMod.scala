package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser

import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentExportJobsInputMod.GetSegmentExportJobsInput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentExportJobsOutputMod.GetSegmentExportJobsOutput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentExportJobsCommand", JSImport.Namespace)
@js.native
object commandsGetSegmentExportJobsCommandMod extends js.Object {
  @js.native
  class GetSegmentExportJobsCommand protected () extends Command[
          InputTypesUnion, 
          GetSegmentExportJobsInput, 
          OutputTypesUnion, 
          GetSegmentExportJobsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetSegmentExportJobsInput) = this()
    /* CompleteClass */
    override val input: GetSegmentExportJobsInput = js.native
    val middlewareStack: MiddlewareStack[GetSegmentExportJobsInput, GetSegmentExportJobsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentExportJobsInput, GetSegmentExportJobsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentExportJobsInput, GetSegmentExportJobsOutput] = js.native
  }
  
}

