package typingsSlinky.atAwsDashSdkClientDashLambdaDashNode

import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesListVersionsByFunctionInputMod.ListVersionsByFunctionInput
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesListVersionsByFunctionOutputMod.ListVersionsByFunctionOutput
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/ListVersionsByFunctionCommand", JSImport.Namespace)
@js.native
object commandsListVersionsByFunctionCommandMod extends js.Object {
  @js.native
  class ListVersionsByFunctionCommand protected () extends Command[
          InputTypesUnion, 
          ListVersionsByFunctionInput, 
          OutputTypesUnion, 
          ListVersionsByFunctionOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListVersionsByFunctionInput) = this()
    /* CompleteClass */
    override val input: ListVersionsByFunctionInput = js.native
    val middlewareStack: MiddlewareStack[ListVersionsByFunctionInput, ListVersionsByFunctionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListVersionsByFunctionInput, ListVersionsByFunctionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListVersionsByFunctionInput, ListVersionsByFunctionOutput] = js.native
  }
  
}

