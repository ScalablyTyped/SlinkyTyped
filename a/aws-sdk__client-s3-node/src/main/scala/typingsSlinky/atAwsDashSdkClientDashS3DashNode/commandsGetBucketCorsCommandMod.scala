package typingsSlinky.atAwsDashSdkClientDashS3DashNode

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesGetBucketCorsInputMod.GetBucketCorsInput
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesGetBucketCorsOutputMod.GetBucketCorsOutput
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

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketCorsCommand", JSImport.Namespace)
@js.native
object commandsGetBucketCorsCommandMod extends js.Object {
  @js.native
  class GetBucketCorsCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketCorsInput, 
          OutputTypesUnion, 
          GetBucketCorsOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketCorsInput) = this()
    /* CompleteClass */
    override val input: GetBucketCorsInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketCorsInput, GetBucketCorsOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketCorsInput, GetBucketCorsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketCorsInput, GetBucketCorsOutput] = js.native
  }
  
}

