package typingsSlinky.baseui.components

import typingsSlinky.baseui.toastMod.ToastProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Notification {
  
  @JSImport("baseui/notification", "Notification")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Notification.type): SharedBuilder_ToastProps_508882891[typingsSlinky.baseui.notificationMod.Notification] = new SharedBuilder_ToastProps_508882891[typingsSlinky.baseui.notificationMod.Notification](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ToastProps): SharedBuilder_ToastProps_508882891[typingsSlinky.baseui.notificationMod.Notification] = new SharedBuilder_ToastProps_508882891[typingsSlinky.baseui.notificationMod.Notification](js.Array(this.component, p.asInstanceOf[js.Any]))
}
