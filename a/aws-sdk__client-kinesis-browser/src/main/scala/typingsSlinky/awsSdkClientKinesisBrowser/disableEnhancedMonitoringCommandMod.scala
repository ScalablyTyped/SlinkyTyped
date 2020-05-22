package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringInputMod.DisableEnhancedMonitoringInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringOutputMod.DisableEnhancedMonitoringOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DisableEnhancedMonitoringCommand", JSImport.Namespace)
@js.native
object disableEnhancedMonitoringCommandMod extends js.Object {
  @js.native
  class DisableEnhancedMonitoringCommand protected () extends Command[
          InputTypesUnion, 
          DisableEnhancedMonitoringInput, 
          OutputTypesUnion, 
          DisableEnhancedMonitoringOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: DisableEnhancedMonitoringInput) = this()
    /* CompleteClass */
    override val input: DisableEnhancedMonitoringInput = js.native
    val middlewareStack: MiddlewareStack[DisableEnhancedMonitoringInput, DisableEnhancedMonitoringOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DisableEnhancedMonitoringInput, DisableEnhancedMonitoringOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DisableEnhancedMonitoringInput, DisableEnhancedMonitoringOutput] = js.native
  }
  
}

