package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesListRepositoriesInputMod.ListRepositoriesInput
import typingsSlinky.awsSdkClientCodecommitNode.typesListRepositoriesOutputMod.ListRepositoriesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
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
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListRepositoriesInput) = this()
    
    val middlewareStack: MiddlewareStack[ListRepositoriesInput, ListRepositoriesOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListRepositoriesInput, ListRepositoriesOutput] = js.native
  }
}
