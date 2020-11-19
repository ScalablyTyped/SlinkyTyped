package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput
import typingsSlinky.awsSdkClientS3Browser.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/GetBucketLifecycleCommand", JSImport.Namespace)
@js.native
object getBucketLifecycleCommandMod extends js.Object {
  
  @js.native
  class GetBucketLifecycleCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketLifecycleInput, 
          OutputTypesUnion, 
          GetBucketLifecycleOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetBucketLifecycleInput) = this()
    
    val middlewareStack: MiddlewareStack[GetBucketLifecycleInput, GetBucketLifecycleOutput, Blob] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketLifecycleInput, GetBucketLifecycleOutput] = js.native
  }
}
