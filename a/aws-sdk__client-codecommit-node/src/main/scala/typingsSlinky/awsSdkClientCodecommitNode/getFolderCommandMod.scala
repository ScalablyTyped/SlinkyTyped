package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesGetFolderInputMod.GetFolderInput
import typingsSlinky.awsSdkClientCodecommitNode.typesGetFolderOutputMod.GetFolderOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetFolderCommand", JSImport.Namespace)
@js.native
object getFolderCommandMod extends js.Object {
  @js.native
  class GetFolderCommand protected () extends Command[
          InputTypesUnion, 
          GetFolderInput, 
          OutputTypesUnion, 
          GetFolderOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetFolderInput) = this()
    /* CompleteClass */
    override val input: GetFolderInput = js.native
    val middlewareStack: MiddlewareStack[GetFolderInput, GetFolderOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetFolderInput, GetFolderOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetFolderInput, GetFolderOutput] = js.native
  }
  
}

