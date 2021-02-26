package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsInputMod.GetSegmentImportJobsInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetSegmentImportJobsOutputMod.GetSegmentImportJobsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSegmentImportJobsCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetSegmentImportJobsCommand", "GetSegmentImportJobsCommand")
  @js.native
  class GetSegmentImportJobsCommand protected () extends Command[
          InputTypesUnion, 
          GetSegmentImportJobsInput, 
          OutputTypesUnion, 
          GetSegmentImportJobsOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetSegmentImportJobsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetSegmentImportJobsInput, GetSegmentImportJobsOutput] = js.native
  }
}
