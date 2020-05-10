package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteTableInputMod.DeleteTableInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteTableOutputMod.DeleteTableOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DeleteTableCommand", JSImport.Namespace)
@js.native
object deleteTableCommandMod extends js.Object {
  @js.native
  class DeleteTableCommand protected () extends Command[
          InputTypesUnion, 
          DeleteTableInput, 
          OutputTypesUnion, 
          DeleteTableOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteTableInput) = this()
    val middlewareStack: MiddlewareStack[DeleteTableInput, DeleteTableOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DeleteTableInput, DeleteTableOutput] = js.native
  }
  
}

