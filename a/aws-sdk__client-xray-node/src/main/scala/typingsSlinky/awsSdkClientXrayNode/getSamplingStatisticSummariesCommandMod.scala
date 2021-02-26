package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput
import typingsSlinky.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesOutputMod.GetSamplingStatisticSummariesOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getSamplingStatisticSummariesCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/GetSamplingStatisticSummariesCommand", "GetSamplingStatisticSummariesCommand")
  @js.native
  class GetSamplingStatisticSummariesCommand protected () extends Command[
          InputTypesUnion, 
          GetSamplingStatisticSummariesInput, 
          OutputTypesUnion, 
          GetSamplingStatisticSummariesOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: GetSamplingStatisticSummariesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: XRayResolvedConfiguration
    ): Handler[GetSamplingStatisticSummariesInput, GetSamplingStatisticSummariesOutput] = js.native
  }
}
