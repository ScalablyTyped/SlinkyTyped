package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput
import typingsSlinky.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesOutputMod.GetSamplingStatisticSummariesOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-xray-node/commands/GetSamplingStatisticSummariesCommand", JSImport.Namespace)
@js.native
object getSamplingStatisticSummariesCommandMod extends js.Object {
  
  @js.native
  class GetSamplingStatisticSummariesCommand protected () extends Command[
          InputTypesUnion, 
          GetSamplingStatisticSummariesInput, 
          OutputTypesUnion, 
          GetSamplingStatisticSummariesOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetSamplingStatisticSummariesInput) = this()
    
    val middlewareStack: MiddlewareStack[GetSamplingStatisticSummariesInput, GetSamplingStatisticSummariesOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetSamplingStatisticSummariesInput, GetSamplingStatisticSummariesOutput] = js.native
  }
}
