package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobsInputMod.GetExportJobsInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetExportJobsOutputMod.GetExportJobsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetExportJobsCommand", JSImport.Namespace)
@js.native
object getExportJobsCommandMod extends js.Object {
  @js.native
  class GetExportJobsCommand protected () extends Command[
          InputTypesUnion, 
          GetExportJobsInput, 
          OutputTypesUnion, 
          GetExportJobsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetExportJobsInput) = this()
    /* CompleteClass */
    override val input: GetExportJobsInput = js.native
    val middlewareStack: MiddlewareStack[GetExportJobsInput, GetExportJobsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetExportJobsInput, GetExportJobsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetExportJobsInput, GetExportJobsOutput] = js.native
  }
  
}

