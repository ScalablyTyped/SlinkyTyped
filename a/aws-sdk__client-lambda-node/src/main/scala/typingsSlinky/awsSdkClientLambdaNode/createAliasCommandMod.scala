package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesCreateAliasInputMod.CreateAliasInput
import typingsSlinky.awsSdkClientLambdaNode.typesCreateAliasOutputMod.CreateAliasOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/CreateAliasCommand", JSImport.Namespace)
@js.native
object createAliasCommandMod extends js.Object {
  @js.native
  class CreateAliasCommand protected () extends Command[
          InputTypesUnion, 
          CreateAliasInput, 
          OutputTypesUnion, 
          CreateAliasOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateAliasInput) = this()
    val middlewareStack: MiddlewareStack[CreateAliasInput, CreateAliasOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[CreateAliasInput, CreateAliasOutput] = js.native
  }
  
}

