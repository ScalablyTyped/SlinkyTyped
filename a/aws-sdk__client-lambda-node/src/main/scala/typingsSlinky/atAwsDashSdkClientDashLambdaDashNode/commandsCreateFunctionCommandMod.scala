package typingsSlinky.atAwsDashSdkClientDashLambdaDashNode

import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesCreateFunctionInputMod.CreateFunctionInput
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesCreateFunctionOutputMod.CreateFunctionOutput
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/CreateFunctionCommand", JSImport.Namespace)
@js.native
object commandsCreateFunctionCommandMod extends js.Object {
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
    /* CompleteClass */
    override val input: CreateFunctionInput = js.native
    val middlewareStack: MiddlewareStack[CreateFunctionInput, CreateFunctionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[CreateFunctionInput, CreateFunctionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[CreateFunctionInput, CreateFunctionOutput] = js.native
  }
  
}

