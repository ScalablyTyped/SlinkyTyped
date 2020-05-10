package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesBatchGetRepositoriesInputMod.BatchGetRepositoriesInput
import typingsSlinky.awsSdkClientCodecommitNode.typesBatchGetRepositoriesOutputMod.BatchGetRepositoriesOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/BatchGetRepositoriesCommand", JSImport.Namespace)
@js.native
object batchGetRepositoriesCommandMod extends js.Object {
  @js.native
  class BatchGetRepositoriesCommand protected () extends Command[
          InputTypesUnion, 
          BatchGetRepositoriesInput, 
          OutputTypesUnion, 
          BatchGetRepositoriesOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: BatchGetRepositoriesInput) = this()
    val middlewareStack: MiddlewareStack[BatchGetRepositoriesInput, BatchGetRepositoriesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[BatchGetRepositoriesInput, BatchGetRepositoriesOutput] = js.native
  }
  
}

