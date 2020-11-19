package typingsSlinky.awsSdkClientLambdaNode

import typingsSlinky.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsSlinky.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientLambdaNode.typesPublishVersionInputMod.PublishVersionInput
import typingsSlinky.awsSdkClientLambdaNode.typesPublishVersionOutputMod.PublishVersionOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-lambda-node/commands/PublishVersionCommand", JSImport.Namespace)
@js.native
object publishVersionCommandMod extends js.Object {
  
  @js.native
  class PublishVersionCommand protected () extends Command[
          InputTypesUnion, 
          PublishVersionInput, 
          OutputTypesUnion, 
          PublishVersionOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: PublishVersionInput) = this()
    
    val middlewareStack: MiddlewareStack[PublishVersionInput, PublishVersionOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[PublishVersionInput, PublishVersionOutput] = js.native
  }
}
