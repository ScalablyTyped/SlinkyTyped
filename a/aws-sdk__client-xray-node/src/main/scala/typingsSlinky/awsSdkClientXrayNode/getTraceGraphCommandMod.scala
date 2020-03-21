package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesGetTraceGraphInputMod.GetTraceGraphInput
import typingsSlinky.awsSdkClientXrayNode.typesGetTraceGraphOutputMod.GetTraceGraphOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/GetTraceGraphCommand", JSImport.Namespace)
@js.native
object getTraceGraphCommandMod extends js.Object {
  @js.native
  class GetTraceGraphCommand protected () extends Command[
          InputTypesUnion, 
          GetTraceGraphInput, 
          OutputTypesUnion, 
          GetTraceGraphOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetTraceGraphInput) = this()
    /* CompleteClass */
    override val input: GetTraceGraphInput = js.native
    val middlewareStack: MiddlewareStack[GetTraceGraphInput, GetTraceGraphOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetTraceGraphInput, GetTraceGraphOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetTraceGraphInput, GetTraceGraphOutput] = js.native
  }
  
}

