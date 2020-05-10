package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesCreateFunctionInputMod.CreateFunctionInput
import typingsSlinky.awsSdkClientLambdaNode.typesCreateFunctionOutputMod.CreateFunctionOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/CreateFunctionCommand", JSImport.Namespace)
@js.native
object createFunctionCommandMod extends js.Object {
  @js.native
  class CreateFunctionCommand protected () extends Command[
          InputTypesUnion, 
          CreateFunctionInput, 
          OutputTypesUnion, 
          CreateFunctionOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateFunctionInput) = this()
    val middlewareStack: MiddlewareStack[CreateFunctionInput, CreateFunctionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[CreateFunctionInput, CreateFunctionOutput] = js.native
  }
  
}

