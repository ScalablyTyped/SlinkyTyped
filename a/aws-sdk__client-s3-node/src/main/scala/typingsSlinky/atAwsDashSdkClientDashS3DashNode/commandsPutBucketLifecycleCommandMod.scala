package typingsSlinky.atAwsDashSdkClientDashS3DashNode

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesPutBucketLifecycleInputMod.PutBucketLifecycleInput
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesPutBucketLifecycleOutputMod.PutBucketLifecycleOutput
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketLifecycleCommand", JSImport.Namespace)
@js.native
object commandsPutBucketLifecycleCommandMod extends js.Object {
  @js.native
  class PutBucketLifecycleCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketLifecycleInput, 
          OutputTypesUnion, 
          PutBucketLifecycleOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketLifecycleInput) = this()
    /* CompleteClass */
    override val input: PutBucketLifecycleInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketLifecycleInput, PutBucketLifecycleOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketLifecycleInput, PutBucketLifecycleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketLifecycleInput, PutBucketLifecycleOutput] = js.native
  }
  
}

