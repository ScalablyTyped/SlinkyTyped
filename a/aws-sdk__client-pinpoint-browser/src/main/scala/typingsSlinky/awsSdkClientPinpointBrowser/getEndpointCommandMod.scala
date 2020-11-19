package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetEndpointInputMod.GetEndpointInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetEndpointOutputMod.GetEndpointOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetEndpointCommand", JSImport.Namespace)
@js.native
object getEndpointCommandMod extends js.Object {
  
  @js.native
  class GetEndpointCommand protected () extends Command[
          InputTypesUnion, 
          GetEndpointInput, 
          OutputTypesUnion, 
          GetEndpointOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetEndpointInput) = this()
    
    val middlewareStack: MiddlewareStack[GetEndpointInput, GetEndpointOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetEndpointInput, GetEndpointOutput] = js.native
  }
}
