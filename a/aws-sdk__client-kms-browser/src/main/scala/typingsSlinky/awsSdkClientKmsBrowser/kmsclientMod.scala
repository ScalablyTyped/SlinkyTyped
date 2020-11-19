package typingsSlinky.awsSdkClientKmsBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKmsBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-browser/KMSClient", JSImport.Namespace)
@js.native
object kmsclientMod extends js.Object {
  
  @js.native
  class KMSClient protected () extends js.Object {
    def this(configuration: KMSConfiguration) = this()
    
    val config: KMSResolvedConfiguration = js.native
    
    def destroy(): Unit = js.native
    
    val middlewareStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob] = js.native
    
    /**
      * This will need to be revised when the command interface lands.
      */
    def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
      command: Command[InputTypesUnion, InputType, OutputTypesUnion, OutputType, KMSResolvedConfiguration, Blob]
    ): js.Promise[OutputType] = js.native
    def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
      command: Command[InputTypesUnion, InputType, OutputTypesUnion, OutputType, KMSResolvedConfiguration, Blob],
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
    ): Unit = js.native
  }
}
