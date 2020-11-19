package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesDeleteFileInputMod.DeleteFileInput
import typingsSlinky.awsSdkClientCodecommitNode.typesDeleteFileOutputMod.DeleteFileOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-codecommit-node/commands/DeleteFileCommand", JSImport.Namespace)
@js.native
object deleteFileCommandMod extends js.Object {
  
  @js.native
  class DeleteFileCommand protected () extends Command[
          InputTypesUnion, 
          DeleteFileInput, 
          OutputTypesUnion, 
          DeleteFileOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteFileInput) = this()
    
    val middlewareStack: MiddlewareStack[DeleteFileInput, DeleteFileOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteFileInput, DeleteFileOutput] = js.native
  }
}
