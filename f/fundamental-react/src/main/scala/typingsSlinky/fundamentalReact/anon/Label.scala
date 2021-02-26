package typingsSlinky.fundamentalReact.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends StObject {
  
  var callback: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[HTMLButtonElement], Unit]] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var noNotificationsBody: js.UndefOr[ReactElement] = js.native
  
  var notificationCount: Double = js.native
  
  var notificationsBody: js.UndefOr[ReactElement] = js.native
}
object Label {
  
  @scala.inline
  def apply(notificationCount: Double): Label = {
    val __obj = js.Dynamic.literal(notificationCount = notificationCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: /* event */ SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setNoNotificationsBody(value: ReactElement): Self = StObject.set(x, "noNotificationsBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoNotificationsBodyReactElement(value: ReactElement): Self = StObject.set(x, "noNotificationsBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoNotificationsBodyUndefined: Self = StObject.set(x, "noNotificationsBody", js.undefined)
    
    @scala.inline
    def setNotificationCount(value: Double): Self = StObject.set(x, "notificationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsBody(value: ReactElement): Self = StObject.set(x, "notificationsBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsBodyReactElement(value: ReactElement): Self = StObject.set(x, "notificationsBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsBodyUndefined: Self = StObject.set(x, "notificationsBody", js.undefined)
  }
}
