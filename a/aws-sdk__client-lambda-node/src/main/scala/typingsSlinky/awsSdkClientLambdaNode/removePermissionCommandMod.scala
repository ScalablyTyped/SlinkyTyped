package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesRemovePermissionInputMod.RemovePermissionInput
import typingsSlinky.awsSdkClientLambdaNode.typesRemovePermissionOutputMod.RemovePermissionOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/RemovePermissionCommand", JSImport.Namespace)
@js.native
object removePermissionCommandMod extends js.Object {
  @js.native
  class RemovePermissionCommand protected () extends Command[
          InputTypesUnion, 
          RemovePermissionInput, 
          OutputTypesUnion, 
          RemovePermissionOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: RemovePermissionInput) = this()
    val middlewareStack: MiddlewareStack[RemovePermissionInput, RemovePermissionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[RemovePermissionInput, RemovePermissionOutput] = js.native
  }
  
}

