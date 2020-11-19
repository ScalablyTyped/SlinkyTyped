package typingsSlinky.reactToolbox.components

import typingsSlinky.reactToolbox.radioButtonMod.RadioButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButton {
  
  @JSImport("react-toolbox/components/radio", "RadioButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: RadioButtonProps): SharedBuilder_RadioButtonProps_1779806798[typingsSlinky.reactToolbox.radioMod.RadioButton] = new SharedBuilder_RadioButtonProps_1779806798[typingsSlinky.reactToolbox.radioMod.RadioButton](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RadioButton.type): SharedBuilder_RadioButtonProps_1779806798[typingsSlinky.reactToolbox.radioMod.RadioButton] = new SharedBuilder_RadioButtonProps_1779806798[typingsSlinky.reactToolbox.radioMod.RadioButton](js.Array(this.component, js.Dictionary.empty))()
}
