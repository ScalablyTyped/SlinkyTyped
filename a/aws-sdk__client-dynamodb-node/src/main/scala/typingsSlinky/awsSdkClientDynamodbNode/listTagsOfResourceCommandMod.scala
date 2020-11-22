package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesListTagsOfResourceInputMod.ListTagsOfResourceInput
import typingsSlinky.awsSdkClientDynamodbNode.typesListTagsOfResourceOutputMod.ListTagsOfResourceOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-node/commands/ListTagsOfResourceCommand", JSImport.Namespace)
@js.native
object listTagsOfResourceCommandMod extends js.Object {
  
  @js.native
  class ListTagsOfResourceCommand protected () extends Command[
          InputTypesUnion, 
          ListTagsOfResourceInput, 
          OutputTypesUnion, 
          ListTagsOfResourceOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: ListTagsOfResourceInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListTagsOfResourceInput, ListTagsOfResourceOutput] = js.native
  }
}
