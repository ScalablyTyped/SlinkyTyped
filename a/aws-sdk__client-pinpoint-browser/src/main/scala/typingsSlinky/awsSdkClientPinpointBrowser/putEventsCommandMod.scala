package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesPutEventsInputMod.PutEventsInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesPutEventsOutputMod.PutEventsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/PutEventsCommand", JSImport.Namespace)
@js.native
object putEventsCommandMod extends js.Object {
  @js.native
  class PutEventsCommand protected () extends Command[
          InputTypesUnion, 
          PutEventsInput, 
          OutputTypesUnion, 
          PutEventsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutEventsInput) = this()
    val middlewareStack: MiddlewareStack[PutEventsInput, PutEventsOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[PutEventsInput, PutEventsOutput] = js.native
  }
  
}

