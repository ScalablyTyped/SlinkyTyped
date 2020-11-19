package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput
import typingsSlinky.awsSdkClientXrayNode.typesUpdateSamplingRuleOutputMod.UpdateSamplingRuleOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
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
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateSamplingRuleInput) = this()
    
    val middlewareStack: MiddlewareStack[UpdateSamplingRuleInput, UpdateSamplingRuleOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[UpdateSamplingRuleInput, UpdateSamplingRuleOutput] = js.native
  }
}
