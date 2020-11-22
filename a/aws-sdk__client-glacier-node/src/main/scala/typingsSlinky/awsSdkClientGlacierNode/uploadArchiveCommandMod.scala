package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesUploadArchiveInputMod.UploadArchiveInput
import typingsSlinky.awsSdkClientGlacierNode.typesUploadArchiveOutputMod.UploadArchiveOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-glacier-node/commands/UploadArchiveCommand", JSImport.Namespace)
@js.native
object uploadArchiveCommandMod extends js.Object {
  
  @js.native
  class UploadArchiveCommand protected () extends Command[
          InputTypesUnion, 
          UploadArchiveInput[Readable], 
          OutputTypesUnion, 
          UploadArchiveOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: UploadArchiveInput[Readable]) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[UploadArchiveInput[Readable], UploadArchiveOutput] = js.native
  }
}
