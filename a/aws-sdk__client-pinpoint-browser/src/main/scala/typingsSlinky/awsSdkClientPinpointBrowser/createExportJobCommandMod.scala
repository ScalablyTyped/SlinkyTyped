package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesCreateExportJobInputMod.CreateExportJobInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesCreateExportJobOutputMod.CreateExportJobOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateExportJobCommand", JSImport.Namespace)
@js.native
object createExportJobCommandMod extends js.Object {
  @js.native
  class CreateExportJobCommand protected () extends Command[
          InputTypesUnion, 
          CreateExportJobInput, 
          OutputTypesUnion, 
          CreateExportJobOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateExportJobInput) = this()
    /* CompleteClass */
    override val input: CreateExportJobInput = js.native
    val middlewareStack: MiddlewareStack[CreateExportJobInput, CreateExportJobOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateExportJobInput, CreateExportJobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateExportJobInput, CreateExportJobOutput] = js.native
  }
  
}

