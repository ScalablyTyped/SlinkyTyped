package typingsSlinky.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublicKey extends StObject {
  
  /**
    * The fingerprint of the public key.
    */
  var Fingerprint: js.UndefOr[String] = js.native
  
  /**
    * The ending time of validity of the public key.
    */
  var ValidityEndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The starting time of validity of the public key.
    */
  var ValidityStartTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The DER encoded public key value in PKCS#1 format.
    */
  var Value: js.UndefOr[ByteBuffer] = js.native
}
object PublicKey {
  
  @scala.inline
  def apply(): PublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicKey]
  }
  
  @scala.inline
  implicit class PublicKeyMutableBuilder[Self <: PublicKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "Fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "Fingerprint", js.undefined)
    
    @scala.inline
    def setValidityEndTime(value: js.Date): Self = StObject.set(x, "ValidityEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidityEndTimeUndefined: Self = StObject.set(x, "ValidityEndTime", js.undefined)
    
    @scala.inline
    def setValidityStartTime(value: js.Date): Self = StObject.set(x, "ValidityStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidityStartTimeUndefined: Self = StObject.set(x, "ValidityStartTime", js.undefined)
    
    @scala.inline
    def setValue(value: ByteBuffer): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
