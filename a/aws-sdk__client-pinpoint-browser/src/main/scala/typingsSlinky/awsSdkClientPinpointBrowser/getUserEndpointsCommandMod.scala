package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetUserEndpointsInputMod.GetUserEndpointsInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetUserEndpointsOutputMod.GetUserEndpointsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    
    val middlewareStack: MiddlewareStack[GetUserEndpointsInput, GetUserEndpointsOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetUserEndpointsInput, GetUserEndpointsOutput] = js.native
  }
}
