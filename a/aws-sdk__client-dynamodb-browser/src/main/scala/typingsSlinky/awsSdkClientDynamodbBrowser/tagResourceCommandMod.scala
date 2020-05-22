package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesTagResourceInputMod.TagResourceInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesTagResourceOutputMod.TagResourceOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/TagResourceCommand", JSImport.Namespace)
@js.native
object tagResourceCommandMod extends js.Object {
  @js.native
  class TagResourceCommand protected () extends Command[
          InputTypesUnion, 
          TagResourceInput, 
          OutputTypesUnion, 
          TagResourceOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: TagResourceInput) = this()
    /* CompleteClass */
    override val input: TagResourceInput = js.native
    val middlewareStack: MiddlewareStack[TagResourceInput, TagResourceOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[TagResourceInput, TagResourceOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[TagResourceInput, TagResourceOutput] = js.native
  }
  
}

