package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesCreateSamplingRuleInputMod.CreateSamplingRuleInput
import typingsSlinky.awsSdkClientXrayNode.typesCreateSamplingRuleOutputMod.CreateSamplingRuleOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/CreateSamplingRuleCommand", JSImport.Namespace)
@js.native
object createSamplingRuleCommandMod extends js.Object {
  @js.native
  class CreateSamplingRuleCommand protected () extends Command[
          InputTypesUnion, 
          CreateSamplingRuleInput, 
          OutputTypesUnion, 
          CreateSamplingRuleOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateSamplingRuleInput) = this()
    /* CompleteClass */
    override val input: CreateSamplingRuleInput = js.native
    val middlewareStack: MiddlewareStack[CreateSamplingRuleInput, CreateSamplingRuleOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[CreateSamplingRuleInput, CreateSamplingRuleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[CreateSamplingRuleInput, CreateSamplingRuleOutput] = js.native
  }
  
}

