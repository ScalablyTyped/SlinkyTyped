package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionInputMod.UpdateRepositoryDescriptionInput
import typingsSlinky.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionOutputMod.UpdateRepositoryDescriptionOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdateRepositoryDescriptionCommand", JSImport.Namespace)
@js.native
object updateRepositoryDescriptionCommandMod extends js.Object {
  @js.native
  class UpdateRepositoryDescriptionCommand protected () extends Command[
          InputTypesUnion, 
          UpdateRepositoryDescriptionInput, 
          OutputTypesUnion, 
          UpdateRepositoryDescriptionOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateRepositoryDescriptionInput) = this()
    /* CompleteClass */
    override val input: UpdateRepositoryDescriptionInput = js.native
    val middlewareStack: MiddlewareStack[UpdateRepositoryDescriptionInput, UpdateRepositoryDescriptionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateRepositoryDescriptionInput, UpdateRepositoryDescriptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateRepositoryDescriptionInput, UpdateRepositoryDescriptionOutput] = js.native
  }
  
}

