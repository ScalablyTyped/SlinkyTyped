package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesDeleteStreamInputMod.DeleteStreamInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesDeleteStreamOutputMod.DeleteStreamOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kinesis-browser/commands/DeleteStreamCommand", JSImport.Namespace)
@js.native
object deleteStreamCommandMod extends js.Object {
  
  @js.native
  class DeleteStreamCommand protected () extends Command[
          InputTypesUnion, 
          DeleteStreamInput, 
          OutputTypesUnion, 
          DeleteStreamOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteStreamInput) = this()
    
    val middlewareStack: MiddlewareStack[DeleteStreamInput, DeleteStreamOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DeleteStreamInput, DeleteStreamOutput] = js.native
  }
}
