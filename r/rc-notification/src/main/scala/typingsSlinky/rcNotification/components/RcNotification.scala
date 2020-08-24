package typingsSlinky.rcNotification.components

import typingsSlinky.rcNotification.mod.default
import typingsSlinky.rcNotification.notificationMod.NotificationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcNotification {
  @JSImport("rc-notification", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: NotificationProps): SharedBuilder_NotificationProps131694593[default] = new SharedBuilder_NotificationProps131694593[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RcNotification.type): SharedBuilder_NotificationProps131694593[default] = new SharedBuilder_NotificationProps131694593[default](js.Array(this.component, js.Dictionary.empty))()
}

