package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsSlinky.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKinesisBrowser.typesGetRecordsInputMod.GetRecordsInput
import typingsSlinky.awsSdkClientKinesisBrowser.typesGetRecordsOutputMod.GetRecordsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kinesis-browser/commands/GetRecordsCommand", JSImport.Namespace)
@js.native
object getRecordsCommandMod extends js.Object {
  
  @js.native
  class GetRecordsCommand protected () extends Command[
          InputTypesUnion, 
          GetRecordsInput, 
          OutputTypesUnion, 
          GetRecordsOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetRecordsInput) = this()
    
    val middlewareStack: MiddlewareStack[GetRecordsInput, GetRecordsOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[GetRecordsInput, GetRecordsOutput] = js.native
  }
}
