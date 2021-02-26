package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesMergeShardsInputMod.MergeShardsInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesMergeShardsOutputMod.MergeShardsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeShardsCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/MergeShardsCommand", "MergeShardsCommand")
  @js.native
  class MergeShardsCommand protected () extends Command[
          InputTypesUnion, 
          MergeShardsInput, 
          OutputTypesUnion, 
          MergeShardsOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: MergeShardsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[MergeShardsInput, MergeShardsOutput] = js.native
  }
}
