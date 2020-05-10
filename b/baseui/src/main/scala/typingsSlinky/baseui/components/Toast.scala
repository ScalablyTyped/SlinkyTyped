package typingsSlinky.baseui.components

import typingsSlinky.baseui.toastMod.ToastProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Toast {
  @JSImport("baseui/toast", "Toast")
  @js.native
  object component extends js.Object
  
  def withProps(p: ToastProps): SharedBuilder_ToastProps_508882891[typingsSlinky.baseui.toastMod.Toast] = new SharedBuilder_ToastProps_508882891[typingsSlinky.baseui.toastMod.Toast](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Toast.type): SharedBuilder_ToastProps_508882891[typingsSlinky.baseui.toastMod.Toast] = new SharedBuilder_ToastProps_508882891[typingsSlinky.baseui.toastMod.Toast](js.Array(this.component, js.Dictionary.empty))()
}

