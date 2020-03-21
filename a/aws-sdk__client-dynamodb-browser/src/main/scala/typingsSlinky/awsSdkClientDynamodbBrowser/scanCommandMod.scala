package typingsSlinky.awsSdkClientDynamodbBrowser

import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesScanInputMod.ScanInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesScanOutputMod.ScanOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/ScanCommand", JSImport.Namespace)
@js.native
object scanCommandMod extends js.Object {
  @js.native
  class ScanCommand protected () extends Command[
          InputTypesUnion, 
          ScanInput, 
          OutputTypesUnion, 
          ScanOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: ScanInput) = this()
    /* CompleteClass */
    override val input: ScanInput = js.native
    val middlewareStack: MiddlewareStack[ScanInput, ScanOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ScanInput, ScanOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ScanInput, ScanOutput] = js.native
  }
  
}

