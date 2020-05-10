package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetEventStreamInputMod.GetEventStreamInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetEventStreamOutputMod.GetEventStreamOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetEventStreamCommand", JSImport.Namespace)
@js.native
object getEventStreamCommandMod extends js.Object {
  @js.native
  class GetEventStreamCommand protected () extends Command[
          InputTypesUnion, 
          GetEventStreamInput, 
          OutputTypesUnion, 
          GetEventStreamOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetEventStreamInput) = this()
    val middlewareStack: MiddlewareStack[GetEventStreamInput, GetEventStreamOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetEventStreamInput, GetEventStreamOutput] = js.native
  }
  
}

