package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationInputMod.PutBucketLifecycleConfigurationInput
import typingsSlinky.awsSdkClientS3Node.typesPutBucketLifecycleConfigurationOutputMod.PutBucketLifecycleConfigurationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketLifecycleConfigurationCommand", JSImport.Namespace)
@js.native
object putBucketLifecycleConfigurationCommandMod extends js.Object {
  
  @js.native
  class PutBucketLifecycleConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketLifecycleConfigurationInput, 
          OutputTypesUnion, 
          PutBucketLifecycleConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketLifecycleConfigurationInput) = this()
    
    val middlewareStack: MiddlewareStack[
        PutBucketLifecycleConfigurationInput, 
        PutBucketLifecycleConfigurationOutput, 
        Readable
      ] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketLifecycleConfigurationInput, PutBucketLifecycleConfigurationOutput] = js.native
  }
}
