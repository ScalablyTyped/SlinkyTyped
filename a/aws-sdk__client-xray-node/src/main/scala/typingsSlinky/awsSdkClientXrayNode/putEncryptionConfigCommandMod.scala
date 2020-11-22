package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput
import typingsSlinky.awsSdkClientXrayNode.typesPutEncryptionConfigOutputMod.PutEncryptionConfigOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-xray-node/commands/PutEncryptionConfigCommand", JSImport.Namespace)
@js.native
object putEncryptionConfigCommandMod extends js.Object {
  
  @js.native
  class PutEncryptionConfigCommand protected () extends Command[
          InputTypesUnion, 
          PutEncryptionConfigInput, 
          OutputTypesUnion, 
          PutEncryptionConfigOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: PutEncryptionConfigInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: XRayResolvedConfiguration
    ): Handler[PutEncryptionConfigInput, PutEncryptionConfigOutput] = js.native
  }
}
