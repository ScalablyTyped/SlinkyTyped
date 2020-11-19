package typingsSlinky.awsSdkClientS3Browser

import org.scalajs.dom.raw.Blob
import typingsSlinky.awsSdkClientS3Browser.inputTypesUnionMod.InputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.outputTypesUnionMod.OutputTypesUnion
import typingsSlinky.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsSlinky.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationInputMod.PutBucketAccelerateConfigurationInput
import typingsSlinky.awsSdkClientS3Browser.typesPutBucketAccelerateConfigurationOutputMod.PutBucketAccelerateConfigurationOutput
import typingsSlinky.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsSlinky.awsSdkTypes.commandMod.Command
import typingsSlinky.awsSdkTypes.middlewareMod.Handler
import typingsSlinky.awsSdkTypes.protocolMod.OperationModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-s3-browser/commands/PutBucketAccelerateConfigurationCommand", JSImport.Namespace)
@js.native
object putBucketAccelerateConfigurationCommandMod extends js.Object {
  
  @js.native
  class PutBucketAccelerateConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketAccelerateConfigurationInput, 
          OutputTypesUnion, 
          PutBucketAccelerateConfigurationOutput, 
          S3ResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutBucketAccelerateConfigurationInput) = this()
    
    val middlewareStack: MiddlewareStack[PutBucketAccelerateConfigurationInput, PutBucketAccelerateConfigurationOutput, Blob] = js.native
    
    val model: OperationModel = js.native
    
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketAccelerateConfigurationInput, PutBucketAccelerateConfigurationOutput] = js.native
  }
}
