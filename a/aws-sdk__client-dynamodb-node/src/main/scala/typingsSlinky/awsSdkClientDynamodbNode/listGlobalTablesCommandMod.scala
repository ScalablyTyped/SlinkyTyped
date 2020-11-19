package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesListGlobalTablesInputMod.ListGlobalTablesInput
import typingsSlinky.awsSdkClientDynamodbNode.typesListGlobalTablesOutputMod.ListGlobalTablesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-node/commands/ListGlobalTablesCommand", JSImport.Namespace)
@js.native
object listGlobalTablesCommandMod extends js.Object {
  
  @js.native
  class ListGlobalTablesCommand protected () extends Command[
          InputTypesUnion, 
          ListGlobalTablesInput, 
          OutputTypesUnion, 
          ListGlobalTablesOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListGlobalTablesInput) = this()
    
    val middlewareStack: MiddlewareStack[ListGlobalTablesInput, ListGlobalTablesOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListGlobalTablesInput, ListGlobalTablesOutput] = js.native
  }
}
