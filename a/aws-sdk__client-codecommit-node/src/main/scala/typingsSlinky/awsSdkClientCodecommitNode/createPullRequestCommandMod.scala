package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesCreatePullRequestInputMod.CreatePullRequestInput
import typingsSlinky.awsSdkClientCodecommitNode.typesCreatePullRequestOutputMod.CreatePullRequestOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createPullRequestCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/CreatePullRequestCommand", "CreatePullRequestCommand")
  @js.native
  class CreatePullRequestCommand protected () extends Command[
          InputTypesUnion, 
          CreatePullRequestInput, 
          OutputTypesUnion, 
          CreatePullRequestOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: CreatePullRequestInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreatePullRequestInput, CreatePullRequestOutput] = js.native
  }
}
