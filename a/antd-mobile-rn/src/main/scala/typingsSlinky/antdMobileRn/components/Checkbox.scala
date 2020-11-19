package typingsSlinky.antdMobileRn.components

import typingsSlinky.antdMobileRn.checkboxNativeMod.ICheckboxNativeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Checkbox {
  
  @JSImport("antd-mobile-rn", "Checkbox")
  @js.native
  object component extends js.Object
  
  def withProps(p: ICheckboxNativeProps): SharedBuilder_ICheckboxNativeProps323411610[typingsSlinky.antdMobileRn.mod.Checkbox] = new SharedBuilder_ICheckboxNativeProps323411610[typingsSlinky.antdMobileRn.mod.Checkbox](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Checkbox.type): SharedBuilder_ICheckboxNativeProps323411610[typingsSlinky.antdMobileRn.mod.Checkbox] = new SharedBuilder_ICheckboxNativeProps323411610[typingsSlinky.antdMobileRn.mod.Checkbox](js.Array(this.component, js.Dictionary.empty))()
}
