package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesGetPolicyInputMod.GetPolicyInput
import typingsSlinky.awsSdkClientLambdaNode.typesGetPolicyOutputMod.GetPolicyOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetPolicyCommand", JSImport.Namespace)
@js.native
object getPolicyCommandMod extends js.Object {
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
    val middlewareStack: MiddlewareStack[GetPolicyInput, GetPolicyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetPolicyInput, GetPolicyOutput] = js.native
  }
  
}

