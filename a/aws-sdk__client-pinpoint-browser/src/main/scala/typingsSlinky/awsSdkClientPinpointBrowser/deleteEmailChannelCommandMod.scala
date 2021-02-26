package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEmailChannelInputMod.DeleteEmailChannelInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteEmailChannelOutputMod.DeleteEmailChannelOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteEmailChannelCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteEmailChannelCommand", "DeleteEmailChannelCommand")
  @js.native
  class DeleteEmailChannelCommand protected () extends Command[
          InputTypesUnion, 
          DeleteEmailChannelInput, 
          OutputTypesUnion, 
          DeleteEmailChannelOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteEmailChannelInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteEmailChannelInput, DeleteEmailChannelOutput] = js.native
  }
}
