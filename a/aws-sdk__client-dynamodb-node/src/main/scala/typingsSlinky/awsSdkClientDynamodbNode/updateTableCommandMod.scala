package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesUpdateTableInputMod.UpdateTableInput
import typingsSlinky.awsSdkClientDynamodbNode.typesUpdateTableOutputMod.UpdateTableOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateTableCommand", JSImport.Namespace)
@js.native
object updateTableCommandMod extends js.Object {
  
  @js.native
  class UpdateTableCommand protected () extends Command[
          InputTypesUnion, 
          UpdateTableInput, 
          OutputTypesUnion, 
          UpdateTableOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateTableInput) = this()
    
    val middlewareStack: MiddlewareStack[UpdateTableInput, UpdateTableOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateTableInput, UpdateTableOutput] = js.native
  }
}
