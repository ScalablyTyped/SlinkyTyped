package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesCreateBranchInputMod.CreateBranchInput
import typingsSlinky.awsSdkClientCodecommitNode.typesCreateBranchOutputMod.CreateBranchOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-codecommit-node/commands/CreateBranchCommand", JSImport.Namespace)
@js.native
object createBranchCommandMod extends js.Object {
  
  @js.native
  class CreateBranchCommand protected () extends Command[
          InputTypesUnion, 
          CreateBranchInput, 
          OutputTypesUnion, 
          CreateBranchOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: CreateBranchInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreateBranchInput, CreateBranchOutput] = js.native
  }
}
