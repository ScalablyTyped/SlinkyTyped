package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodInputMod.IncreaseStreamRetentionPeriodInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodOutputMod.IncreaseStreamRetentionPeriodOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kinesis-browser/commands/IncreaseStreamRetentionPeriodCommand", JSImport.Namespace)
@js.native
object increaseStreamRetentionPeriodCommandMod extends js.Object {
  
  @js.native
  class IncreaseStreamRetentionPeriodCommand protected () extends Command[
          InputTypesUnion, 
          IncreaseStreamRetentionPeriodInput, 
          OutputTypesUnion, 
          IncreaseStreamRetentionPeriodOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: IncreaseStreamRetentionPeriodInput) = this()
    
    val middlewareStack: MiddlewareStack[IncreaseStreamRetentionPeriodInput, IncreaseStreamRetentionPeriodOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[IncreaseStreamRetentionPeriodInput, IncreaseStreamRetentionPeriodOutput] = js.native
  }
}
