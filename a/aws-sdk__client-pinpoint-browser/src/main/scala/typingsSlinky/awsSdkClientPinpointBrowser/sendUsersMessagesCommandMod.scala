package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesSendUsersMessagesInputMod.SendUsersMessagesInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesSendUsersMessagesOutputMod.SendUsersMessagesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/SendUsersMessagesCommand", JSImport.Namespace)
@js.native
object sendUsersMessagesCommandMod extends js.Object {
  @js.native
  class SendUsersMessagesCommand protected () extends Command[
          InputTypesUnion, 
          SendUsersMessagesInput, 
          OutputTypesUnion, 
          SendUsersMessagesOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: SendUsersMessagesInput) = this()
    /* CompleteClass */
    override val input: SendUsersMessagesInput = js.native
    val middlewareStack: MiddlewareStack[SendUsersMessagesInput, SendUsersMessagesOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[SendUsersMessagesInput, SendUsersMessagesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[SendUsersMessagesInput, SendUsersMessagesOutput] = js.native
  }
  
}

