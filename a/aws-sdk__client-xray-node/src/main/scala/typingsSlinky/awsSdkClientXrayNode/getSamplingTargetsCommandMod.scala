package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput
import typingsSlinky.awsSdkClientXrayNode.typesGetSamplingTargetsOutputMod.GetSamplingTargetsOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
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
          XRayResolvedConfiguration
        ] {
    def this(input: GetSamplingTargetsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: XRayResolvedConfiguration
    ): Handler[GetSamplingTargetsInput, GetSamplingTargetsOutput] = js.native
  }
}
