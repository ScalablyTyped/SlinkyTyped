package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketLifecycleConfigurationCommand", JSImport.Namespace)
@js.native
object getBucketLifecycleConfigurationCommandMod extends js.Object {
  
  @js.native
  class GetBucketLifecycleConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketLifecycleConfigurationInput, 
          OutputTypesUnion, 
          GetBucketLifecycleConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketLifecycleConfigurationInput) = this()
    
    val middlewareStack: MiddlewareStack[
        GetBucketLifecycleConfigurationInput, 
        GetBucketLifecycleConfigurationOutput, 
        Readable
      ] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketLifecycleConfigurationInput, GetBucketLifecycleConfigurationOutput] = js.native
  }
}
