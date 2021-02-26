package typingsSlinky.awsSdkClientCodecommitNode

import typingsSlinky.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsSlinky.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientCodecommitNode.typesPutRepositoryTriggersInputMod.PutRepositoryTriggersInput
import typingsSlinky.awsSdkClientCodecommitNode.typesPutRepositoryTriggersOutputMod.PutRepositoryTriggersOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object putRepositoryTriggersCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/PutRepositoryTriggersCommand", "PutRepositoryTriggersCommand")
  @js.native
  class PutRepositoryTriggersCommand protected () extends Command[
          InputTypesUnion, 
          PutRepositoryTriggersInput, 
          OutputTypesUnion, 
          PutRepositoryTriggersOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: PutRepositoryTriggersInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PutRepositoryTriggersInput, PutRepositoryTriggersOutput] = js.native
  }
}
