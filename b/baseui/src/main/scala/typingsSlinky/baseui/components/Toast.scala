package typingsSlinky.baseui.components

import typingsSlinky.baseui.toastMod.ToastProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toast {
  
  @JSImport("baseui/toast", "Toast")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Toast.type): SharedBuilder_ToastProps_508882891[typingsSlinky.baseui.toastMod.Toast] = new SharedBuilder_ToastProps_508882891[typingsSlinky.baseui.toastMod.Toast](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ToastProps): SharedBuilder_ToastProps_508882891[typingsSlinky.baseui.toastMod.Toast] = new SharedBuilder_ToastProps_508882891[typingsSlinky.baseui.toastMod.Toast](js.Array(this.component, p.asInstanceOf[js.Any]))
}
