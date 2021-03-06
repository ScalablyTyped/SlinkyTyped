package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesListBranchesInputMod.ListBranchesInput
import typingsSlinky.awsSdkClientCodecommitNode.typesListBranchesOutputMod.ListBranchesOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listBranchesCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/ListBranchesCommand", "ListBranchesCommand")
  @js.native
  class ListBranchesCommand protected () extends Command[
          InputTypesUnion, 
          ListBranchesInput, 
          OutputTypesUnion, 
          ListBranchesOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: ListBranchesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListBranchesInput, ListBranchesOutput] = js.native
  }
}
