package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleInputMod.UpdatePullRequestTitleInput
import typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestTitleOutputMod.UpdatePullRequestTitleOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdatePullRequestTitleCommand", JSImport.Namespace)
@js.native
object updatePullRequestTitleCommandMod extends js.Object {
  
  @js.native
  class UpdatePullRequestTitleCommand protected () extends Command[
          InputTypesUnion, 
          UpdatePullRequestTitleInput, 
          OutputTypesUnion, 
          UpdatePullRequestTitleOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: UpdatePullRequestTitleInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdatePullRequestTitleInput, UpdatePullRequestTitleOutput] = js.native
  }
}
