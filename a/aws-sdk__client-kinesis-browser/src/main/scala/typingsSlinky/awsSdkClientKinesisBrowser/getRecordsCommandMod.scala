package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesGetRecordsInputMod.GetRecordsInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesGetRecordsOutputMod.GetRecordsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kinesis-browser/commands/GetRecordsCommand", JSImport.Namespace)
@js.native
object getRecordsCommandMod extends js.Object {
  
  @js.native
  class GetRecordsCommand protected () extends Command[
          InputTypesUnion, 
          GetRecordsInput, 
          OutputTypesUnion, 
          GetRecordsOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: GetRecordsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[GetRecordsInput, GetRecordsOutput] = js.native
  }
}
