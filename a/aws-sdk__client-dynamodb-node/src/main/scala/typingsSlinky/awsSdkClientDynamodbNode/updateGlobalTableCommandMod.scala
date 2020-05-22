package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput
import typingsSlinky.awsSdkClientDynamodbNode.typesUpdateGlobalTableOutputMod.UpdateGlobalTableOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateGlobalTableCommand", JSImport.Namespace)
@js.native
object updateGlobalTableCommandMod extends js.Object {
  @js.native
  class UpdateGlobalTableCommand protected () extends Command[
          InputTypesUnion, 
          UpdateGlobalTableInput, 
          OutputTypesUnion, 
          UpdateGlobalTableOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateGlobalTableInput) = this()
    /* CompleteClass */
    override val input: UpdateGlobalTableInput = js.native
    val middlewareStack: MiddlewareStack[UpdateGlobalTableInput, UpdateGlobalTableOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateGlobalTableInput, UpdateGlobalTableOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateGlobalTableInput, UpdateGlobalTableOutput] = js.native
  }
  
}

