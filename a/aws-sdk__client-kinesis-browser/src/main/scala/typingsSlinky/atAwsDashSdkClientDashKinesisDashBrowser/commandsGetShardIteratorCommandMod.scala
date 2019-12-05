package typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser

import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.typesGetShardIteratorInputMod.GetShardIteratorInput
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.typesGetShardIteratorOutputMod.GetShardIteratorOutput
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/GetShardIteratorCommand", JSImport.Namespace)
@js.native
object commandsGetShardIteratorCommandMod extends js.Object {
  @js.native
  class GetShardIteratorCommand protected () extends Command[
          InputTypesUnion, 
          GetShardIteratorInput, 
          OutputTypesUnion, 
          GetShardIteratorOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetShardIteratorInput) = this()
    /* CompleteClass */
    override val input: GetShardIteratorInput = js.native
    val middlewareStack: MiddlewareStack[GetShardIteratorInput, GetShardIteratorOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[GetShardIteratorInput, GetShardIteratorOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[GetShardIteratorInput, GetShardIteratorOutput] = js.native
  }
  
}

