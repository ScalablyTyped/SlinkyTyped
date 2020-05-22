package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput
import typingsSlinky.awsSdkClientDynamodbNode.typesUpdateTimeToLiveOutputMod.UpdateTimeToLiveOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateTimeToLiveCommand", JSImport.Namespace)
@js.native
object updateTimeToLiveCommandMod extends js.Object {
  @js.native
  class UpdateTimeToLiveCommand protected () extends Command[
          InputTypesUnion, 
          UpdateTimeToLiveInput, 
          OutputTypesUnion, 
          UpdateTimeToLiveOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateTimeToLiveInput) = this()
    /* CompleteClass */
    override val input: UpdateTimeToLiveInput = js.native
    val middlewareStack: MiddlewareStack[UpdateTimeToLiveInput, UpdateTimeToLiveOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateTimeToLiveInput, UpdateTimeToLiveOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateTimeToLiveInput, UpdateTimeToLiveOutput] = js.native
  }
  
}

