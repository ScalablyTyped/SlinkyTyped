package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateGlobalTableInputMod.CreateGlobalTableInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateGlobalTableOutputMod.CreateGlobalTableOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/CreateGlobalTableCommand", JSImport.Namespace)
@js.native
object createGlobalTableCommandMod extends js.Object {
  @js.native
  class CreateGlobalTableCommand protected () extends Command[
          InputTypesUnion, 
          CreateGlobalTableInput, 
          OutputTypesUnion, 
          CreateGlobalTableOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateGlobalTableInput) = this()
    /* CompleteClass */
    override val input: CreateGlobalTableInput = js.native
    val middlewareStack: MiddlewareStack[CreateGlobalTableInput, CreateGlobalTableOutput, Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateGlobalTableInput, CreateGlobalTableOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateGlobalTableInput, CreateGlobalTableOutput] = js.native
  }
  
}

