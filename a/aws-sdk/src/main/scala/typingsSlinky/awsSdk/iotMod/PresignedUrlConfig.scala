package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresignedUrlConfig extends StObject {
  
  /**
    * How long (in seconds) pre-signed URLs are valid. Valid values are 60 - 3600, the default value is 3600 seconds. Pre-signed URLs are generated when Jobs receives an MQTT request for the job document.
    */
  var expiresInSec: js.UndefOr[ExpiresInSec] = js.native
  
  /**
    * The ARN of an IAM role that grants grants permission to download files from the S3 bucket where the job data/updates are stored. The role must also grant permission for IoT to download the files.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}
object PresignedUrlConfig {
  
  @scala.inline
  def apply(): PresignedUrlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresignedUrlConfig]
  }
  
  @scala.inline
  implicit class PresignedUrlConfigMutableBuilder[Self <: PresignedUrlConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiresInSec(value: ExpiresInSec): Self = StObject.set(x, "expiresInSec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresInSecUndefined: Self = StObject.set(x, "expiresInSec", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
  }
}
