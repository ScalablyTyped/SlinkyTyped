package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesGetCommitInputMod.GetCommitInput
import typingsSlinky.awsSdkClientCodecommitNode.typesGetCommitOutputMod.GetCommitOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
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
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetCommitInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetCommitInput, GetCommitOutput] = js.native
  }
}
