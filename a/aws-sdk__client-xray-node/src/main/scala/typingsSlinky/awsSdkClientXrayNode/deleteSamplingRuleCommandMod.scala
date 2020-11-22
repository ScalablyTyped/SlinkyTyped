package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput
import typingsSlinky.awsSdkClientXrayNode.typesDeleteSamplingRuleOutputMod.DeleteSamplingRuleOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-xray-node/commands/DeleteSamplingRuleCommand", JSImport.Namespace)
@js.native
object deleteSamplingRuleCommandMod extends js.Object {
  
  @js.native
  class DeleteSamplingRuleCommand protected () extends Command[
          InputTypesUnion, 
          DeleteSamplingRuleInput, 
          OutputTypesUnion, 
          DeleteSamplingRuleOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: DeleteSamplingRuleInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: XRayResolvedConfiguration
    ): Handler[DeleteSamplingRuleInput, DeleteSamplingRuleOutput] = js.native
  }
}
