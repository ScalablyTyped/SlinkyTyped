package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesUpdateItemInputMod.UpdateItemInput
import typingsSlinky.awsSdkClientDynamodbNode.typesUpdateItemOutputMod.UpdateItemOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateItemCommand", JSImport.Namespace)
@js.native
object updateItemCommandMod extends js.Object {
  
  @js.native
  class UpdateItemCommand protected () extends Command[
          InputTypesUnion, 
          UpdateItemInput, 
          OutputTypesUnion, 
          UpdateItemOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateItemInput) = this()
    
    val middlewareStack: MiddlewareStack[UpdateItemInput, UpdateItemOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateItemInput, UpdateItemOutput] = js.native
  }
}
