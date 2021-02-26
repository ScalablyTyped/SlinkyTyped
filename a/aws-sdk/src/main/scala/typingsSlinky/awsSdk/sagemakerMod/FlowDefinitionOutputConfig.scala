package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlowDefinitionOutputConfig extends StObject {
  
  /**
    * The Amazon Key Management Service (KMS) key ID for server-side encryption.
    */
  var KmsKeyId: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.KmsKeyId] = js.native
  
  /**
    * The Amazon S3 path where the object containing human output will be made available.
    */
  var S3OutputPath: S3Uri = js.native
}
object FlowDefinitionOutputConfig {
  
  @scala.inline
  def apply(S3OutputPath: S3Uri): FlowDefinitionOutputConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDefinitionOutputConfig]
  }
  
  @scala.inline
  implicit class FlowDefinitionOutputConfigMutableBuilder[Self <: FlowDefinitionOutputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setS3OutputPath(value: S3Uri): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
  }
}
