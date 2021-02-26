package typingsSlinky.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamServerSideEncryption extends StObject {
  
  /**
    * Whether to enable encryption at rest. Default is `false`.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the encryption key. Required when `keyType` is `CUSTOMER_MANAGED_CMK`.
    */
  var keyArn: js.UndefOr[String] = js.native
  
  /**
    * Type of encryption key. Default is `AWS_OWNED_CMK`. Valid values are `AWS_OWNED_CMK` and `CUSTOMER_MANAGED_CMK`
    */
  var keyType: js.UndefOr[String] = js.native
}
object FirehoseDeliveryStreamServerSideEncryption {
  
  @scala.inline
  def apply(): FirehoseDeliveryStreamServerSideEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamServerSideEncryption]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamServerSideEncryptionMutableBuilder[Self <: FirehoseDeliveryStreamServerSideEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setKeyArn(value: String): Self = StObject.set(x, "keyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyArnUndefined: Self = StObject.set(x, "keyArn", js.undefined)
    
    @scala.inline
    def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
  }
}
