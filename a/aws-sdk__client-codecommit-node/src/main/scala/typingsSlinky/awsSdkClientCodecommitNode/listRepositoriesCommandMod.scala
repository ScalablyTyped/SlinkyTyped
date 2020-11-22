package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesListRepositoriesInputMod.ListRepositoriesInput
import typingsSlinky.awsSdkClientCodecommitNode.typesListRepositoriesOutputMod.ListRepositoriesOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-codecommit-node/commands/ListRepositoriesCommand", JSImport.Namespace)
@js.native
object listRepositoriesCommandMod extends js.Object {
  
  @js.native
  class ListRepositoriesCommand protected () extends Command[
          InputTypesUnion, 
          ListRepositoriesInput, 
          OutputTypesUnion, 
          ListRepositoriesOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: ListRepositoriesInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListRepositoriesInput, ListRepositoriesOutput] = js.native
  }
}
