package typingsSlinky.awsSdkClientKmsNode

import typingsSlinky.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsSlinky.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientKmsNode.typesCreateKeyInputMod.CreateKeyInput
import typingsSlinky.awsSdkClientKmsNode.typesCreateKeyOutputMod.CreateKeyOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-kms-node/commands/CreateKeyCommand", JSImport.Namespace)
@js.native
object createKeyCommandMod extends js.Object {
  
  @js.native
  class CreateKeyCommand protected () extends Command[
          InputTypesUnion, 
          CreateKeyInput, 
          OutputTypesUnion, 
          CreateKeyOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: CreateKeyInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: KMSResolvedConfiguration
    ): Handler[CreateKeyInput, CreateKeyOutput] = js.native
  }
}
