package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesBatchGetTracesInputMod.BatchGetTracesInput
import typingsSlinky.awsSdkClientXrayNode.typesBatchGetTracesOutputMod.BatchGetTracesOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-xray-node/commands/BatchGetTracesCommand", JSImport.Namespace)
@js.native
object batchGetTracesCommandMod extends js.Object {
  
  @js.native
  class BatchGetTracesCommand protected () extends Command[
          InputTypesUnion, 
          BatchGetTracesInput, 
          OutputTypesUnion, 
          BatchGetTracesOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: BatchGetTracesInput) = this()
    
    val middlewareStack: MiddlewareStack[BatchGetTracesInput, BatchGetTracesOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[BatchGetTracesInput, BatchGetTracesOutput] = js.native
  }
}
