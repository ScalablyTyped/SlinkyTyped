package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesPutBucketVersioningInputMod.PutBucketVersioningInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketVersioningCommand", JSImport.Namespace)
@js.native
object putBucketVersioningCommandMod extends js.Object {
  @js.native
  class PutBucketVersioningCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketVersioningInput, 
          OutputTypesUnion, 
          PutBucketVersioningOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketVersioningInput) = this()
    val middlewareStack: MiddlewareStack[PutBucketVersioningInput, PutBucketVersioningOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketVersioningInput, PutBucketVersioningOutput] = js.native
  }
  
}

