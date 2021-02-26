package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryEncryption extends StObject {
  
  /**
    * Specifies the use of SSE-KMS to encrypt delivered inventory reports.
    */
  var SSEKMS: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSEKMS] = js.native
  
  /**
    * Specifies the use of SSE-S3 to encrypt delivered inventory reports.
    */
  var SSES3: js.UndefOr[typingsSlinky.awsSdk.s3Mod.SSES3] = js.native
}
object InventoryEncryption {
  
  @scala.inline
  def apply(): InventoryEncryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryEncryption]
  }
  
  @scala.inline
  implicit class InventoryEncryptionMutableBuilder[Self <: InventoryEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSSEKMS(value: SSEKMS): Self = StObject.set(x, "SSEKMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSEKMSUndefined: Self = StObject.set(x, "SSEKMS", js.undefined)
    
    @scala.inline
    def setSSES3(value: SSES3): Self = StObject.set(x, "SSES3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSES3Undefined: Self = StObject.set(x, "SSES3", js.undefined)
  }
}
