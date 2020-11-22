package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput
import typingsSlinky.awsSdkClientKmsNode.typesCancelKeyDeletionOutputMod.CancelKeyDeletionOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-node/commands/CancelKeyDeletionCommand", JSImport.Namespace)
@js.native
object cancelKeyDeletionCommandMod extends js.Object {
  
  @js.native
  class CancelKeyDeletionCommand protected () extends Command[
          InputTypesUnion, 
          CancelKeyDeletionInput, 
          OutputTypesUnion, 
          CancelKeyDeletionOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: CancelKeyDeletionInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[CancelKeyDeletionInput, CancelKeyDeletionOutput] = js.native
  }
}
