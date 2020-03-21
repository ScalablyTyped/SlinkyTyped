package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobsInputMod.GetImportJobsInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetImportJobsOutputMod.GetImportJobsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetImportJobsCommand", JSImport.Namespace)
@js.native
object getImportJobsCommandMod extends js.Object {
  @js.native
  class GetImportJobsCommand protected () extends Command[
          InputTypesUnion, 
          GetImportJobsInput, 
          OutputTypesUnion, 
          GetImportJobsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetImportJobsInput) = this()
    /* CompleteClass */
    override val input: GetImportJobsInput = js.native
    val middlewareStack: MiddlewareStack[GetImportJobsInput, GetImportJobsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetImportJobsInput, GetImportJobsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetImportJobsInput, GetImportJobsOutput] = js.native
  }
  
}

