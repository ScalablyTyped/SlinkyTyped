package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesAddTagsToStreamInputMod.AddTagsToStreamInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesAddTagsToStreamOutputMod.AddTagsToStreamOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kinesis-browser/commands/AddTagsToStreamCommand", JSImport.Namespace)
@js.native
object addTagsToStreamCommandMod extends js.Object {
  
  @js.native
  class AddTagsToStreamCommand protected () extends Command[
          InputTypesUnion, 
          AddTagsToStreamInput, 
          OutputTypesUnion, 
          AddTagsToStreamOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: AddTagsToStreamInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[AddTagsToStreamInput, AddTagsToStreamOutput] = js.native
  }
}
