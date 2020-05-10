package typingsSlinky.awsSdkClientDynamodbNode

import typingsSlinky.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbNode.typesScanInputMod.ScanInput
import typingsSlinky.awsSdkClientDynamodbNode.typesScanOutputMod.ScanOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/ScanCommand", JSImport.Namespace)
@js.native
object scanCommandMod extends js.Object {
  @js.native
  class ScanCommand protected () extends Command[
          InputTypesUnion, 
          ScanInput, 
          OutputTypesUnion, 
          ScanOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: ScanInput) = this()
    val middlewareStack: MiddlewareStack[ScanInput, ScanOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ScanInput, ScanOutput] = js.native
  }
  
}

