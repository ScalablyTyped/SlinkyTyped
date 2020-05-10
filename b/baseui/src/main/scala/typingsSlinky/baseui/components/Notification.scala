package typingsSlinky.baseui.components

import typingsSlinky.baseui.toastMod.ToastProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Notification {
  @JSImport("baseui/notification", "Notification")
  @js.native
  object component extends js.Object
  
  def withProps(p: ToastProps): SharedBuilder_ToastProps_508882891[typingsSlinky.baseui.notificationMod.Notification] = new SharedBuilder_ToastProps_508882891[typingsSlinky.baseui.notificationMod.Notification](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Notification.type): SharedBuilder_ToastProps_508882891[typingsSlinky.baseui.notificationMod.Notification] = new SharedBuilder_ToastProps_508882891[typingsSlinky.baseui.notificationMod.Notification](js.Array(this.component, js.Dictionary.empty))()
}

