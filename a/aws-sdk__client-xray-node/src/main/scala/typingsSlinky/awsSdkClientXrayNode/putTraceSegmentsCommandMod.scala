package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput
import typingsSlinky.awsSdkClientXrayNode.typesPutTraceSegmentsOutputMod.PutTraceSegmentsOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-xray-node/commands/PutTraceSegmentsCommand", JSImport.Namespace)
@js.native
object putTraceSegmentsCommandMod extends js.Object {
  
  @js.native
  class PutTraceSegmentsCommand protected () extends Command[
          InputTypesUnion, 
          PutTraceSegmentsInput, 
          OutputTypesUnion, 
          PutTraceSegmentsOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutTraceSegmentsInput) = this()
    
    val middlewareStack: MiddlewareStack[PutTraceSegmentsInput, PutTraceSegmentsOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[PutTraceSegmentsInput, PutTraceSegmentsOutput] = js.native
  }
}
