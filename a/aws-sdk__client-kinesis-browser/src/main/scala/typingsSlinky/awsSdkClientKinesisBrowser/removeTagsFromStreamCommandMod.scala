package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamInputMod.RemoveTagsFromStreamInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamOutputMod.RemoveTagsFromStreamOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object removeTagsFromStreamCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/RemoveTagsFromStreamCommand", "RemoveTagsFromStreamCommand")
  @js.native
  class RemoveTagsFromStreamCommand protected () extends Command[
          InputTypesUnion, 
          RemoveTagsFromStreamInput, 
          OutputTypesUnion, 
          RemoveTagsFromStreamOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: RemoveTagsFromStreamInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[RemoveTagsFromStreamInput, RemoveTagsFromStreamOutput] = js.native
  }
}
