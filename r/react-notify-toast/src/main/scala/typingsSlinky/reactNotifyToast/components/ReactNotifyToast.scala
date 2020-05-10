package typingsSlinky.reactNotifyToast.components

import typingsSlinky.reactNotifyToast.mod.NotificationProps
import typingsSlinky.reactNotifyToast.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNotifyToast {
  @JSImport("react-notify-toast", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: NotificationProps): SharedBuilder_NotificationProps_333634289[default] = new SharedBuilder_NotificationProps_333634289[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNotifyToast.type): SharedBuilder_NotificationProps_333634289[default] = new SharedBuilder_NotificationProps_333634289[default](js.Array(this.component, js.Dictionary.empty))()
}

