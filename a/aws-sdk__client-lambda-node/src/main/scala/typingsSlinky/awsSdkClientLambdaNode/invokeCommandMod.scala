package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesInvokeInputMod.InvokeInput
import typingsSlinky.awsSdkClientLambdaNode.typesInvokeOutputMod.InvokeOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/InvokeCommand", JSImport.Namespace)
@js.native
object invokeCommandMod extends js.Object {
  @js.native
  class InvokeCommand protected () extends Command[
          InputTypesUnion, 
          InvokeInput, 
          OutputTypesUnion, 
          InvokeOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: InvokeInput) = this()
    val middlewareStack: MiddlewareStack[InvokeInput, InvokeOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[InvokeInput, InvokeOutput] = js.native
  }
  
}

