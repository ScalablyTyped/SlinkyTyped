package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.ColorPicker")
@js.native
class ColorPicker protected ()
  extends typingsSlinky.ejWebAll.ej.ColorPicker {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.ColorPicker.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.ColorPicker.Model) = this()
}
/* static members */
@JSGlobal("ej.ColorPicker")
@js.native
object ColorPicker extends js.Object {
  
  var Locale: js.Any = js.native
  
  var fn: typingsSlinky.ejWebAll.ej.ColorPicker = js.native
  
  @js.native
  object ModelType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ColorPicker.ModelType with Double] = js.native
    
    /* 0 */ val Palette: typingsSlinky.ejWebAll.ej.ColorPicker.ModelType.Palette with Double = js.native
    
    /* 1 */ val Picker: typingsSlinky.ejWebAll.ej.ColorPicker.ModelType.Picker with Double = js.native
  }
  
  @js.native
  object Palette extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ColorPicker.Palette with Double] = js.native
    
    /* 0 */ val BasicPalette: typingsSlinky.ejWebAll.ej.ColorPicker.Palette.BasicPalette with Double = js.native
    
    /* 1 */ val CustomPalette: typingsSlinky.ejWebAll.ej.ColorPicker.Palette.CustomPalette with Double = js.native
  }
  
  @js.native
  object Presets extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ColorPicker.Presets with Double] = js.native
    
    /* 0 */ val Basic: typingsSlinky.ejWebAll.ej.ColorPicker.Presets.Basic with Double = js.native
    
    /* 1 */ val CandyCrush: typingsSlinky.ejWebAll.ej.ColorPicker.Presets.CandyCrush with Double = js.native
    
    /* 2 */ val Citrus: typingsSlinky.ejWebAll.ej.ColorPicker.Presets.Citrus with Double = js.native
    
    /* 3 */ val FlatColors: typingsSlinky.ejWebAll.ej.ColorPicker.Presets.FlatColors with Double = js.native
    
    /* 4 */ val Misty: typingsSlinky.ejWebAll.ej.ColorPicker.Presets.Misty with Double = js.native
    
    /* 5 */ val MoonLight: typingsSlinky.ejWebAll.ej.ColorPicker.Presets.MoonLight with Double = js.native
    
    /* 6 */ val PinkShades: typingsSlinky.ejWebAll.ej.ColorPicker.Presets.PinkShades with Double = js.native
    
    /* 7 */ val Sandy: typingsSlinky.ejWebAll.ej.ColorPicker.Presets.Sandy with Double = js.native
    
    /* 8 */ val SeaWolf: typingsSlinky.ejWebAll.ej.ColorPicker.Presets.SeaWolf with Double = js.native
    
    /* 9 */ val Vintage: typingsSlinky.ejWebAll.ej.ColorPicker.Presets.Vintage with Double = js.native
    
    /* 10 */ val WebColors: typingsSlinky.ejWebAll.ej.ColorPicker.Presets.WebColors with Double = js.native
  }
}
