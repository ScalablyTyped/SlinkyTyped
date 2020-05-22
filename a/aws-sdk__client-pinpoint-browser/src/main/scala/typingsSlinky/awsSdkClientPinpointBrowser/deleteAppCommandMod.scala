package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteAppInputMod.DeleteAppInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesDeleteAppOutputMod.DeleteAppOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteAppCommand", JSImport.Namespace)
@js.native
object deleteAppCommandMod extends js.Object {
  @js.native
  class DeleteAppCommand protected () extends Command[
          InputTypesUnion, 
          DeleteAppInput, 
          OutputTypesUnion, 
          DeleteAppOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteAppInput) = this()
    /* CompleteClass */
    override val input: DeleteAppInput = js.native
    val middlewareStack: MiddlewareStack[DeleteAppInput, DeleteAppOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteAppInput, DeleteAppOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteAppInput, DeleteAppOutput] = js.native
  }
  
}

