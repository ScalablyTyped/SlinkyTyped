package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsChannelInputMod.DeleteApnsChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteApnsChannelOutputMod.DeleteApnsChannelOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteApnsChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteApnsChannelCommand", "DeleteApnsChannelCommand")
  @js.native
  class DeleteApnsChannelCommand protected () extends Command[
          InputTypesUnion, 
          DeleteApnsChannelInput, 
          OutputTypesUnion, 
          DeleteApnsChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteApnsChannelInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteApnsChannelInput, DeleteApnsChannelOutput] = js.native
  }
}
