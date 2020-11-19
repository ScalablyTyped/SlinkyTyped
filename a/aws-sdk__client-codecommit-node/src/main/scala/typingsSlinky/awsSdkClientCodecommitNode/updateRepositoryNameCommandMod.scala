package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryNameInputMod.UpdateRepositoryNameInput
import typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryNameOutputMod.UpdateRepositoryNameOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdateRepositoryNameCommand", JSImport.Namespace)
@js.native
object updateRepositoryNameCommandMod extends js.Object {
  
  @js.native
  class UpdateRepositoryNameCommand protected () extends Command[
          InputTypesUnion, 
          UpdateRepositoryNameInput, 
          OutputTypesUnion, 
          UpdateRepositoryNameOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateRepositoryNameInput) = this()
    
    val middlewareStack: MiddlewareStack[UpdateRepositoryNameInput, UpdateRepositoryNameOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateRepositoryNameInput, UpdateRepositoryNameOutput] = js.native
  }
}
