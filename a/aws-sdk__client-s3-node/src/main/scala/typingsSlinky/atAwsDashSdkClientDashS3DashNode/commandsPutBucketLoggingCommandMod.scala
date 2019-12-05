package typingsSlinky.atAwsDashSdkClientDashS3DashNode

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesPutBucketLoggingInputMod.PutBucketLoggingInput
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesPutBucketLoggingOutputMod.PutBucketLoggingOutput
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketLoggingCommand", JSImport.Namespace)
@js.native
object commandsPutBucketLoggingCommandMod extends js.Object {
  @js.native
  class PutBucketLoggingCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketLoggingInput, 
          OutputTypesUnion, 
          PutBucketLoggingOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketLoggingInput) = this()
    /* CompleteClass */
    override val input: PutBucketLoggingInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketLoggingInput, PutBucketLoggingOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketLoggingInput, PutBucketLoggingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketLoggingInput, PutBucketLoggingOutput] = js.native
  }
  
}

