package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeTableInputMod.DescribeTableInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeTableOutputMod.DescribeTableOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeTableCommand", JSImport.Namespace)
@js.native
object describeTableCommandMod extends js.Object {
  
  @js.native
  class DescribeTableCommand protected () extends Command[
          InputTypesUnion, 
          DescribeTableInput, 
          OutputTypesUnion, 
          DescribeTableOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeTableInput) = this()
    
    val middlewareStack: MiddlewareStack[DescribeTableInput, DescribeTableOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeTableInput, DescribeTableOutput] = js.native
  }
}
