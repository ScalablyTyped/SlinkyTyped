package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesMergeShardsInputMod.MergeShardsInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesMergeShardsOutputMod.MergeShardsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kinesis-browser/commands/MergeShardsCommand", JSImport.Namespace)
@js.native
object mergeShardsCommandMod extends js.Object {
  
  @js.native
  class MergeShardsCommand protected () extends Command[
          InputTypesUnion, 
          MergeShardsInput, 
          OutputTypesUnion, 
          MergeShardsOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: MergeShardsInput) = this()
    
    val middlewareStack: MiddlewareStack[MergeShardsInput, MergeShardsOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[MergeShardsInput, MergeShardsOutput] = js.native
  }
}
