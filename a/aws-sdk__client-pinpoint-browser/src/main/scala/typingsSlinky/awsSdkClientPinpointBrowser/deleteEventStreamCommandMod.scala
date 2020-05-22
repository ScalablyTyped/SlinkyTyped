package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEventStreamInputMod.DeleteEventStreamInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEventStreamOutputMod.DeleteEventStreamOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteEventStreamCommand", JSImport.Namespace)
@js.native
object deleteEventStreamCommandMod extends js.Object {
  @js.native
  class DeleteEventStreamCommand protected () extends Command[
          InputTypesUnion, 
          DeleteEventStreamInput, 
          OutputTypesUnion, 
          DeleteEventStreamOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteEventStreamInput) = this()
    /* CompleteClass */
    override val input: DeleteEventStreamInput = js.native
    val middlewareStack: MiddlewareStack[DeleteEventStreamInput, DeleteEventStreamOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteEventStreamInput, DeleteEventStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteEventStreamInput, DeleteEventStreamOutput] = js.native
  }
  
}

