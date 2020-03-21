package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesGetFunctionConfigurationInputMod.GetFunctionConfigurationInput
import typingsSlinky.awsSdkClientLambdaNode.typesGetFunctionConfigurationOutputMod.GetFunctionConfigurationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetFunctionConfigurationCommand", JSImport.Namespace)
@js.native
object getFunctionConfigurationCommandMod extends js.Object {
  @js.native
  class GetFunctionConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          GetFunctionConfigurationInput, 
          OutputTypesUnion, 
          GetFunctionConfigurationOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetFunctionConfigurationInput) = this()
    /* CompleteClass */
    override val input: GetFunctionConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[GetFunctionConfigurationInput, GetFunctionConfigurationOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetFunctionConfigurationInput, GetFunctionConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetFunctionConfigurationInput, GetFunctionConfigurationOutput] = js.native
  }
  
}

