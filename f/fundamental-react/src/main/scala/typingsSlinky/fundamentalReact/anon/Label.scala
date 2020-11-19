package typingsSlinky.fundamentalReact.anon

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends js.Object {
  
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
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNotificationCount(value: Double): Self = this.set("notificationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallback(value: /* event */ SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setNoNotificationsBodyReactElement(value: ReactElement): Self = this.set("noNotificationsBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoNotificationsBody(value: ReactElement): Self = this.set("noNotificationsBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoNotificationsBody: Self = this.set("noNotificationsBody", js.undefined)
    
    @scala.inline
    def setNotificationsBodyReactElement(value: ReactElement): Self = this.set("notificationsBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsBody(value: ReactElement): Self = this.set("notificationsBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationsBody: Self = this.set("notificationsBody", js.undefined)
  }
}
