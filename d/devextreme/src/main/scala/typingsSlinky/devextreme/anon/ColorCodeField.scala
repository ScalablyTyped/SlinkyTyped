package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.Bright
import typingsSlinky.devextreme.devextremeStrings.Carmine
import typingsSlinky.devextreme.devextremeStrings.Material
import typingsSlinky.devextreme.devextremeStrings.Ocean
import typingsSlinky.devextreme.devextremeStrings.Office
import typingsSlinky.devextreme.devextremeStrings.Pastel
import typingsSlinky.devextreme.devextremeStrings.Soft
import typingsSlinky.devextreme.devextremeStrings.Vintage
import typingsSlinky.devextreme.devextremeStrings.Violet
import typingsSlinky.devextreme.devextremeStrings.`Dark Moon`
import typingsSlinky.devextreme.devextremeStrings.`Dark Violet`
import typingsSlinky.devextreme.devextremeStrings.`Green Mist`
import typingsSlinky.devextreme.devextremeStrings.`Harmony Light`
import typingsSlinky.devextreme.devextremeStrings.`Soft Blue`
import typingsSlinky.devextreme.devextremeStrings.`Soft Pastel`
import typingsSlinky.devextreme.devextremeStrings.alternate
import typingsSlinky.devextreme.devextremeStrings.blend
import typingsSlinky.devextreme.devextremeStrings.discrete
import typingsSlinky.devextreme.devextremeStrings.extrapolate
import typingsSlinky.devextreme.devextremeStrings.gradient
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorCodeField extends StObject {
  
  var colorCodeField: js.UndefOr[String] = js.native
  
  var colorizeGroups: js.UndefOr[Boolean] = js.native
  
  var palette: js.UndefOr[
    js.Array[String] | Bright | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.native
  
  var range: js.UndefOr[js.Array[Double]] = js.native
  
  var `type`: js.UndefOr[discrete | gradient | none | range] = js.native
}
object ColorCodeField {
  
  @scala.inline
  def apply(): ColorCodeField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorCodeField]
  }
  
  @scala.inline
  implicit class ColorCodeFieldMutableBuilder[Self <: ColorCodeField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorCodeField(value: String): Self = StObject.set(x, "colorCodeField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorCodeFieldUndefined: Self = StObject.set(x, "colorCodeField", js.undefined)
    
    @scala.inline
    def setColorizeGroups(value: Boolean): Self = StObject.set(x, "colorizeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorizeGroupsUndefined: Self = StObject.set(x, "colorizeGroups", js.undefined)
    
    @scala.inline
    def setPalette(
      value: js.Array[String] | Bright | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
    ): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteExtensionMode(value: alternate | blend | extrapolate): Self = StObject.set(x, "paletteExtensionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteExtensionModeUndefined: Self = StObject.set(x, "paletteExtensionMode", js.undefined)
    
    @scala.inline
    def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    @scala.inline
    def setPaletteVarargs(value: String*): Self = StObject.set(x, "palette", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value :_*))
    
    @scala.inline
    def setType(value: discrete | gradient | none | range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
