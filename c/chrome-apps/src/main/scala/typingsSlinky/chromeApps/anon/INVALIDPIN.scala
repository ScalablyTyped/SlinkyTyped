package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.INVALID_PIN
import typingsSlinky.chromeApps.chromeAppsStrings.INVALID_PUK
import typingsSlinky.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED
import typingsSlinky.chromeApps.chromeAppsStrings.UNKNOWN_ERROR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INVALIDPIN extends StObject {
  
  var INVALID_PIN: typingsSlinky.chromeApps.chromeAppsStrings.INVALID_PIN = js.native
  
  var INVALID_PUK: typingsSlinky.chromeApps.chromeAppsStrings.INVALID_PUK = js.native
  
  var MAX_ATTEMPTS_EXCEEDED: typingsSlinky.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED = js.native
  
  var UNKNOWN_ERROR: typingsSlinky.chromeApps.chromeAppsStrings.UNKNOWN_ERROR = js.native
}
object INVALIDPIN {
  
  @scala.inline
  def apply(
    INVALID_PIN: INVALID_PIN,
    INVALID_PUK: INVALID_PUK,
    MAX_ATTEMPTS_EXCEEDED: MAX_ATTEMPTS_EXCEEDED,
    UNKNOWN_ERROR: UNKNOWN_ERROR
  ): INVALIDPIN = {
    val __obj = js.Dynamic.literal(INVALID_PIN = INVALID_PIN.asInstanceOf[js.Any], INVALID_PUK = INVALID_PUK.asInstanceOf[js.Any], MAX_ATTEMPTS_EXCEEDED = MAX_ATTEMPTS_EXCEEDED.asInstanceOf[js.Any], UNKNOWN_ERROR = UNKNOWN_ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[INVALIDPIN]
  }
  
  @scala.inline
  implicit class INVALIDPINMutableBuilder[Self <: INVALIDPIN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setINVALID_PIN(value: INVALID_PIN): Self = StObject.set(x, "INVALID_PIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINVALID_PUK(value: INVALID_PUK): Self = StObject.set(x, "INVALID_PUK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAX_ATTEMPTS_EXCEEDED(value: MAX_ATTEMPTS_EXCEEDED): Self = StObject.set(x, "MAX_ATTEMPTS_EXCEEDED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN_ERROR(value: UNKNOWN_ERROR): Self = StObject.set(x, "UNKNOWN_ERROR", value.asInstanceOf[js.Any])
  }
}
