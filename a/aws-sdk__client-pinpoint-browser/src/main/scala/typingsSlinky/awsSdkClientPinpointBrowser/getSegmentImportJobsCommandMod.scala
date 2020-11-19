package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsInputMod.GetSegmentImportJobsInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsOutputMod.GetSegmentImportJobsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentImportJobsCommand", JSImport.Namespace)
@js.native
object getSegmentImportJobsCommandMod extends js.Object {
  
  @js.native
  class GetSegmentImportJobsCommand protected () extends Command[
          InputTypesUnion, 
          GetSegmentImportJobsInput, 
          OutputTypesUnion, 
          GetSegmentImportJobsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetSegmentImportJobsInput) = this()
    
    val middlewareStack: MiddlewareStack[GetSegmentImportJobsInput, GetSegmentImportJobsOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentImportJobsInput, GetSegmentImportJobsOutput] = js.native
  }
}
