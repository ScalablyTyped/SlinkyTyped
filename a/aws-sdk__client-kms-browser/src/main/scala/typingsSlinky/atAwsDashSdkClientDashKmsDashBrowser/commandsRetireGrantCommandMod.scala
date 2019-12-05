package typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser

import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.kMSConfigurationMod.KMSResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesRetireGrantInputMod.RetireGrantInput
import typingsSlinky.atAwsDashSdkClientDashKmsDashBrowser.typesRetireGrantOutputMod.RetireGrantOutput
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/commands/RetireGrantCommand", JSImport.Namespace)
@js.native
object commandsRetireGrantCommandMod extends js.Object {
  @js.native
  class RetireGrantCommand protected () extends Command[
          InputTypesUnion, 
          RetireGrantInput, 
          OutputTypesUnion, 
          RetireGrantOutput, 
          KMSResolvedConfiguration, 
          Blob
        ] {
    def this(input: RetireGrantInput) = this()
    /* CompleteClass */
    override val input: RetireGrantInput = js.native
    val middlewareStack: MiddlewareStack[RetireGrantInput, RetireGrantOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[RetireGrantInput, RetireGrantOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KMSResolvedConfiguration
    ): Handler[RetireGrantInput, RetireGrantOutput] = js.native
  }
  
}

