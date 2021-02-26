package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryNameInputMod.UpdateRepositoryNameInput
import typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryNameOutputMod.UpdateRepositoryNameOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateRepositoryNameCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/UpdateRepositoryNameCommand", "UpdateRepositoryNameCommand")
  @js.native
  class UpdateRepositoryNameCommand protected () extends Command[
          InputTypesUnion, 
          UpdateRepositoryNameInput, 
          OutputTypesUnion, 
          UpdateRepositoryNameOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: UpdateRepositoryNameInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateRepositoryNameInput, UpdateRepositoryNameOutput] = js.native
  }
}
