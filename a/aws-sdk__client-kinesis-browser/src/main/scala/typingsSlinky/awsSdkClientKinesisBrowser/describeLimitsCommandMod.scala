package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeLimitsOutputMod.DescribeLimitsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object describeLimitsCommandMod {
  
  @JSImport("@aws-sdk/client-kinesis-browser/commands/DescribeLimitsCommand", "DescribeLimitsCommand")
  @js.native
  class DescribeLimitsCommand protected () extends Command[
          InputTypesUnion, 
          DescribeLimitsInput, 
          OutputTypesUnion, 
          DescribeLimitsOutput, 
          KinesisResolvedConfiguration
        ] {
    def this(input: DescribeLimitsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: KinesisResolvedConfiguration
    ): Handler[DescribeLimitsInput, DescribeLimitsOutput] = js.native
  }
}
