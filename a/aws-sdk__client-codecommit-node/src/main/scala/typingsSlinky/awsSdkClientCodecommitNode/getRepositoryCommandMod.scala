package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryInputMod.GetRepositoryInput
import typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryOutputMod.GetRepositoryOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-codecommit-node/commands/GetRepositoryCommand", JSImport.Namespace)
@js.native
object getRepositoryCommandMod extends js.Object {
  
  @js.native
  class GetRepositoryCommand protected () extends Command[
          InputTypesUnion, 
          GetRepositoryInput, 
          OutputTypesUnion, 
          GetRepositoryOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetRepositoryInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetRepositoryInput, GetRepositoryOutput] = js.native
  }
}
