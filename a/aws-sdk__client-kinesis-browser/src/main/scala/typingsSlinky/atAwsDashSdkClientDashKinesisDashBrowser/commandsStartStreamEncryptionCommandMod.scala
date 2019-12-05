package typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser

import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.typesStartStreamEncryptionInputMod.StartStreamEncryptionInput
import typingsSlinky.atAwsDashSdkClientDashKinesisDashBrowser.typesStartStreamEncryptionOutputMod.StartStreamEncryptionOutput
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/StartStreamEncryptionCommand", JSImport.Namespace)
@js.native
object commandsStartStreamEncryptionCommandMod extends js.Object {
  @js.native
  class StartStreamEncryptionCommand protected () extends Command[
          InputTypesUnion, 
          StartStreamEncryptionInput, 
          OutputTypesUnion, 
          StartStreamEncryptionOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: StartStreamEncryptionInput) = this()
    /* CompleteClass */
    override val input: StartStreamEncryptionInput = js.native
    val middlewareStack: MiddlewareStack[StartStreamEncryptionInput, StartStreamEncryptionOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[StartStreamEncryptionInput, StartStreamEncryptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[StartStreamEncryptionInput, StartStreamEncryptionOutput] = js.native
  }
  
}

