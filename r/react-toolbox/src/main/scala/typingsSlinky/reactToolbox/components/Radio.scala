package typingsSlinky.reactToolbox.components

import typingsSlinky.reactToolbox.radioButtonMod.RadioButtonProps
import typingsSlinky.reactToolbox.radioMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Radio {
  @JSImport("react-toolbox/components/radio", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: RadioButtonProps): SharedBuilder_RadioButtonProps_1779806798[default] = new SharedBuilder_RadioButtonProps_1779806798[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Radio.type): SharedBuilder_RadioButtonProps_1779806798[default] = new SharedBuilder_RadioButtonProps_1779806798[default](js.Array(this.component, js.Dictionary.empty))()
}

