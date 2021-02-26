package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesDeleteFileInputMod.DeleteFileInput
import typingsSlinky.awsSdkClientCodecommitNode.typesDeleteFileOutputMod.DeleteFileOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteFileCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/DeleteFileCommand", "DeleteFileCommand")
  @js.native
  class DeleteFileCommand protected () extends Command[
          InputTypesUnion, 
          DeleteFileInput, 
          OutputTypesUnion, 
          DeleteFileOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: DeleteFileInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteFileInput, DeleteFileOutput] = js.native
  }
}
