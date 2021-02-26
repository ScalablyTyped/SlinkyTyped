package typingsSlinky.naverWhale.whale.contentSettings

import typingsSlinky.naverWhale.naverWhaleStrings.allow
import typingsSlinky.naverWhale.naverWhaleStrings.block
import typingsSlinky.naverWhale.naverWhaleStrings.session_only
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookieSetDetails
  extends typingsSlinky.chrome.chrome.contentSettings.SetDetails {
  
  @JSName("setting")
  var setting_CookieSetDetails: allow | block | session_only = js.native
}
object CookieSetDetails {
  
  @scala.inline
  def apply(primaryPattern: String, setting: allow | block | session_only): CookieSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieSetDetails]
  }
  
  @scala.inline
  implicit class CookieSetDetailsMutableBuilder[Self <: CookieSetDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetting(value: allow | block | session_only): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
