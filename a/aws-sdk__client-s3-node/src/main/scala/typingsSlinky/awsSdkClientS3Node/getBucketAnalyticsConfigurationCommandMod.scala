package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationInputMod.GetBucketAnalyticsConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketAnalyticsConfigurationOutputMod.GetBucketAnalyticsConfigurationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketAnalyticsConfigurationCommand", JSImport.Namespace)
@js.native
object getBucketAnalyticsConfigurationCommandMod extends js.Object {
  
  @js.native
  class GetBucketAnalyticsConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketAnalyticsConfigurationInput, 
          OutputTypesUnion, 
          GetBucketAnalyticsConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketAnalyticsConfigurationInput) = this()
    
    val middlewareStack: MiddlewareStack[
        GetBucketAnalyticsConfigurationInput, 
        GetBucketAnalyticsConfigurationOutput, 
        Readable
      ] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketAnalyticsConfigurationInput, GetBucketAnalyticsConfigurationOutput] = js.native
  }
}
