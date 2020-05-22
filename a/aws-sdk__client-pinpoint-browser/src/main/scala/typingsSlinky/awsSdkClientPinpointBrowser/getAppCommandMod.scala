package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppInputMod.GetAppInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppOutputMod.GetAppOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetAppCommand", JSImport.Namespace)
@js.native
object getAppCommandMod extends js.Object {
  @js.native
  class GetAppCommand protected () extends Command[
          InputTypesUnion, 
          GetAppInput, 
          OutputTypesUnion, 
          GetAppOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetAppInput) = this()
    /* CompleteClass */
    override val input: GetAppInput = js.native
    val middlewareStack: MiddlewareStack[GetAppInput, GetAppOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAppInput, GetAppOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAppInput, GetAppOutput] = js.native
  }
  
}

