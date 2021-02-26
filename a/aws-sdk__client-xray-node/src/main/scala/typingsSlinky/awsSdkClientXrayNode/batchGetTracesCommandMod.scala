package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesBatchGetTracesInputMod.BatchGetTracesInput
import typingsSlinky.awsSdkClientXrayNode.typesBatchGetTracesOutputMod.BatchGetTracesOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchGetTracesCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/BatchGetTracesCommand", "BatchGetTracesCommand")
  @js.native
  class BatchGetTracesCommand protected () extends Command[
          InputTypesUnion, 
          BatchGetTracesInput, 
          OutputTypesUnion, 
          BatchGetTracesOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: BatchGetTracesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: XRayResolvedConfiguration
    ): Handler[BatchGetTracesInput, BatchGetTracesOutput] = js.native
  }
}
