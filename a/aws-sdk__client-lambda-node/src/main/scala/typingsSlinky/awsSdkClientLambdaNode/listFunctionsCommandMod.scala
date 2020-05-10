package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesListFunctionsInputMod.ListFunctionsInput
import typingsSlinky.awsSdkClientLambdaNode.typesListFunctionsOutputMod.ListFunctionsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/ListFunctionsCommand", JSImport.Namespace)
@js.native
object listFunctionsCommandMod extends js.Object {
  @js.native
  class ListFunctionsCommand protected () extends Command[
          InputTypesUnion, 
          ListFunctionsInput, 
          OutputTypesUnion, 
          ListFunctionsOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListFunctionsInput) = this()
    val middlewareStack: MiddlewareStack[ListFunctionsInput, ListFunctionsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListFunctionsInput, ListFunctionsOutput] = js.native
  }
  
}

