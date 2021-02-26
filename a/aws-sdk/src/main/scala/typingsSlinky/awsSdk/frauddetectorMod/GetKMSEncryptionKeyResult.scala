package typingsSlinky.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetKMSEncryptionKeyResult extends StObject {
  
  /**
    * The KMS encryption key.
    */
  var kmsKey: js.UndefOr[KMSKey] = js.native
}
object GetKMSEncryptionKeyResult {
  
  @scala.inline
  def apply(): GetKMSEncryptionKeyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKMSEncryptionKeyResult]
  }
  
  @scala.inline
  implicit class GetKMSEncryptionKeyResultMutableBuilder[Self <: GetKMSEncryptionKeyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsKey(value: KMSKey): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
  }
}
