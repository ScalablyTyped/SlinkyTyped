package typingsSlinky.atAwsDashSdkClientDashLambdaDashNode

import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesGetAccountSettingsInputMod.GetAccountSettingsInput
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesGetAccountSettingsOutputMod.GetAccountSettingsOutput
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetAccountSettingsCommand", JSImport.Namespace)
@js.native
object commandsGetAccountSettingsCommandMod extends js.Object {
  @js.native
  class GetAccountSettingsCommand protected () extends Command[
          InputTypesUnion, 
          GetAccountSettingsInput, 
          OutputTypesUnion, 
          GetAccountSettingsOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetAccountSettingsInput) = this()
    /* CompleteClass */
    override val input: GetAccountSettingsInput = js.native
    val middlewareStack: MiddlewareStack[GetAccountSettingsInput, GetAccountSettingsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetAccountSettingsInput, GetAccountSettingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetAccountSettingsInput, GetAccountSettingsOutput] = js.native
  }
  
}

