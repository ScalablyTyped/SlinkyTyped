package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesSplitShardInputMod.SplitShardInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesSplitShardOutputMod.SplitShardOutput
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
          KinesisResolvedConfiguration
        ] {
    def this(input: SplitShardInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[SplitShardInput, SplitShardOutput] = js.native
  }
}
