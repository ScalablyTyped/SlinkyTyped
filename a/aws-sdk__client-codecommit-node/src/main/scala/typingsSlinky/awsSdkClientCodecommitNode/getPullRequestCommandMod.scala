package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesGetPullRequestInputMod.GetPullRequestInput
import typingsSlinky.awsSdkClientCodecommitNode.typesGetPullRequestOutputMod.GetPullRequestOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-codecommit-node/commands/GetPullRequestCommand", JSImport.Namespace)
@js.native
object getPullRequestCommandMod extends js.Object {
  
  @js.native
  class GetPullRequestCommand protected () extends Command[
          InputTypesUnion, 
          GetPullRequestInput, 
          OutputTypesUnion, 
          GetPullRequestOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetPullRequestInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetPullRequestInput, GetPullRequestOutput] = js.native
  }
}
