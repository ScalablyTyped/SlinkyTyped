package typingsSlinky.antd.components

import typingsSlinky.antd.radioButtonMod.RadioButtonProps
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButton {
  
  @JSImport("antd/lib/radio/radioButton", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: RadioButtonProps with RefAttributes[js.Any]): SharedBuilder_RadioButtonPropsRefAttributes209272430[js.Any with js.Object] = new SharedBuilder_RadioButtonPropsRefAttributes209272430[js.Any with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RadioButton.type): SharedBuilder_RadioButtonPropsRefAttributes209272430[js.Any with js.Object] = new SharedBuilder_RadioButtonPropsRefAttributes209272430[js.Any with js.Object](js.Array(this.component, js.Dictionary.empty))()
}
