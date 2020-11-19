package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEndpointInputMod.UpdateEndpointInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesUpdateEndpointOutputMod.UpdateEndpointOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateEndpointCommand", JSImport.Namespace)
@js.native
object updateEndpointCommandMod extends js.Object {
  
  @js.native
  class UpdateEndpointCommand protected () extends Command[
          InputTypesUnion, 
          UpdateEndpointInput, 
          OutputTypesUnion, 
          UpdateEndpointOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateEndpointInput) = this()
    
    val middlewareStack: MiddlewareStack[UpdateEndpointInput, UpdateEndpointOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateEndpointInput, UpdateEndpointOutput] = js.native
  }
}
