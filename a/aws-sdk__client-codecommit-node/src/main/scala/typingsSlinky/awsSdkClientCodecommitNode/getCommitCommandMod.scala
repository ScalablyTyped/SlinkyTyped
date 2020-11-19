package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesGetCommitInputMod.GetCommitInput
import typingsSlinky.awsSdkClientCodecommitNode.typesGetCommitOutputMod.GetCommitOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-codecommit-node/commands/GetCommitCommand", JSImport.Namespace)
@js.native
object getCommitCommandMod extends js.Object {
  
  @js.native
  class GetCommitCommand protected () extends Command[
          InputTypesUnion, 
          GetCommitInput, 
          OutputTypesUnion, 
          GetCommitOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetCommitInput) = this()
    
    val middlewareStack: MiddlewareStack[GetCommitInput, GetCommitOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetCommitInput, GetCommitOutput] = js.native
  }
}
