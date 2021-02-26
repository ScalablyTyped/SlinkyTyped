package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionInputMod.UpdatePullRequestDescriptionInput
import typingsSlinky.awsSdkClientCodecommitNode.typesUpdatePullRequestDescriptionOutputMod.UpdatePullRequestDescriptionOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updatePullRequestDescriptionCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/UpdatePullRequestDescriptionCommand", "UpdatePullRequestDescriptionCommand")
  @js.native
  class UpdatePullRequestDescriptionCommand protected () extends Command[
          InputTypesUnion, 
          UpdatePullRequestDescriptionInput, 
          OutputTypesUnion, 
          UpdatePullRequestDescriptionOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: UpdatePullRequestDescriptionInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdatePullRequestDescriptionInput, UpdatePullRequestDescriptionOutput] = js.native
  }
}
