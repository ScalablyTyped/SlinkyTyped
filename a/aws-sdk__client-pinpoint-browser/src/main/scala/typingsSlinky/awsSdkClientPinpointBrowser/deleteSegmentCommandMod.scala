package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteSegmentInputMod.DeleteSegmentInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteSegmentOutputMod.DeleteSegmentOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteSegmentCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteSegmentCommand", "DeleteSegmentCommand")
  @js.native
  class DeleteSegmentCommand protected () extends Command[
          InputTypesUnion, 
          DeleteSegmentInput, 
          OutputTypesUnion, 
          DeleteSegmentOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteSegmentInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteSegmentInput, DeleteSegmentOutput] = js.native
  }
}
