package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesBatchGetItemInputMod.BatchGetItemInput
import typingsSlinky.awsSdkClientDynamodbNode.typesBatchGetItemOutputMod.BatchGetItemOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-node/commands/BatchGetItemCommand", JSImport.Namespace)
@js.native
object batchGetItemCommandMod extends js.Object {
  
  @js.native
  class BatchGetItemCommand protected () extends Command[
          InputTypesUnion, 
          BatchGetItemInput, 
          OutputTypesUnion, 
          BatchGetItemOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: BatchGetItemInput) = this()
    
    val middlewareStack: MiddlewareStack[BatchGetItemInput, BatchGetItemOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[BatchGetItemInput, BatchGetItemOutput] = js.native
  }
}
