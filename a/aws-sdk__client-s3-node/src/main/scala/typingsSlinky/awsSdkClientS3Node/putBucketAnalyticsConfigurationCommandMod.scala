package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationInputMod.PutBucketAnalyticsConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketAnalyticsConfigurationOutputMod.PutBucketAnalyticsConfigurationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketAnalyticsConfigurationCommand", JSImport.Namespace)
@js.native
object putBucketAnalyticsConfigurationCommandMod extends js.Object {
  @js.native
  class PutBucketAnalyticsConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketAnalyticsConfigurationInput, 
          OutputTypesUnion, 
          PutBucketAnalyticsConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketAnalyticsConfigurationInput) = this()
    /* CompleteClass */
    override val input: PutBucketAnalyticsConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[
        PutBucketAnalyticsConfigurationInput, 
        PutBucketAnalyticsConfigurationOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketAnalyticsConfigurationInput, PutBucketAnalyticsConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsSlinky.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketAnalyticsConfigurationInput, PutBucketAnalyticsConfigurationOutput] = js.native
  }
  
}

