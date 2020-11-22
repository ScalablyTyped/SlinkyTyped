package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesUploadMultipartPartInputMod.UploadMultipartPartInput
import typingsSlinky.awsSdkClientGlacierNode.typesUploadMultipartPartOutputMod.UploadMultipartPartOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-glacier-node/commands/UploadMultipartPartCommand", JSImport.Namespace)
@js.native
object uploadMultipartPartCommandMod extends js.Object {
  
  @js.native
  class UploadMultipartPartCommand protected () extends Command[
          InputTypesUnion, 
          UploadMultipartPartInput[Readable], 
          OutputTypesUnion, 
          UploadMultipartPartOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: UploadMultipartPartInput[Readable]) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[UploadMultipartPartInput[Readable], UploadMultipartPartOutput] = js.native
  }
}
