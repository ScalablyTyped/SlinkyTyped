package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesListPullRequestsInputMod.ListPullRequestsInput
import typingsSlinky.awsSdkClientCodecommitNode.typesListPullRequestsOutputMod.ListPullRequestsOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listPullRequestsCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/ListPullRequestsCommand", "ListPullRequestsCommand")
  @js.native
  class ListPullRequestsCommand protected () extends Command[
          InputTypesUnion, 
          ListPullRequestsInput, 
          OutputTypesUnion, 
          ListPullRequestsOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: ListPullRequestsInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListPullRequestsInput, ListPullRequestsOutput] = js.native
  }
}
