package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesCreateStreamInputMod.CreateStreamInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesCreateStreamOutputMod.CreateStreamOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/CreateStreamCommand", JSImport.Namespace)
@js.native
object createStreamCommandMod extends js.Object {
  @js.native
  class CreateStreamCommand protected () extends Command[
          InputTypesUnion, 
          CreateStreamInput, 
          OutputTypesUnion, 
          CreateStreamOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateStreamInput) = this()
    val middlewareStack: MiddlewareStack[CreateStreamInput, CreateStreamOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[CreateStreamInput, CreateStreamOutput] = js.native
  }
  
}

