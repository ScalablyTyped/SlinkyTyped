package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesBatchWriteItemInputMod.BatchWriteItemInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesBatchWriteItemOutputMod.BatchWriteItemOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-browser/commands/BatchWriteItemCommand", JSImport.Namespace)
@js.native
object batchWriteItemCommandMod extends js.Object {
  
  @js.native
  class BatchWriteItemCommand protected () extends Command[
          InputTypesUnion, 
          BatchWriteItemInput, 
          OutputTypesUnion, 
          BatchWriteItemOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: BatchWriteItemInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[BatchWriteItemInput, BatchWriteItemOutput] = js.native
  }
}
