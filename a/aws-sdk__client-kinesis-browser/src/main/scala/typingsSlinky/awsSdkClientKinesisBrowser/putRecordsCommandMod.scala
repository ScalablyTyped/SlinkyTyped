package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesPutRecordsInputMod.PutRecordsInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesPutRecordsOutputMod.PutRecordsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kinesis-browser/commands/PutRecordsCommand", JSImport.Namespace)
@js.native
object putRecordsCommandMod extends js.Object {
  
  @js.native
  class PutRecordsCommand protected () extends Command[
          InputTypesUnion, 
          PutRecordsInput, 
          OutputTypesUnion, 
          PutRecordsOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutRecordsInput) = this()
    
    val middlewareStack: MiddlewareStack[PutRecordsInput, PutRecordsOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[PutRecordsInput, PutRecordsOutput] = js.native
  }
}
