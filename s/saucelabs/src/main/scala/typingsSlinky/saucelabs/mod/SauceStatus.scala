package typingsSlinky.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SauceStatus
  extends /* key */ StringDictionary[js.Any] {
  
  var service_operational: js.UndefOr[Boolean] = js.native
  
  var status_message: js.UndefOr[String] = js.native
  
  var wait_time: js.UndefOr[Double] = js.native
}
object SauceStatus {
  
  @scala.inline
  def apply(): SauceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SauceStatus]
  }
  
  @scala.inline
  implicit class SauceStatusMutableBuilder[Self <: SauceStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setService_operational(value: Boolean): Self = StObject.set(x, "service_operational", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService_operationalUndefined: Self = StObject.set(x, "service_operational", js.undefined)
    
    @scala.inline
    def setStatus_message(value: String): Self = StObject.set(x, "status_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus_messageUndefined: Self = StObject.set(x, "status_message", js.undefined)
    
    @scala.inline
    def setWait_time(value: Double): Self = StObject.set(x, "wait_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_timeUndefined: Self = StObject.set(x, "wait_time", js.undefined)
  }
}
