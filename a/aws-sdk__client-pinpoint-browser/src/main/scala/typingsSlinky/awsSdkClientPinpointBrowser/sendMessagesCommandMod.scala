package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesSendMessagesInputMod.SendMessagesInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesSendMessagesOutputMod.SendMessagesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/SendMessagesCommand", JSImport.Namespace)
@js.native
object sendMessagesCommandMod extends js.Object {
  @js.native
  class SendMessagesCommand protected () extends Command[
          InputTypesUnion, 
          SendMessagesInput, 
          OutputTypesUnion, 
          SendMessagesOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: SendMessagesInput) = this()
    /* CompleteClass */
    override val input: SendMessagesInput = js.native
    val middlewareStack: MiddlewareStack[SendMessagesInput, SendMessagesOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[SendMessagesInput, SendMessagesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[SendMessagesInput, SendMessagesOutput] = js.native
  }
  
}

