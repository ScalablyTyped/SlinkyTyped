package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesCompleteMultipartUploadInputMod.CompleteMultipartUploadInput
import typingsSlinky.awsSdkClientGlacierNode.typesCompleteMultipartUploadOutputMod.CompleteMultipartUploadOutput
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object completeMultipartUploadCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/CompleteMultipartUploadCommand", "CompleteMultipartUploadCommand")
  @js.native
  class CompleteMultipartUploadCommand protected () extends Command[
          InputTypesUnion, 
          CompleteMultipartUploadInput, 
          OutputTypesUnion, 
          CompleteMultipartUploadOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: CompleteMultipartUploadInput) = this()
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ js.Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[CompleteMultipartUploadInput, CompleteMultipartUploadOutput] = js.native
  }
}
