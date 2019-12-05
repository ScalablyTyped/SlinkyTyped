package typingsSlinky.atAwsDashSdkClientDashS3DashNode

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketPolicyInputMod.DeleteBucketPolicyInput
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesDeleteBucketPolicyOutputMod.DeleteBucketPolicyOutput
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesInputTypesUnionMod.InputTypesUnion
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsSlinky.atAwsDashSdkMiddlewareDashStack.atAwsDashSdkMiddlewareDashStackMod.MiddlewareStack
import typingsSlinky.atAwsDashSdkTypes.buildCommandMod.Command
import typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.Handler
import typingsSlinky.atAwsDashSdkTypes.buildProtocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketPolicyCommand", JSImport.Namespace)
@js.native
object commandsDeleteBucketPolicyCommandMod extends js.Object {
  @js.native
  class DeleteBucketPolicyCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketPolicyInput, 
          OutputTypesUnion, 
          DeleteBucketPolicyOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteBucketPolicyInput) = this()
    /* CompleteClass */
    override val input: DeleteBucketPolicyInput = js.native
    val middlewareStack: MiddlewareStack[DeleteBucketPolicyInput, DeleteBucketPolicyOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketPolicyInput, DeleteBucketPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketPolicyInput, DeleteBucketPolicyOutput] = js.native
  }
  
}

