package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesBatchGetItemInputMod.BatchGetItemInput
import typingsSlinky.awsSdkClientDynamodbNode.typesBatchGetItemOutputMod.BatchGetItemOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchGetItemCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/BatchGetItemCommand", "BatchGetItemCommand")
  @js.native
  class BatchGetItemCommand protected () extends Command[
          InputTypesUnion, 
          BatchGetItemInput, 
          OutputTypesUnion, 
          BatchGetItemOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: BatchGetItemInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[BatchGetItemInput, BatchGetItemOutput] = js.native
  }
}
