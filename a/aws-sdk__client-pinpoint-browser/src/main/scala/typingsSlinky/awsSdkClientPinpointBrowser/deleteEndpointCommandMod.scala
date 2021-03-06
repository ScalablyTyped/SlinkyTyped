package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEndpointInputMod.DeleteEndpointInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEndpointOutputMod.DeleteEndpointOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteEndpointCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteEndpointCommand", "DeleteEndpointCommand")
  @js.native
  class DeleteEndpointCommand protected () extends Command[
          InputTypesUnion, 
          DeleteEndpointInput, 
          OutputTypesUnion, 
          DeleteEndpointOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteEndpointInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteEndpointInput, DeleteEndpointOutput] = js.native
  }
}
