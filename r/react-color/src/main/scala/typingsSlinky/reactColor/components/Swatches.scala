package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.swatchesMod.SwatchesPickerProps
import typingsSlinky.reactColor.swatchesMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Swatches {
  
  @JSImport("react-color/lib/components/swatches/Swatches", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Swatches.type): SharedBuilder_SwatchesPickerProps_1631029907[default] = new SharedBuilder_SwatchesPickerProps_1631029907[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwatchesPickerProps): SharedBuilder_SwatchesPickerProps_1631029907[default] = new SharedBuilder_SwatchesPickerProps_1631029907[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
