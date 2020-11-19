package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentsInputMod.GetSegmentsInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentsOutputMod.GetSegmentsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentsCommand", JSImport.Namespace)
@js.native
object getSegmentsCommandMod extends js.Object {
  
  @js.native
  class GetSegmentsCommand protected () extends Command[
          InputTypesUnion, 
          GetSegmentsInput, 
          OutputTypesUnion, 
          GetSegmentsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetSegmentsInput) = this()
    
    val middlewareStack: MiddlewareStack[GetSegmentsInput, GetSegmentsOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentsInput, GetSegmentsOutput] = js.native
  }
}
