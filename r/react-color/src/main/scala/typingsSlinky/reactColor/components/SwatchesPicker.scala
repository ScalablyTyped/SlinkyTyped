package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.swatchesMod.SwatchesPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwatchesPicker {
  
  @JSImport("react-color", "SwatchesPicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: SwatchesPickerProps): SharedBuilder_SwatchesPickerProps_1631029907[typingsSlinky.reactColor.mod.SwatchesPicker] = new SharedBuilder_SwatchesPickerProps_1631029907[typingsSlinky.reactColor.mod.SwatchesPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SwatchesPicker.type): SharedBuilder_SwatchesPickerProps_1631029907[typingsSlinky.reactColor.mod.SwatchesPicker] = new SharedBuilder_SwatchesPickerProps_1631029907[typingsSlinky.reactColor.mod.SwatchesPicker](js.Array(this.component, js.Dictionary.empty))()
}
