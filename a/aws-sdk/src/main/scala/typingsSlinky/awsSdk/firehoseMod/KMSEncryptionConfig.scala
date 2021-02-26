package typingsSlinky.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KMSEncryptionConfig extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the encryption key. Must belong to the same AWS Region as the destination Amazon S3 bucket. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var AWSKMSKeyARN: typingsSlinky.awsSdk.firehoseMod.AWSKMSKeyARN = js.native
}
object KMSEncryptionConfig {
  
  @scala.inline
  def apply(AWSKMSKeyARN: AWSKMSKeyARN): KMSEncryptionConfig = {
    val __obj = js.Dynamic.literal(AWSKMSKeyARN = AWSKMSKeyARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMSEncryptionConfig]
  }
  
  @scala.inline
  implicit class KMSEncryptionConfigMutableBuilder[Self <: KMSEncryptionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAWSKMSKeyARN(value: AWSKMSKeyARN): Self = StObject.set(x, "AWSKMSKeyARN", value.asInstanceOf[js.Any])
  }
}
