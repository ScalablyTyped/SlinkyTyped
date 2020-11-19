package typingsSlinky.awsSdkClientPinpointBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointConfiguration
import typingsSlinky.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-pinpoint-browser/PinpointClient", JSImport.Namespace)
@js.native
object pinpointClientMod extends js.Object {
  
  @js.native
  class PinpointClient protected () extends js.Object {
    def this(configuration: PinpointConfiguration) = this()
    
    val config: PinpointResolvedConfiguration = js.native
    
    def destroy(): Unit = js.native
    
    val middlewareStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob] = js.native
    
    /**
      * This will need to be revised when the command interface lands.
      */
    def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
      command: Command[
          InputTypesUnion, 
          InputType, 
          OutputTypesUnion, 
          OutputType, 
          PinpointResolvedConfiguration, 
          Blob
        ]
    ): js.Promise[OutputType] = js.native
    def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
      command: Command[
          InputTypesUnion, 
          InputType, 
          OutputTypesUnion, 
          OutputType, 
          PinpointResolvedConfiguration, 
          Blob
        ],
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
    ): Unit = js.native
  }
}
