package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesListStreamConsumersInputMod.ListStreamConsumersInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesListStreamConsumersOutputMod.ListStreamConsumersOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/ListStreamConsumersCommand", JSImport.Namespace)
@js.native
object listStreamConsumersCommandMod extends js.Object {
  @js.native
  class ListStreamConsumersCommand protected () extends Command[
          InputTypesUnion, 
          ListStreamConsumersInput, 
          OutputTypesUnion, 
          ListStreamConsumersOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListStreamConsumersInput) = this()
    /* CompleteClass */
    override val input: ListStreamConsumersInput = js.native
    val middlewareStack: MiddlewareStack[ListStreamConsumersInput, ListStreamConsumersOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListStreamConsumersInput, ListStreamConsumersOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListStreamConsumersInput, ListStreamConsumersOutput] = js.native
  }
  
}

