package typingsSlinky.baseui.components

import typingsSlinky.baseui.phoneInputMod.PhoneInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PhoneInputNext {
  
  @JSImport("baseui/phone-input", "PhoneInputNext")
  @js.native
  object component extends js.Object
  
  def withProps(p: PhoneInputProps): SharedBuilder_PhoneInputProps953736929 = new SharedBuilder_PhoneInputProps953736929(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PhoneInputNext.type): SharedBuilder_PhoneInputProps953736929 = new SharedBuilder_PhoneInputProps953736929(js.Array(this.component, js.Dictionary.empty))()
}
