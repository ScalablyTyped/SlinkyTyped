package typingsSlinky.atAwsDashSdkClientDashLambdaDashNode

import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesGetPolicyInputMod.GetPolicyInput
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesGetPolicyOutputMod.GetPolicyOutput
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetPolicyCommand", JSImport.Namespace)
@js.native
object commandsGetPolicyCommandMod extends js.Object {
  @js.native
  class GetPolicyCommand protected () extends Command[
          InputTypesUnion, 
          GetPolicyInput, 
          OutputTypesUnion, 
          GetPolicyOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetPolicyInput) = this()
    /* CompleteClass */
    override val input: GetPolicyInput = js.native
    val middlewareStack: MiddlewareStack[GetPolicyInput, GetPolicyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetPolicyInput, GetPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetPolicyInput, GetPolicyOutput] = js.native
  }
  
}

