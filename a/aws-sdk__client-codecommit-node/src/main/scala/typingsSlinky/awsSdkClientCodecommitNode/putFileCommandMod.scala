package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesPutFileInputMod.PutFileInput
import typingsSlinky.awsSdkClientCodecommitNode.typesPutFileOutputMod.PutFileOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putFileCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/PutFileCommand", "PutFileCommand")
  @js.native
  class PutFileCommand protected () extends Command[
          InputTypesUnion, 
          PutFileInput, 
          OutputTypesUnion, 
          PutFileOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: PutFileInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PutFileInput, PutFileOutput] = js.native
  }
}
