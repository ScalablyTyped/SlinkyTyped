package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput
import typingsSlinky.awsSdkClientXrayNode.typesPutTraceSegmentsOutputMod.PutTraceSegmentsOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
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
          XRayResolvedConfiguration
        ] {
    def this(input: PutTraceSegmentsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: XRayResolvedConfiguration
    ): Handler[PutTraceSegmentsInput, PutTraceSegmentsOutput] = js.native
  }
}
