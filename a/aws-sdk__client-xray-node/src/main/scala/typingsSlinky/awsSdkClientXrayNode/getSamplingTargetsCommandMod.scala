package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput
import typingsSlinky.awsSdkClientXrayNode.typesGetSamplingTargetsOutputMod.GetSamplingTargetsOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-xray-node/commands/GetSamplingTargetsCommand", JSImport.Namespace)
@js.native
object getSamplingTargetsCommandMod extends js.Object {
  
  @js.native
  class GetSamplingTargetsCommand protected () extends Command[
          InputTypesUnion, 
          GetSamplingTargetsInput, 
          OutputTypesUnion, 
          GetSamplingTargetsOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetSamplingTargetsInput) = this()
    
    val middlewareStack: MiddlewareStack[GetSamplingTargetsInput, GetSamplingTargetsOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetSamplingTargetsInput, GetSamplingTargetsOutput] = js.native
  }
}
