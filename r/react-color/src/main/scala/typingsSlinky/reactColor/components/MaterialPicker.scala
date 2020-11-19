package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.materialMod.MaterialPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MaterialPicker {
  
  @JSImport("react-color", "MaterialPicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: MaterialPickerProps): SharedBuilder_MaterialPickerProps_1955371684[typingsSlinky.reactColor.mod.MaterialPicker] = new SharedBuilder_MaterialPickerProps_1955371684[typingsSlinky.reactColor.mod.MaterialPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: MaterialPicker.type): SharedBuilder_MaterialPickerProps_1955371684[typingsSlinky.reactColor.mod.MaterialPicker] = new SharedBuilder_MaterialPickerProps_1955371684[typingsSlinky.reactColor.mod.MaterialPicker](js.Array(this.component, js.Dictionary.empty))()
}
