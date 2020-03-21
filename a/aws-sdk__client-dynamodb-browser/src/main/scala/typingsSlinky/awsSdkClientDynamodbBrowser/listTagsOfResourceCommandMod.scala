package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesListTagsOfResourceInputMod.ListTagsOfResourceInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesListTagsOfResourceOutputMod.ListTagsOfResourceOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/ListTagsOfResourceCommand", JSImport.Namespace)
@js.native
object listTagsOfResourceCommandMod extends js.Object {
  @js.native
  class ListTagsOfResourceCommand protected () extends Command[
          InputTypesUnion, 
          ListTagsOfResourceInput, 
          OutputTypesUnion, 
          ListTagsOfResourceOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListTagsOfResourceInput) = this()
    /* CompleteClass */
    override val input: ListTagsOfResourceInput = js.native
    val middlewareStack: MiddlewareStack[ListTagsOfResourceInput, ListTagsOfResourceOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListTagsOfResourceInput, ListTagsOfResourceOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListTagsOfResourceInput, ListTagsOfResourceOutput] = js.native
  }
  
}

