package typingsSlinky.atAwsDashSdkClientDashS3DashNode

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesGetBucketAclInputMod.GetBucketAclInput
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesGetBucketAclOutputMod.GetBucketAclOutput
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

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketAclCommand", JSImport.Namespace)
@js.native
object commandsGetBucketAclCommandMod extends js.Object {
  @js.native
  class GetBucketAclCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketAclInput, 
          OutputTypesUnion, 
          GetBucketAclOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketAclInput) = this()
    /* CompleteClass */
    override val input: GetBucketAclInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketAclInput, GetBucketAclOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketAclInput, GetBucketAclOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.atAwsDashSdkTypes.buildMiddlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketAclInput, GetBucketAclOutput] = js.native
  }
  
}

