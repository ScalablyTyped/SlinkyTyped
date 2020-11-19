package typingsSlinky.antdMobileRn.components

import typingsSlinky.antdMobileRn.checkboxNativeMod.ICheckboxNativeProps
import typingsSlinky.antdMobileRn.checkboxNativeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CheckboxDotnative {
  
  @JSImport("antd-mobile-rn/lib/checkbox/Checkbox.native", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ICheckboxNativeProps): SharedBuilder_ICheckboxNativeProps323411610[default] = new SharedBuilder_ICheckboxNativeProps323411610[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CheckboxDotnative.type): SharedBuilder_ICheckboxNativeProps323411610[default] = new SharedBuilder_ICheckboxNativeProps323411610[default](js.Array(this.component, js.Dictionary.empty))()
}
