package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput
import typingsSlinky.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketLifecycleConfigurationCommand", JSImport.Namespace)
@js.native
object getBucketLifecycleConfigurationCommandMod extends js.Object {
  
  @js.native
  class GetBucketLifecycleConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketLifecycleConfigurationInput, 
          OutputTypesUnion, 
          GetBucketLifecycleConfigurationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetBucketLifecycleConfigurationInput) = this()
    
    val middlewareStack: MiddlewareStack[GetBucketLifecycleConfigurationInput, GetBucketLifecycleConfigurationOutput, Blob] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketLifecycleConfigurationInput, GetBucketLifecycleConfigurationOutput] = js.native
  }
}
