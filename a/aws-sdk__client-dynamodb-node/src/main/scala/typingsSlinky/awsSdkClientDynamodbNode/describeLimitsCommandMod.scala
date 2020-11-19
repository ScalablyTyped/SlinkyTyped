package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesDescribeLimitsInputMod.DescribeLimitsInput
import typingsSlinky.awsSdkClientDynamodbNode.typesDescribeLimitsOutputMod.DescribeLimitsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeLimitsCommand", JSImport.Namespace)
@js.native
object describeLimitsCommandMod extends js.Object {
  
  @js.native
  class DescribeLimitsCommand protected () extends Command[
          InputTypesUnion, 
          DescribeLimitsInput, 
          OutputTypesUnion, 
          DescribeLimitsOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: DescribeLimitsInput) = this()
    
    val middlewareStack: MiddlewareStack[DescribeLimitsInput, DescribeLimitsOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeLimitsInput, DescribeLimitsOutput] = js.native
  }
}
