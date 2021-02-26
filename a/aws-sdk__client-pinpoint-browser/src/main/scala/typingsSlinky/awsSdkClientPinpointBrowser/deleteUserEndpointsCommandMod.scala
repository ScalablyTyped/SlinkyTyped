package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsInputMod.DeleteUserEndpointsInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsOutputMod.DeleteUserEndpointsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteUserEndpointsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteUserEndpointsCommand", "DeleteUserEndpointsCommand")
  @js.native
  class DeleteUserEndpointsCommand protected () extends Command[
          InputTypesUnion, 
          DeleteUserEndpointsInput, 
          OutputTypesUnion, 
          DeleteUserEndpointsOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteUserEndpointsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteUserEndpointsInput, DeleteUserEndpointsOutput] = js.native
  }
}
