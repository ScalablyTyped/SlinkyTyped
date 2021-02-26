package typingsSlinky.onesignalCordovaPlugin.OneSignalCordovaPlugin

import typingsSlinky.onesignalCordovaPlugin.onesignalCordovaPluginStrings.ActionTaken
import typingsSlinky.onesignalCordovaPlugin.onesignalCordovaPluginStrings.Opened
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OSNotificationAction extends StObject {
  
  var actionID: String = js.native
  
  var `type`: Opened | ActionTaken = js.native
}
object OSNotificationAction {
  
  @scala.inline
  def apply(actionID: String, `type`: Opened | ActionTaken): OSNotificationAction = {
    val __obj = js.Dynamic.literal(actionID = actionID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OSNotificationAction]
  }
  
  @scala.inline
  implicit class OSNotificationActionMutableBuilder[Self <: OSNotificationAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionID(value: String): Self = StObject.set(x, "actionID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Opened | ActionTaken): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
