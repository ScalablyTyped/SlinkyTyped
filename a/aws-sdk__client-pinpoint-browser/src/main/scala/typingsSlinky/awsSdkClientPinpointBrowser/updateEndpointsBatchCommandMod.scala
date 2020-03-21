package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchInputMod.UpdateEndpointsBatchInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchOutputMod.UpdateEndpointsBatchOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateEndpointsBatchCommand", JSImport.Namespace)
@js.native
object updateEndpointsBatchCommandMod extends js.Object {
  @js.native
  class UpdateEndpointsBatchCommand protected () extends Command[
          InputTypesUnion, 
          UpdateEndpointsBatchInput, 
          OutputTypesUnion, 
          UpdateEndpointsBatchOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateEndpointsBatchInput) = this()
    /* CompleteClass */
    override val input: UpdateEndpointsBatchInput = js.native
    val middlewareStack: MiddlewareStack[UpdateEndpointsBatchInput, UpdateEndpointsBatchOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateEndpointsBatchInput, UpdateEndpointsBatchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateEndpointsBatchInput, UpdateEndpointsBatchOutput] = js.native
  }
  
}

