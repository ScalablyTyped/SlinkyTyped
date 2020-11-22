package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput
import typingsSlinky.awsSdkClientXrayNode.typesUpdateSamplingRuleOutputMod.UpdateSamplingRuleOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-xray-node/commands/UpdateSamplingRuleCommand", JSImport.Namespace)
@js.native
object updateSamplingRuleCommandMod extends js.Object {
  
  @js.native
  class UpdateSamplingRuleCommand protected () extends Command[
          InputTypesUnion, 
          UpdateSamplingRuleInput, 
          OutputTypesUnion, 
          UpdateSamplingRuleOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: UpdateSamplingRuleInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: XRayResolvedConfiguration
    ): Handler[UpdateSamplingRuleInput, UpdateSamplingRuleOutput] = js.native
  }
}
