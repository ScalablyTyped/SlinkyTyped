package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesListEventSourceMappingsInputMod.ListEventSourceMappingsInput
import typingsSlinky.awsSdkClientLambdaNode.typesListEventSourceMappingsOutputMod.ListEventSourceMappingsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/ListEventSourceMappingsCommand", JSImport.Namespace)
@js.native
object listEventSourceMappingsCommandMod extends js.Object {
  @js.native
  class ListEventSourceMappingsCommand protected () extends Command[
          InputTypesUnion, 
          ListEventSourceMappingsInput, 
          OutputTypesUnion, 
          ListEventSourceMappingsOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListEventSourceMappingsInput) = this()
    val middlewareStack: MiddlewareStack[ListEventSourceMappingsInput, ListEventSourceMappingsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListEventSourceMappingsInput, ListEventSourceMappingsOutput] = js.native
  }
  
}

