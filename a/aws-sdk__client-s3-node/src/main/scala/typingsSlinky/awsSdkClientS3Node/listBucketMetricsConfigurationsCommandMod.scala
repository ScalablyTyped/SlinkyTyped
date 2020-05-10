package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesListBucketMetricsConfigurationsInputMod.ListBucketMetricsConfigurationsInput
import typingsSlinky.awsSdkClientS3Node.typesListBucketMetricsConfigurationsOutputMod.ListBucketMetricsConfigurationsOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListBucketMetricsConfigurationsCommand", JSImport.Namespace)
@js.native
object listBucketMetricsConfigurationsCommandMod extends js.Object {
  @js.native
  class ListBucketMetricsConfigurationsCommand protected () extends Command[
          InputTypesUnion, 
          ListBucketMetricsConfigurationsInput, 
          OutputTypesUnion, 
          ListBucketMetricsConfigurationsOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListBucketMetricsConfigurationsInput) = this()
    val middlewareStack: MiddlewareStack[
        ListBucketMetricsConfigurationsInput, 
        ListBucketMetricsConfigurationsOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListBucketMetricsConfigurationsInput, ListBucketMetricsConfigurationsOutput] = js.native
  }
  
}

