package typingsSlinky.reactToolbox.components

import typingsSlinky.reactToolbox.radioRadioButtonMod.RadioButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioButton {
  @JSImport("react-toolbox", "RadioButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: RadioButtonProps): SharedBuilder_RadioButtonProps1715597622[typingsSlinky.reactToolbox.mod.RadioButton] = new SharedBuilder_RadioButtonProps1715597622[typingsSlinky.reactToolbox.mod.RadioButton](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RadioButton.type): SharedBuilder_RadioButtonProps1715597622[typingsSlinky.reactToolbox.mod.RadioButton] = new SharedBuilder_RadioButtonProps1715597622[typingsSlinky.reactToolbox.mod.RadioButton](js.Array(this.component, js.Dictionary.empty))()
}

