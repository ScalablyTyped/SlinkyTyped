package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesCreateSegmentInputMod.CreateSegmentInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesCreateSegmentOutputMod.CreateSegmentOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSegmentCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateSegmentCommand", "CreateSegmentCommand")
  @js.native
  class CreateSegmentCommand protected () extends Command[
          InputTypesUnion, 
          CreateSegmentInput, 
          OutputTypesUnion, 
          CreateSegmentOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: CreateSegmentInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateSegmentInput, CreateSegmentOutput] = js.native
  }
}
