package typingsSlinky.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DELETED extends StObject {
  
  var CHANGED: typingsSlinky.chromeApps.chromeAppsStrings.CHANGED = js.native
  
  var DELETED: typingsSlinky.chromeApps.chromeAppsStrings.DELETED = js.native
}
object DELETED {
  
  @scala.inline
  def apply(
    CHANGED: typingsSlinky.chromeApps.chromeAppsStrings.CHANGED,
    DELETED: typingsSlinky.chromeApps.chromeAppsStrings.DELETED
  ): DELETED = {
    val __obj = js.Dynamic.literal(CHANGED = CHANGED.asInstanceOf[js.Any], DELETED = DELETED.asInstanceOf[js.Any])
    __obj.asInstanceOf[DELETED]
  }
  
  @scala.inline
  implicit class DELETEDMutableBuilder[Self <: DELETED] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCHANGED(value: typingsSlinky.chromeApps.chromeAppsStrings.CHANGED): Self = StObject.set(x, "CHANGED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDELETED(value: typingsSlinky.chromeApps.chromeAppsStrings.DELETED): Self = StObject.set(x, "DELETED", value.asInstanceOf[js.Any])
  }
}
