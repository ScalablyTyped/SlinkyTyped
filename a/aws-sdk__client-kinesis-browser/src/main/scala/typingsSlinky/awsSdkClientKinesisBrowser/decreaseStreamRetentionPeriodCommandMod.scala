package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodInputMod.DecreaseStreamRetentionPeriodInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodOutputMod.DecreaseStreamRetentionPeriodOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DecreaseStreamRetentionPeriodCommand", JSImport.Namespace)
@js.native
object decreaseStreamRetentionPeriodCommandMod extends js.Object {
  @js.native
  class DecreaseStreamRetentionPeriodCommand protected () extends Command[
          InputTypesUnion, 
          DecreaseStreamRetentionPeriodInput, 
          OutputTypesUnion, 
          DecreaseStreamRetentionPeriodOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: DecreaseStreamRetentionPeriodInput) = this()
    val middlewareStack: MiddlewareStack[DecreaseStreamRetentionPeriodInput, DecreaseStreamRetentionPeriodOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DecreaseStreamRetentionPeriodInput, DecreaseStreamRetentionPeriodOutput] = js.native
  }
  
}

