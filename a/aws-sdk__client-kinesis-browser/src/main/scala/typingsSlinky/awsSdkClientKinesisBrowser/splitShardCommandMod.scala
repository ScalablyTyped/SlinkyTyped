package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesSplitShardInputMod.SplitShardInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesSplitShardOutputMod.SplitShardOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kinesis-browser/commands/SplitShardCommand", JSImport.Namespace)
@js.native
object splitShardCommandMod extends js.Object {
  
  @js.native
  class SplitShardCommand protected () extends Command[
          InputTypesUnion, 
          SplitShardInput, 
          OutputTypesUnion, 
          SplitShardOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: SplitShardInput) = this()
    
    val middlewareStack: MiddlewareStack[SplitShardInput, SplitShardOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[SplitShardInput, SplitShardOutput] = js.native
  }
}
