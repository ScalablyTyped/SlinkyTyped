package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationInputMod.UpdateFunctionConfigurationInput
import typingsSlinky.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationOutputMod.UpdateFunctionConfigurationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/UpdateFunctionConfigurationCommand", JSImport.Namespace)
@js.native
object updateFunctionConfigurationCommandMod extends js.Object {
  @js.native
  class UpdateFunctionConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          UpdateFunctionConfigurationInput, 
          OutputTypesUnion, 
          UpdateFunctionConfigurationOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateFunctionConfigurationInput) = this()
    /* CompleteClass */
    override val input: UpdateFunctionConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[UpdateFunctionConfigurationInput, UpdateFunctionConfigurationOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateFunctionConfigurationInput, UpdateFunctionConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateFunctionConfigurationInput, UpdateFunctionConfigurationOutput] = js.native
  }
  
}

