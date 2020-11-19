package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesUntagResourceInputMod.UntagResourceInput
import typingsSlinky.awsSdkClientLambdaNode.typesUntagResourceOutputMod.UntagResourceOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-lambda-node/commands/UntagResourceCommand", JSImport.Namespace)
@js.native
object untagResourceCommandMod extends js.Object {
  
  @js.native
  class UntagResourceCommand protected () extends Command[
          InputTypesUnion, 
          UntagResourceInput, 
          OutputTypesUnion, 
          UntagResourceOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: UntagResourceInput) = this()
    
    val middlewareStack: MiddlewareStack[UntagResourceInput, UntagResourceOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[UntagResourceInput, UntagResourceOutput] = js.native
  }
}
