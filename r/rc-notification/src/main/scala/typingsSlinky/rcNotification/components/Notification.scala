package typingsSlinky.rcNotification.components

import typingsSlinky.rcNotification.notificationMod.NotificationProps
import typingsSlinky.rcNotification.notificationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Notification {
  @JSImport("rc-notification/es/Notification", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: NotificationProps): SharedBuilder_NotificationProps131694593[default] = new SharedBuilder_NotificationProps131694593[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Notification.type): SharedBuilder_NotificationProps131694593[default] = new SharedBuilder_NotificationProps131694593[default](js.Array(this.component, js.Dictionary.empty))()
}

