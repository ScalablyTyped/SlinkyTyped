package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesGetAliasInputMod.GetAliasInput
import typingsSlinky.awsSdkClientLambdaNode.typesGetAliasOutputMod.GetAliasOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetAliasCommand", JSImport.Namespace)
@js.native
object getAliasCommandMod extends js.Object {
  @js.native
  class GetAliasCommand protected () extends Command[
          InputTypesUnion, 
          GetAliasInput, 
          OutputTypesUnion, 
          GetAliasOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetAliasInput) = this()
    /* CompleteClass */
    override val input: GetAliasInput = js.native
    val middlewareStack: MiddlewareStack[GetAliasInput, GetAliasOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetAliasInput, GetAliasOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetAliasInput, GetAliasOutput] = js.native
  }
  
}

