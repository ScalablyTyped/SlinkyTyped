package typingsSlinky.firefoxWebextBrowser.browser.webNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnTabReplacedDetails extends StObject {
  
  /** The ID of the tab that was replaced. */
  var replacedTabId: Double = js.native
  
  /** The ID of the tab that replaced the old tab. */
  var tabId: Double = js.native
  
  /** The time when the replacement happened, in milliseconds since the epoch. */
  var timeStamp: Double = js.native
}
object OnTabReplacedDetails {
  
  @scala.inline
  def apply(replacedTabId: Double, tabId: Double, timeStamp: Double): OnTabReplacedDetails = {
    val __obj = js.Dynamic.literal(replacedTabId = replacedTabId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnTabReplacedDetails]
  }
  
  @scala.inline
  implicit class OnTabReplacedDetailsMutableBuilder[Self <: OnTabReplacedDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplacedTabId(value: Double): Self = StObject.set(x, "replacedTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
