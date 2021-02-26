package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodInputMod.IncreaseStreamRetentionPeriodInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodOutputMod.IncreaseStreamRetentionPeriodOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object increaseStreamRetentionPeriodCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/IncreaseStreamRetentionPeriodCommand", "IncreaseStreamRetentionPeriodCommand")
  @js.native
  class IncreaseStreamRetentionPeriodCommand protected () extends Command[
          InputTypesUnion, 
          IncreaseStreamRetentionPeriodInput, 
          OutputTypesUnion, 
          IncreaseStreamRetentionPeriodOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: IncreaseStreamRetentionPeriodInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[IncreaseStreamRetentionPeriodInput, IncreaseStreamRetentionPeriodOutput] = js.native
  }
}
