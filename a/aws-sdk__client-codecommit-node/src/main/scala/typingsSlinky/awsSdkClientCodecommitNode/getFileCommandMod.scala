package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesGetFileInputMod.GetFileInput
import typingsSlinky.awsSdkClientCodecommitNode.typesGetFileOutputMod.GetFileOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetFileCommand", JSImport.Namespace)
@js.native
object getFileCommandMod extends js.Object {
  @js.native
  class GetFileCommand protected () extends Command[
          InputTypesUnion, 
          GetFileInput, 
          OutputTypesUnion, 
          GetFileOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetFileInput) = this()
    val middlewareStack: MiddlewareStack[GetFileInput, GetFileOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetFileInput, GetFileOutput] = js.native
  }
  
}

