package typingsSlinky.reactNativeMaterialTextfield.components

import typingsSlinky.reactNativeMaterialTextfield.mod.TextFieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OutlinedTextField {
  @JSImport("react-native-material-textfield", "OutlinedTextField")
  @js.native
  object component extends js.Object
  
  def withProps(p: TextFieldProps): SharedBuilder_TextFieldProps_1541991017[typingsSlinky.reactNativeMaterialTextfield.mod.OutlinedTextField] = new SharedBuilder_TextFieldProps_1541991017[typingsSlinky.reactNativeMaterialTextfield.mod.OutlinedTextField](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: OutlinedTextField.type): SharedBuilder_TextFieldProps_1541991017[typingsSlinky.reactNativeMaterialTextfield.mod.OutlinedTextField] = new SharedBuilder_TextFieldProps_1541991017[typingsSlinky.reactNativeMaterialTextfield.mod.OutlinedTextField](js.Array(this.component, js.Dictionary.empty))()
}

