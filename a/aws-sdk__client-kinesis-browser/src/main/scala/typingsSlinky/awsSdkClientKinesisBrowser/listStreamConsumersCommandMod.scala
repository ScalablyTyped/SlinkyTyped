package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesListStreamConsumersInputMod.ListStreamConsumersInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesListStreamConsumersOutputMod.ListStreamConsumersOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kinesis-browser/commands/ListStreamConsumersCommand", JSImport.Namespace)
@js.native
object listStreamConsumersCommandMod extends js.Object {
  
  @js.native
  class ListStreamConsumersCommand protected () extends Command[
          InputTypesUnion, 
          ListStreamConsumersInput, 
          OutputTypesUnion, 
          ListStreamConsumersOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListStreamConsumersInput) = this()
    
    val middlewareStack: MiddlewareStack[ListStreamConsumersInput, ListStreamConsumersOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListStreamConsumersInput, ListStreamConsumersOutput] = js.native
  }
}
