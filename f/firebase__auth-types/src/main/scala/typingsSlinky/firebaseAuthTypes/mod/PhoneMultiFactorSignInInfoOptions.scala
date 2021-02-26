package typingsSlinky.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneMultiFactorSignInInfoOptions extends PhoneInfoOptions {
  
  var multiFactorHint: js.UndefOr[MultiFactorInfo] = js.native
  
  var multiFactorUid: js.UndefOr[String] = js.native
  
  var session: MultiFactorSession = js.native
}
object PhoneMultiFactorSignInInfoOptions {
  
  @scala.inline
  def apply(session: MultiFactorSession): PhoneMultiFactorSignInInfoOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMultiFactorSignInInfoOptions]
  }
  
  @scala.inline
  implicit class PhoneMultiFactorSignInInfoOptionsMutableBuilder[Self <: PhoneMultiFactorSignInInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMultiFactorHint(value: MultiFactorInfo): Self = StObject.set(x, "multiFactorHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiFactorHintUndefined: Self = StObject.set(x, "multiFactorHint", js.undefined)
    
    @scala.inline
    def setMultiFactorUid(value: String): Self = StObject.set(x, "multiFactorUid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiFactorUidUndefined: Self = StObject.set(x, "multiFactorUid", js.undefined)
    
    @scala.inline
    def setSession(value: MultiFactorSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
