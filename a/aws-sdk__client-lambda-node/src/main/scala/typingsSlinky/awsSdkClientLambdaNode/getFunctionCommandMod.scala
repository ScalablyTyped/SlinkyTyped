package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesGetFunctionInputMod.GetFunctionInput
import typingsSlinky.awsSdkClientLambdaNode.typesGetFunctionOutputMod.GetFunctionOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetFunctionCommand", JSImport.Namespace)
@js.native
object getFunctionCommandMod extends js.Object {
  @js.native
  class GetFunctionCommand protected () extends Command[
          InputTypesUnion, 
          GetFunctionInput, 
          OutputTypesUnion, 
          GetFunctionOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetFunctionInput) = this()
    /* CompleteClass */
    override val input: GetFunctionInput = js.native
    val middlewareStack: MiddlewareStack[GetFunctionInput, GetFunctionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetFunctionInput, GetFunctionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetFunctionInput, GetFunctionOutput] = js.native
  }
  
}

