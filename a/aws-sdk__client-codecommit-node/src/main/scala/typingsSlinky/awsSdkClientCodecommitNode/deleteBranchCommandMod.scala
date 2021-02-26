package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesDeleteBranchInputMod.DeleteBranchInput
import typingsSlinky.awsSdkClientCodecommitNode.typesDeleteBranchOutputMod.DeleteBranchOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteBranchCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/DeleteBranchCommand", "DeleteBranchCommand")
  @js.native
  class DeleteBranchCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBranchInput, 
          OutputTypesUnion, 
          DeleteBranchOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: DeleteBranchInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteBranchInput, DeleteBranchOutput] = js.native
  }
}
