package typingsSlinky.reactNativeFirebase.mod.RNFirebase

import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.error_
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.sent
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.timeout
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.verified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneAuthSnapshot extends StObject {
  
  var code: String | Null = js.native
  
  var error: NativeError | Null = js.native
  
  var state: sent | timeout | verified | error_ = js.native
  
  var verificationId: String = js.native
}
object PhoneAuthSnapshot {
  
  @scala.inline
  def apply(state: sent | timeout | verified | error_, verificationId: String): PhoneAuthSnapshot = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], verificationId = verificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneAuthSnapshot]
  }
  
  @scala.inline
  implicit class PhoneAuthSnapshotMutableBuilder[Self <: PhoneAuthSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeNull: Self = StObject.set(x, "code", null)
    
    @scala.inline
    def setError(value: NativeError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setState(value: sent | timeout | verified | error_): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationId(value: String): Self = StObject.set(x, "verificationId", value.asInstanceOf[js.Any])
  }
}
