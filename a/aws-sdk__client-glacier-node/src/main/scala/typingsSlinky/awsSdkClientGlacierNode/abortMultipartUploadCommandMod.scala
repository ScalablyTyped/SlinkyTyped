package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesAbortMultipartUploadInputMod.AbortMultipartUploadInput
import typingsSlinky.awsSdkClientGlacierNode.typesAbortMultipartUploadOutputMod.AbortMultipartUploadOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abortMultipartUploadCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/AbortMultipartUploadCommand", "AbortMultipartUploadCommand")
  @js.native
  class AbortMultipartUploadCommand protected () extends Command[
          InputTypesUnion, 
          AbortMultipartUploadInput, 
          OutputTypesUnion, 
          AbortMultipartUploadOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: AbortMultipartUploadInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[AbortMultipartUploadInput, AbortMultipartUploadOutput] = js.native
  }
}
