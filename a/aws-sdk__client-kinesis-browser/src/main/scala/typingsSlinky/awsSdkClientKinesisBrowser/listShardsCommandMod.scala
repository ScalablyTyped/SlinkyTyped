package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesListShardsInputMod.ListShardsInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesListShardsOutputMod.ListShardsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/ListShardsCommand", JSImport.Namespace)
@js.native
object listShardsCommandMod extends js.Object {
  @js.native
  class ListShardsCommand protected () extends Command[
          InputTypesUnion, 
          ListShardsInput, 
          OutputTypesUnion, 
          ListShardsOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListShardsInput) = this()
    /* CompleteClass */
    override val input: ListShardsInput = js.native
    val middlewareStack: MiddlewareStack[ListShardsInput, ListShardsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListShardsInput, ListShardsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListShardsInput, ListShardsOutput] = js.native
  }
  
}

