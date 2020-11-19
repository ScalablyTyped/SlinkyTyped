package typingsSlinky.awsSdkClientGlacierNode

import typingsSlinky.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsSlinky.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientGlacierNode.typesInitiateMultipartUploadInputMod.InitiateMultipartUploadInput
import typingsSlinky.awsSdkClientGlacierNode.typesInitiateMultipartUploadOutputMod.InitiateMultipartUploadOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-glacier-node/commands/InitiateMultipartUploadCommand", JSImport.Namespace)
@js.native
object initiateMultipartUploadCommandMod extends js.Object {
  
  @js.native
  class InitiateMultipartUploadCommand protected () extends Command[
          InputTypesUnion, 
          InitiateMultipartUploadInput, 
          OutputTypesUnion, 
          InitiateMultipartUploadOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: InitiateMultipartUploadInput) = this()
    
    val middlewareStack: MiddlewareStack[InitiateMultipartUploadInput, InitiateMultipartUploadOutput, Readable] = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[InitiateMultipartUploadInput, InitiateMultipartUploadOutput] = js.native
  }
}
