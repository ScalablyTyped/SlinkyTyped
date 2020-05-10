package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryInputMod.GetRepositoryInput
import typingsSlinky.awsSdkClientCodecommitNode.typesGetRepositoryOutputMod.GetRepositoryOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetRepositoryCommand", JSImport.Namespace)
@js.native
object getRepositoryCommandMod extends js.Object {
  @js.native
  class GetRepositoryCommand protected () extends Command[
          InputTypesUnion, 
          GetRepositoryInput, 
          OutputTypesUnion, 
          GetRepositoryOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetRepositoryInput) = this()
    val middlewareStack: MiddlewareStack[GetRepositoryInput, GetRepositoryOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetRepositoryInput, GetRepositoryOutput] = js.native
  }
  
}

