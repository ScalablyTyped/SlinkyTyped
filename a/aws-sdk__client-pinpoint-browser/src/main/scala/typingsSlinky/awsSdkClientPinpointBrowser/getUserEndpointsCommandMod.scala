package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetUserEndpointsInputMod.GetUserEndpointsInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetUserEndpointsOutputMod.GetUserEndpointsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetUserEndpointsCommand", JSImport.Namespace)
@js.native
object getUserEndpointsCommandMod extends js.Object {
  @js.native
  class GetUserEndpointsCommand protected () extends Command[
          InputTypesUnion, 
          GetUserEndpointsInput, 
          OutputTypesUnion, 
          GetUserEndpointsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetUserEndpointsInput) = this()
    /* CompleteClass */
    override val input: GetUserEndpointsInput = js.native
    val middlewareStack: MiddlewareStack[GetUserEndpointsInput, GetUserEndpointsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetUserEndpointsInput, GetUserEndpointsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetUserEndpointsInput, GetUserEndpointsOutput] = js.native
  }
  
}

