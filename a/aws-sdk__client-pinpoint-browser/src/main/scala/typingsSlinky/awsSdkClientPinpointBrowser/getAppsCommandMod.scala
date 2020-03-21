package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppsInputMod.GetAppsInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetAppsOutputMod.GetAppsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetAppsCommand", JSImport.Namespace)
@js.native
object getAppsCommandMod extends js.Object {
  @js.native
  class GetAppsCommand protected () extends Command[
          InputTypesUnion, 
          GetAppsInput, 
          OutputTypesUnion, 
          GetAppsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetAppsInput) = this()
    /* CompleteClass */
    override val input: GetAppsInput = js.native
    val middlewareStack: MiddlewareStack[GetAppsInput, GetAppsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAppsInput, GetAppsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAppsInput, GetAppsOutput] = js.native
  }
  
}

