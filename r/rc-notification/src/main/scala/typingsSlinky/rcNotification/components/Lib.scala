package typingsSlinky.rcNotification.components

import typingsSlinky.rcNotification.mod.default
import typingsSlinky.rcNotification.notificationMod.NotificationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Lib {
  @JSImport("rc-notification/lib", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: NotificationProps): SharedBuilder_NotificationProps131694593[default] = new SharedBuilder_NotificationProps131694593[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Lib.type): SharedBuilder_NotificationProps131694593[default] = new SharedBuilder_NotificationProps131694593[default](js.Array(this.component, js.Dictionary.empty))()
}

