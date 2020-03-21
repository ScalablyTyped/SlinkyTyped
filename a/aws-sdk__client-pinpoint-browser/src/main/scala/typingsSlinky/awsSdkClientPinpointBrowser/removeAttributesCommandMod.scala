package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesRemoveAttributesInputMod.RemoveAttributesInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesRemoveAttributesOutputMod.RemoveAttributesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/RemoveAttributesCommand", JSImport.Namespace)
@js.native
object removeAttributesCommandMod extends js.Object {
  @js.native
  class RemoveAttributesCommand protected () extends Command[
          InputTypesUnion, 
          RemoveAttributesInput, 
          OutputTypesUnion, 
          RemoveAttributesOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: RemoveAttributesInput) = this()
    /* CompleteClass */
    override val input: RemoveAttributesInput = js.native
    val middlewareStack: MiddlewareStack[RemoveAttributesInput, RemoveAttributesOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[RemoveAttributesInput, RemoveAttributesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[RemoveAttributesInput, RemoveAttributesOutput] = js.native
  }
  
}

