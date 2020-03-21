package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesGetShardIteratorInputMod.GetShardIteratorInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesGetShardIteratorOutputMod.GetShardIteratorOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/GetShardIteratorCommand", JSImport.Namespace)
@js.native
object getShardIteratorCommandMod extends js.Object {
  @js.native
  class GetShardIteratorCommand protected () extends Command[
          InputTypesUnion, 
          GetShardIteratorInput, 
          OutputTypesUnion, 
          GetShardIteratorOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetShardIteratorInput) = this()
    /* CompleteClass */
    override val input: GetShardIteratorInput = js.native
    val middlewareStack: MiddlewareStack[GetShardIteratorInput, GetShardIteratorOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[GetShardIteratorInput, GetShardIteratorOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[GetShardIteratorInput, GetShardIteratorOutput] = js.native
  }
  
}

