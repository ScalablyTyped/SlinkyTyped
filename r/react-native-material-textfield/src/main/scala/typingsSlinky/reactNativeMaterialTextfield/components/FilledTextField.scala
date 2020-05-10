package typingsSlinky.reactNativeMaterialTextfield.components

import typingsSlinky.reactNativeMaterialTextfield.mod.TextFieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FilledTextField {
  @JSImport("react-native-material-textfield", "FilledTextField")
  @js.native
  object component extends js.Object
  
  def withProps(p: TextFieldProps): SharedBuilder_TextFieldProps_1541991017[typingsSlinky.reactNativeMaterialTextfield.mod.FilledTextField] = new SharedBuilder_TextFieldProps_1541991017[typingsSlinky.reactNativeMaterialTextfield.mod.FilledTextField](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FilledTextField.type): SharedBuilder_TextFieldProps_1541991017[typingsSlinky.reactNativeMaterialTextfield.mod.FilledTextField] = new SharedBuilder_TextFieldProps_1541991017[typingsSlinky.reactNativeMaterialTextfield.mod.FilledTextField](js.Array(this.component, js.Dictionary.empty))()
}

