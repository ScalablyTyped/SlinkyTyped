package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesPutRepositoryTriggersInputMod.PutRepositoryTriggersInput
import typingsSlinky.awsSdkClientCodecommitNode.typesPutRepositoryTriggersOutputMod.PutRepositoryTriggersOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/PutRepositoryTriggersCommand", JSImport.Namespace)
@js.native
object putRepositoryTriggersCommandMod extends js.Object {
  @js.native
  class PutRepositoryTriggersCommand protected () extends Command[
          InputTypesUnion, 
          PutRepositoryTriggersInput, 
          OutputTypesUnion, 
          PutRepositoryTriggersOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutRepositoryTriggersInput) = this()
    val middlewareStack: MiddlewareStack[PutRepositoryTriggersInput, PutRepositoryTriggersOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PutRepositoryTriggersInput, PutRepositoryTriggersOutput] = js.native
  }
  
}

