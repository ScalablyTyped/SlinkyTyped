package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser

import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentVersionsInputMod.GetSegmentVersionsInput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSegmentVersionsOutputMod.GetSegmentVersionsOutput
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentVersionsCommand", JSImport.Namespace)
@js.native
object commandsGetSegmentVersionsCommandMod extends js.Object {
  @js.native
  class GetSegmentVersionsCommand protected () extends Command[
          InputTypesUnion, 
          GetSegmentVersionsInput, 
          OutputTypesUnion, 
          GetSegmentVersionsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetSegmentVersionsInput) = this()
    /* CompleteClass */
    override val input: GetSegmentVersionsInput = js.native
    val middlewareStack: MiddlewareStack[GetSegmentVersionsInput, GetSegmentVersionsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentVersionsInput, GetSegmentVersionsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentVersionsInput, GetSegmentVersionsOutput] = js.native
  }
  
}

