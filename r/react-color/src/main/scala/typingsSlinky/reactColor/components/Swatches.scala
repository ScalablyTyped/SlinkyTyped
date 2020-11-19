package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.swatchesMod.SwatchesPickerProps
import typingsSlinky.reactColor.swatchesMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Swatches {
  
  @JSImport("react-color/lib/components/swatches/Swatches", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SwatchesPickerProps): SharedBuilder_SwatchesPickerProps_1631029907[default] = new SharedBuilder_SwatchesPickerProps_1631029907[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Swatches.type): SharedBuilder_SwatchesPickerProps_1631029907[default] = new SharedBuilder_SwatchesPickerProps_1631029907[default](js.Array(this.component, js.Dictionary.empty))()
}
