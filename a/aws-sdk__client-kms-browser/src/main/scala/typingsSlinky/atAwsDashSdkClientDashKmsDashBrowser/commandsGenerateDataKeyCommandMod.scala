package typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser

import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesGenerateDataKeyInputMod.GenerateDataKeyInput
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesGenerateDataKeyOutputMod.GenerateDataKeyOutput
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/GenerateDataKeyCommand", JSImport.Namespace)
@js.native
object commandsGenerateDataKeyCommandMod extends js.Object {
  @js.native
  class GenerateDataKeyCommand protected () extends Command[
          InputTypesUnion, 
          GenerateDataKeyInput, 
          OutputTypesUnion, 
          GenerateDataKeyOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: GenerateDataKeyInput) = this()
    /* CompleteClass */
    override val input: GenerateDataKeyInput = js.native
    val middlewareStack: MiddlewareStack[GenerateDataKeyInput, GenerateDataKeyOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateDataKeyInput, GenerateDataKeyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateDataKeyInput, GenerateDataKeyOutput] = js.native
  }
  
}

