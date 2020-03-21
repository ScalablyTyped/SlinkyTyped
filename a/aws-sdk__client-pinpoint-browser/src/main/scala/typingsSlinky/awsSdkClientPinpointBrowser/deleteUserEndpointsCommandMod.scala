package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsInputMod.DeleteUserEndpointsInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsOutputMod.DeleteUserEndpointsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteUserEndpointsCommand", JSImport.Namespace)
@js.native
object deleteUserEndpointsCommandMod extends js.Object {
  @js.native
  class DeleteUserEndpointsCommand protected () extends Command[
          InputTypesUnion, 
          DeleteUserEndpointsInput, 
          OutputTypesUnion, 
          DeleteUserEndpointsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteUserEndpointsInput) = this()
    /* CompleteClass */
    override val input: DeleteUserEndpointsInput = js.native
    val middlewareStack: MiddlewareStack[DeleteUserEndpointsInput, DeleteUserEndpointsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteUserEndpointsInput, DeleteUserEndpointsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteUserEndpointsInput, DeleteUserEndpointsOutput] = js.native
  }
  
}

