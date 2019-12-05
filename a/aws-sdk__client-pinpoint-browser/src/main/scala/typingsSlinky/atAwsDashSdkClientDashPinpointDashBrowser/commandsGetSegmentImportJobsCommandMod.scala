package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser

import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentImportJobsInputMod.GetSegmentImportJobsInput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentImportJobsOutputMod.GetSegmentImportJobsOutput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentImportJobsCommand", JSImport.Namespace)
@js.native
object commandsGetSegmentImportJobsCommandMod extends js.Object {
  @js.native
  class GetSegmentImportJobsCommand protected () extends Command[
          InputTypesUnion, 
          GetSegmentImportJobsInput, 
          OutputTypesUnion, 
          GetSegmentImportJobsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetSegmentImportJobsInput) = this()
    /* CompleteClass */
    override val input: GetSegmentImportJobsInput = js.native
    val middlewareStack: MiddlewareStack[GetSegmentImportJobsInput, GetSegmentImportJobsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentImportJobsInput, GetSegmentImportJobsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentImportJobsInput, GetSegmentImportJobsOutput] = js.native
  }
  
}

