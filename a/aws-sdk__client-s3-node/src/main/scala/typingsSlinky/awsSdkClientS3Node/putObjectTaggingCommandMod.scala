package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesPutObjectTaggingInputMod.PutObjectTaggingInput
import typingsSlinky.awsSdkClientS3Node.typesPutObjectTaggingOutputMod.PutObjectTaggingOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-node/commands/PutObjectTaggingCommand", JSImport.Namespace)
@js.native
object putObjectTaggingCommandMod extends js.Object {
  
  @js.native
  class PutObjectTaggingCommand protected () extends Command[
          InputTypesUnion, 
          PutObjectTaggingInput, 
          OutputTypesUnion, 
          PutObjectTaggingOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutObjectTaggingInput) = this()
    
    val middlewareStack: MiddlewareStack[PutObjectTaggingInput, PutObjectTaggingOutput, Readable] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutObjectTaggingInput, PutObjectTaggingOutput] = js.native
  }
}
