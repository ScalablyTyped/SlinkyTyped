package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesUpdateShardCountInputMod.UpdateShardCountInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesUpdateShardCountOutputMod.UpdateShardCountOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/UpdateShardCountCommand", JSImport.Namespace)
@js.native
object updateShardCountCommandMod extends js.Object {
  @js.native
  class UpdateShardCountCommand protected () extends Command[
          InputTypesUnion, 
          UpdateShardCountInput, 
          OutputTypesUnion, 
          UpdateShardCountOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateShardCountInput) = this()
    /* CompleteClass */
    override val input: UpdateShardCountInput = js.native
    val middlewareStack: MiddlewareStack[UpdateShardCountInput, UpdateShardCountOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[UpdateShardCountInput, UpdateShardCountOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[UpdateShardCountInput, UpdateShardCountOutput] = js.native
  }
  
}

