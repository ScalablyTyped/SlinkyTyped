package typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser

import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesEncryptInputMod.EncryptInput
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesEncryptOutputMod.EncryptOutput
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/EncryptCommand", JSImport.Namespace)
@js.native
object commandsEncryptCommandMod extends js.Object {
  @js.native
  class EncryptCommand protected () extends Command[
          InputTypesUnion, 
          EncryptInput, 
          OutputTypesUnion, 
          EncryptOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: EncryptInput) = this()
    /* CompleteClass */
    override val input: EncryptInput = js.native
    val middlewareStack: MiddlewareStack[EncryptInput, EncryptOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[EncryptInput, EncryptOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[EncryptInput, EncryptOutput] = js.native
  }
  
}

