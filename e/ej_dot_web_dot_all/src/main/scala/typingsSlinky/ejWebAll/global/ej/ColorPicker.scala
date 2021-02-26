package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.ColorPicker")
@js.native
class ColorPicker protected ()
  extends typingsSlinky.ejWebAll.ej.ColorPicker {
  def this(element: Element) = this()
  def this(element: JQuery) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Model) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Model) = this()
}
object ColorPicker {
  
  @JSGlobal("ej.ColorPicker")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.ColorPicker.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.ColorPicker.ModelType")
  @js.native
  object ModelType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ColorPicker.ModelType with Double] = js.native
    
    /* 0 */ val Palette: typingsSlinky.ejWebAll.ej.ColorPicker.ModelType.Palette with Double = js.native
    
    /* 1 */ val Picker: typingsSlinky.ejWebAll.ej.ColorPicker.ModelType.Picker with Double = js.native
  }
  
  @JSGlobal("ej.ColorPicker.Palette")
  @js.native
  object Palette extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.ColorPicker.Palette with Double] = js.native
    
    /* 0 */ val BasicPalette: typingsSlinky.ejWebAll.ej.ColorPicker.Palette.BasicPalette with Double = js.native
    
    /* 1 */ val CustomPalette: typingsSlinky.ejWebAll.ej.ColorPicker.Palette.CustomPalette with Double = js.native
  }
  
  @JSGlobal("ej.ColorPicker.Presets")
  @js.native
  object Presets extends StObject {
    
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
  
  /* static member */
  @JSGlobal("ej.ColorPicker.fn")
  @js.native
  def fn: typingsSlinky.ejWebAll.ej.ColorPicker = js.native
  @scala.inline
  def fn_=(x: typingsSlinky.ejWebAll.ej.ColorPicker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
