package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesSelectObjectContentInputMod.SelectObjectContentInput
import typingsSlinky.awsSdkClientS3Browser.typesSelectObjectContentOutputMod.SelectObjectContentOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/SelectObjectContentCommand", JSImport.Namespace)
@js.native
object selectObjectContentCommandMod extends js.Object {
  
  @js.native
  class SelectObjectContentCommand protected () extends Command[
          InputTypesUnion, 
          SelectObjectContentInput, 
          OutputTypesUnion, 
          SelectObjectContentOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: SelectObjectContentInput) = this()
    
    val middlewareStack: MiddlewareStack[SelectObjectContentInput, SelectObjectContentOutput, Blob] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[SelectObjectContentInput, SelectObjectContentOutput] = js.native
  }
}
