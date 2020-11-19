package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsSlinky.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableOutputMod.DescribeGlobalTableOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeGlobalTableCommand", JSImport.Namespace)
@js.native
object describeGlobalTableCommandMod extends js.Object {
  
  @js.native
  class DescribeGlobalTableCommand protected () extends Command[
          InputTypesUnion, 
          DescribeGlobalTableInput, 
          OutputTypesUnion, 
          DescribeGlobalTableOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeGlobalTableInput) = this()
    
    val middlewareStack: MiddlewareStack[DescribeGlobalTableInput, DescribeGlobalTableOutput, Blob] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeGlobalTableInput, DescribeGlobalTableOutput] = js.native
  }
}
