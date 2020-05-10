package typingsSlinky.reactNotificationSystemRedux.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNotificationSystem.mod.Notification
import typingsSlinky.reactNotificationSystem.mod.Style
import typingsSlinky.reactNotificationSystemRedux.mod.NotificationsProps
import typingsSlinky.reactNotificationSystemRedux.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNotificationSystemRedux {
  @JSImport("react-notification-system-redux", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def allowHTML(value: Boolean): this.type = set("allowHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def noAnimation(value: Boolean): this.type = set("noAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def notifications(value: js.Array[Notification]): this.type = set("notifications", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: Style | Boolean): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NotificationsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNotificationSystemRedux.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

