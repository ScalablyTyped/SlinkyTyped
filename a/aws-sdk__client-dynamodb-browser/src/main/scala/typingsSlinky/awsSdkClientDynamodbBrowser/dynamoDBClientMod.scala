package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/DynamoDBClient", JSImport.Namespace)
@js.native
object dynamoDBClientMod extends js.Object {
  @js.native
  class DynamoDBClient protected () extends js.Object {
    def this(configuration: DynamoDBConfiguration) = this()
    val config: DynamoDBResolvedConfiguration = js.native
    val middlewareStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob] = js.native
    def destroy(): Unit = js.native
    /**
      * This will need to be revised when the command interface lands.
      */
    def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
      command: Command[
          InputTypesUnion, 
          InputType, 
          OutputTypesUnion, 
          OutputType, 
          DynamoDBResolvedConfiguration, 
          Blob
        ]
    ): js.Promise[OutputType] = js.native
    def send[InputType /* <: InputTypesUnion */, OutputType /* <: OutputTypesUnion */](
      command: Command[
          InputTypesUnion, 
          InputType, 
          OutputTypesUnion, 
          OutputType, 
          DynamoDBResolvedConfiguration, 
          Blob
        ],
      cb: js.Function2[/* err */ js.Any, /* data */ js.UndefOr[OutputType], Unit]
    ): Unit = js.native
  }
  
}

