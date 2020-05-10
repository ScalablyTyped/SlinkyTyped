package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentInputMod.GetSegmentInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentOutputMod.GetSegmentOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentCommand", JSImport.Namespace)
@js.native
object getSegmentCommandMod extends js.Object {
  @js.native
  class GetSegmentCommand protected () extends Command[
          InputTypesUnion, 
          GetSegmentInput, 
          OutputTypesUnion, 
          GetSegmentOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetSegmentInput) = this()
    val middlewareStack: MiddlewareStack[GetSegmentInput, GetSegmentOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentInput, GetSegmentOutput] = js.native
  }
  
}

