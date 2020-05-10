package typingsSlinky.reactNotifyToast.components

import typingsSlinky.reactNotifyToast.mod.NotificationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Notification {
  @JSImport("react-notify-toast", "Notification")
  @js.native
  object component extends js.Object
  
  def withProps(p: NotificationProps): SharedBuilder_NotificationProps_333634289[typingsSlinky.reactNotifyToast.mod.Notification] = new SharedBuilder_NotificationProps_333634289[typingsSlinky.reactNotifyToast.mod.Notification](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Notification.type): SharedBuilder_NotificationProps_333634289[typingsSlinky.reactNotifyToast.mod.Notification] = new SharedBuilder_NotificationProps_333634289[typingsSlinky.reactNotifyToast.mod.Notification](js.Array(this.component, js.Dictionary.empty))()
}

