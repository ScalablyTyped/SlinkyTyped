package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesListTagsInputMod.ListTagsInput
import typingsSlinky.awsSdkClientLambdaNode.typesListTagsOutputMod.ListTagsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/ListTagsCommand", JSImport.Namespace)
@js.native
object listTagsCommandMod extends js.Object {
  @js.native
  class ListTagsCommand protected () extends Command[
          InputTypesUnion, 
          ListTagsInput, 
          OutputTypesUnion, 
          ListTagsOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListTagsInput) = this()
    /* CompleteClass */
    override val input: ListTagsInput = js.native
    val middlewareStack: MiddlewareStack[ListTagsInput, ListTagsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListTagsInput, ListTagsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[ListTagsInput, ListTagsOutput] = js.native
  }
  
}

