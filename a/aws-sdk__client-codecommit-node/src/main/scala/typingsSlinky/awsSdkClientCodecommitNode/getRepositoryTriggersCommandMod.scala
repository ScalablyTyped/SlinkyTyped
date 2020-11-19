package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryTriggersInputMod.GetRepositoryTriggersInput
import typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryTriggersOutputMod.GetRepositoryTriggersOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-codecommit-node/commands/GetRepositoryTriggersCommand", JSImport.Namespace)
@js.native
object getRepositoryTriggersCommandMod extends js.Object {
  
  @js.native
  class GetRepositoryTriggersCommand protected () extends Command[
          InputTypesUnion, 
          GetRepositoryTriggersInput, 
          OutputTypesUnion, 
          GetRepositoryTriggersOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetRepositoryTriggersInput) = this()
    
    val middlewareStack: MiddlewareStack[GetRepositoryTriggersInput, GetRepositoryTriggersOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetRepositoryTriggersInput, GetRepositoryTriggersOutput] = js.native
  }
}
