package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesCreateSegmentInputMod.CreateSegmentInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesCreateSegmentOutputMod.CreateSegmentOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateSegmentCommand", JSImport.Namespace)
@js.native
object createSegmentCommandMod extends js.Object {
  
  @js.native
  class CreateSegmentCommand protected () extends Command[
          InputTypesUnion, 
          CreateSegmentInput, 
          OutputTypesUnion, 
          CreateSegmentOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateSegmentInput) = this()
    
    val middlewareStack: MiddlewareStack[CreateSegmentInput, CreateSegmentOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateSegmentInput, CreateSegmentOutput] = js.native
  }
}
