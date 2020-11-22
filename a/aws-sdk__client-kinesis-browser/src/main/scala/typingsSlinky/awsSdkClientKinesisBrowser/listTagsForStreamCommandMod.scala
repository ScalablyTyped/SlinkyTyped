package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesListTagsForStreamInputMod.ListTagsForStreamInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesListTagsForStreamOutputMod.ListTagsForStreamOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kinesis-browser/commands/ListTagsForStreamCommand", JSImport.Namespace)
@js.native
object listTagsForStreamCommandMod extends js.Object {
  
  @js.native
  class ListTagsForStreamCommand protected () extends Command[
          InputTypesUnion, 
          ListTagsForStreamInput, 
          OutputTypesUnion, 
          ListTagsForStreamOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: ListTagsForStreamInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[ListTagsForStreamInput, ListTagsForStreamOutput] = js.native
  }
}
