package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesUpdateAliasInputMod.UpdateAliasInput
import typingsSlinky.awsSdkClientLambdaNode.typesUpdateAliasOutputMod.UpdateAliasOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/UpdateAliasCommand", JSImport.Namespace)
@js.native
object updateAliasCommandMod extends js.Object {
  @js.native
  class UpdateAliasCommand protected () extends Command[
          InputTypesUnion, 
          UpdateAliasInput, 
          OutputTypesUnion, 
          UpdateAliasOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateAliasInput) = this()
    /* CompleteClass */
    override val input: UpdateAliasInput = js.native
    val middlewareStack: MiddlewareStack[UpdateAliasInput, UpdateAliasOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateAliasInput, UpdateAliasOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateAliasInput, UpdateAliasOutput] = js.native
  }
  
}

