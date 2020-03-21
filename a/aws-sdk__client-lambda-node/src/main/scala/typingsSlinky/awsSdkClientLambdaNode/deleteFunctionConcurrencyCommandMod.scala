package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyInputMod.DeleteFunctionConcurrencyInput
import typingsSlinky.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyOutputMod.DeleteFunctionConcurrencyOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/DeleteFunctionConcurrencyCommand", JSImport.Namespace)
@js.native
object deleteFunctionConcurrencyCommandMod extends js.Object {
  @js.native
  class DeleteFunctionConcurrencyCommand protected () extends Command[
          InputTypesUnion, 
          DeleteFunctionConcurrencyInput, 
          OutputTypesUnion, 
          DeleteFunctionConcurrencyOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteFunctionConcurrencyInput) = this()
    /* CompleteClass */
    override val input: DeleteFunctionConcurrencyInput = js.native
    val middlewareStack: MiddlewareStack[DeleteFunctionConcurrencyInput, DeleteFunctionConcurrencyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteFunctionConcurrencyInput, DeleteFunctionConcurrencyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteFunctionConcurrencyInput, DeleteFunctionConcurrencyOutput] = js.native
  }
  
}

