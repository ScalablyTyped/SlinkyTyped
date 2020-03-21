package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesListBackupsInputMod.ListBackupsInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesListBackupsOutputMod.ListBackupsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/ListBackupsCommand", JSImport.Namespace)
@js.native
object listBackupsCommandMod extends js.Object {
  @js.native
  class ListBackupsCommand protected () extends Command[
          InputTypesUnion, 
          ListBackupsInput, 
          OutputTypesUnion, 
          ListBackupsOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListBackupsInput) = this()
    /* CompleteClass */
    override val input: ListBackupsInput = js.native
    val middlewareStack: MiddlewareStack[ListBackupsInput, ListBackupsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListBackupsInput, ListBackupsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListBackupsInput, ListBackupsOutput] = js.native
  }
  
}

