package typingsSlinky.awsSdkClientXrayNode

import typingsSlinky.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientXrayNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput
import typingsSlinky.awsSdkClientXrayNode.typesGetEncryptionConfigOutputMod.GetEncryptionConfigOutput
import typingsSlinky.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-xray-node/commands/GetEncryptionConfigCommand", JSImport.Namespace)
@js.native
object getEncryptionConfigCommandMod extends js.Object {
  
  @js.native
  class GetEncryptionConfigCommand protected () extends Command[
          InputTypesUnion, 
          GetEncryptionConfigInput, 
          OutputTypesUnion, 
          GetEncryptionConfigOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: GetEncryptionConfigInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: XRayResolvedConfiguration
    ): Handler[GetEncryptionConfigInput, GetEncryptionConfigOutput] = js.native
  }
}
