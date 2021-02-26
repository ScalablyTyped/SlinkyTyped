package typingsSlinky.reactColor

import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.StatelessComponent
import typingsSlinky.reactColor.alphaMod.default
import typingsSlinky.reactColor.anon.PartialClassesany
import typingsSlinky.reactColor.colorWrapMod.ExportedColorProps
import typingsSlinky.reactColor.colorWrapMod.InjectedColorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-color", "AlphaPicker")
  @js.native
  class AlphaPicker () extends default
  
  @JSImport("react-color", "BlockPicker")
  @js.native
  class BlockPicker ()
    extends typingsSlinky.reactColor.blockMod.default
  
  @JSImport("react-color", "Checkboard")
  @js.native
  class Checkboard ()
    extends typingsSlinky.reactColor.checkboardMod.default
  
  @JSImport("react-color", "ChromePicker")
  @js.native
  class ChromePicker ()
    extends typingsSlinky.reactColor.chromeMod.default
  
  @JSImport("react-color", "CirclePicker")
  @js.native
  class CirclePicker ()
    extends typingsSlinky.reactColor.circleMod.default
  
  @JSImport("react-color", "CompactPicker")
  @js.native
  class CompactPicker ()
    extends typingsSlinky.reactColor.compactMod.default
  
  @JSImport("react-color", "CustomPicker")
  @js.native
  def CustomPicker[A](component: ComponentClass[A with InjectedColorProps, js.Object]): ReactComponentClass[A with ExportedColorProps] = js.native
  @JSImport("react-color", "CustomPicker")
  @js.native
  def CustomPicker[A](component: StatelessComponent[A with InjectedColorProps]): ReactComponentClass[A with ExportedColorProps] = js.native
  
  @JSImport("react-color", "GithubPicker")
  @js.native
  class GithubPicker ()
    extends typingsSlinky.reactColor.githubMod.default
  
  @JSImport("react-color", "HuePicker")
  @js.native
  class HuePicker ()
    extends typingsSlinky.reactColor.hueHueMod.default
  
  @JSImport("react-color", "MaterialPicker")
  @js.native
  class MaterialPicker ()
    extends typingsSlinky.reactColor.materialMod.default
  
  @JSImport("react-color", "PhotoshopPicker")
  @js.native
  class PhotoshopPicker ()
    extends typingsSlinky.reactColor.photoshopMod.default
  
  @JSImport("react-color", "SketchPicker")
  @js.native
  class SketchPicker ()
    extends typingsSlinky.reactColor.sketchMod.default
  
  @JSImport("react-color", "SliderPicker")
  @js.native
  class SliderPicker ()
    extends typingsSlinky.reactColor.sliderMod.default
  
  @JSImport("react-color", "SwatchesPicker")
  @js.native
  class SwatchesPicker ()
    extends typingsSlinky.reactColor.swatchesMod.default
  
  @JSImport("react-color", "TwitterPicker")
  @js.native
  class TwitterPicker ()
    extends typingsSlinky.reactColor.twitterMod.default
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.reactColor.mod.HSLColor
    - typingsSlinky.reactColor.mod.RGBColor
  */
  type Color = _Color | String
  
  type ColorChangeHandler = js.Function2[/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement], Unit]
  
  @js.native
  trait ColorPickerProps[A] extends ClassAttributes[A] {
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[Color] = js.native
    
    var onChange: js.UndefOr[ColorChangeHandler] = js.native
    
    var onChangeComplete: js.UndefOr[ColorChangeHandler] = js.native
    
    var styles: js.UndefOr[PartialClassesany] = js.native
  }
  object ColorPickerProps {
    
    @scala.inline
    def apply[A](): ColorPickerProps[A] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPickerProps[A]]
    }
    
    @scala.inline
    implicit class ColorPickerPropsMutableBuilder[Self <: ColorPickerProps[_], A] (val x: Self with ColorPickerProps[A]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeComplete(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = StObject.set(x, "onChangeComplete", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeCompleteUndefined: Self = StObject.set(x, "onChangeComplete", js.undefined)
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setStyles(value: PartialClassesany): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait ColorResult extends StObject {
    
    var hex: String = js.native
    
    var hsl: HSLColor = js.native
    
    var rgb: RGBColor = js.native
  }
  object ColorResult {
    
    @scala.inline
    def apply(hex: String, hsl: HSLColor, rgb: RGBColor): ColorResult = {
      val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], hsl = hsl.asInstanceOf[js.Any], rgb = rgb.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorResult]
    }
    
    @scala.inline
    implicit class ColorResultMutableBuilder[Self <: ColorResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHsl(value: HSLColor): Self = StObject.set(x, "hsl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRgb(value: RGBColor): Self = StObject.set(x, "rgb", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CustomPickerProps[A] extends ClassAttributes[A] {
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[Color] = js.native
    
    var onChange: ColorChangeHandler = js.native
    
    var pointer: js.UndefOr[ReactElement] = js.native
    
    var styles: js.UndefOr[PartialClassesany] = js.native
  }
  object CustomPickerProps {
    
    @scala.inline
    def apply[A](onChange: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): CustomPickerProps[A] = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange))
      __obj.asInstanceOf[CustomPickerProps[A]]
    }
    
    @scala.inline
    implicit class CustomPickerPropsMutableBuilder[Self <: CustomPickerProps[_], A] (val x: Self with CustomPickerProps[A]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointer(value: ReactElement): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerReactElement(value: ReactElement): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointerUndefined: Self = StObject.set(x, "pointer", js.undefined)
      
      @scala.inline
      def setStyles(value: PartialClassesany): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait HSLColor extends _Color {
    
    var a: js.UndefOr[Double] = js.native
    
    var h: Double = js.native
    
    var l: Double = js.native
    
    var s: Double = js.native
  }
  object HSLColor {
    
    @scala.inline
    def apply(h: Double, l: Double, s: Double): HSLColor = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSLColor]
    }
    
    @scala.inline
    implicit class HSLColorMutableBuilder[Self <: HSLColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RGBColor extends _Color {
    
    var a: js.UndefOr[Double] = js.native
    
    var b: Double = js.native
    
    var g: Double = js.native
    
    var r: Double = js.native
  }
  object RGBColor {
    
    @scala.inline
    def apply(b: Double, g: Double, r: Double): RGBColor = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBColor]
    }
    
    @scala.inline
    implicit class RGBColorMutableBuilder[Self <: RGBColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Color extends StObject
  object _Color {
    
    @scala.inline
    def HSLColor(h: Double, l: Double, s: Double): typingsSlinky.reactColor.mod.HSLColor = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactColor.mod.HSLColor]
    }
    
    @scala.inline
    def RGBColor(b: Double, g: Double, r: Double): typingsSlinky.reactColor.mod.RGBColor = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactColor.mod.RGBColor]
    }
  }
}
