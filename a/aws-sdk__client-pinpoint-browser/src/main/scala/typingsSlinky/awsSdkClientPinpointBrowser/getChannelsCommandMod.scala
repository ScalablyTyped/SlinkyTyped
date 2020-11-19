package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetChannelsInputMod.GetChannelsInput
import typingsSlinky.awsSdkClientPinpointBrowser.typesGetChannelsOutputMod.GetChannelsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetChannelsCommand", JSImport.Namespace)
@js.native
object getChannelsCommandMod extends js.Object {
  
  @js.native
  class GetChannelsCommand protected () extends Command[
          InputTypesUnion, 
          GetChannelsInput, 
          OutputTypesUnion, 
          GetChannelsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetChannelsInput) = this()
    
    val middlewareStack: MiddlewareStack[GetChannelsInput, GetChannelsOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetChannelsInput, GetChannelsOutput] = js.native
  }
}
