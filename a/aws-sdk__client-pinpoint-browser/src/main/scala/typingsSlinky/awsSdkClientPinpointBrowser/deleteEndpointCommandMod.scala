package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEndpointInputMod.DeleteEndpointInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEndpointOutputMod.DeleteEndpointOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteEndpointCommand", JSImport.Namespace)
@js.native
object deleteEndpointCommandMod extends js.Object {
  @js.native
  class DeleteEndpointCommand protected () extends Command[
          InputTypesUnion, 
          DeleteEndpointInput, 
          OutputTypesUnion, 
          DeleteEndpointOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteEndpointInput) = this()
    /* CompleteClass */
    override val input: DeleteEndpointInput = js.native
    val middlewareStack: MiddlewareStack[DeleteEndpointInput, DeleteEndpointOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteEndpointInput, DeleteEndpointOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteEndpointInput, DeleteEndpointOutput] = js.native
  }
  
}

