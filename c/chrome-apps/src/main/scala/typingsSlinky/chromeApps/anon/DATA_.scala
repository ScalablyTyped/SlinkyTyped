package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.data_
import typingsSlinky.chromeApps.chromeAppsStrings.explicitFeedback
import typingsSlinky.chromeApps.chromeAppsStrings.feedback_
import typingsSlinky.chromeApps.chromeAppsStrings.notification_
import typingsSlinky.chromeApps.chromeAppsStrings.periodic_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DATA_ extends StObject {
  
  var DATA: data_ = js.native
  
  var EXPLICIT_FEEDBACK: explicitFeedback = js.native
  
  var FEEDBACK: feedback_ = js.native
  
  var NOTIFICATION: notification_ = js.native
  
  var PERIODIC: periodic_ = js.native
}
object DATA_ {
  
  @scala.inline
  def apply(
    DATA: data_,
    EXPLICIT_FEEDBACK: explicitFeedback,
    FEEDBACK: feedback_,
    NOTIFICATION: notification_,
    PERIODIC: periodic_
  ): DATA_ = {
    val __obj = js.Dynamic.literal(DATA = DATA.asInstanceOf[js.Any], EXPLICIT_FEEDBACK = EXPLICIT_FEEDBACK.asInstanceOf[js.Any], FEEDBACK = FEEDBACK.asInstanceOf[js.Any], NOTIFICATION = NOTIFICATION.asInstanceOf[js.Any], PERIODIC = PERIODIC.asInstanceOf[js.Any])
    __obj.asInstanceOf[DATA_]
  }
  
  @scala.inline
  implicit class DATA_MutableBuilder[Self <: DATA_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDATA(value: data_): Self = StObject.set(x, "DATA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXPLICIT_FEEDBACK(value: explicitFeedback): Self = StObject.set(x, "EXPLICIT_FEEDBACK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFEEDBACK(value: feedback_): Self = StObject.set(x, "FEEDBACK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNOTIFICATION(value: notification_): Self = StObject.set(x, "NOTIFICATION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPERIODIC(value: periodic_): Self = StObject.set(x, "PERIODIC", value.asInstanceOf[js.Any])
  }
}
