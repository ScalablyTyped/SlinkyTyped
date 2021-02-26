package typingsSlinky.reactColor

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.reactColor.anon.Color
import typingsSlinky.reactColor.anon.PartialClassesSketchPicke
import typingsSlinky.reactColor.mod.ColorPickerProps
import typingsSlinky.reactColor.mod.ColorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sketchMod {
  
  @JSImport("react-color/lib/components/sketch/Sketch", JSImport.Default)
  @js.native
  class default ()
    extends Component[SketchPickerProps, js.Object, js.Any]
  
  type PresetColor = Color | String
  
  @js.native
  trait SketchPicker
    extends Component[SketchPickerProps, js.Object, js.Any]
  
  @js.native
  trait SketchPickerProps extends ColorPickerProps[SketchPicker] {
    
    var disableAlpha: js.UndefOr[Boolean] = js.native
    
    var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.native
    
    var presetColors: js.UndefOr[js.Array[PresetColor]] = js.native
    
    @JSName("styles")
    var styles_SketchPickerProps: js.UndefOr[PartialClassesSketchPicke] = js.native
    
    var width: js.UndefOr[String] = js.native
  }
  object SketchPickerProps {
    
    @scala.inline
    def apply(): SketchPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SketchPickerProps]
    }
    
    @scala.inline
    implicit class SketchPickerPropsMutableBuilder[Self <: SketchPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableAlpha(value: Boolean): Self = StObject.set(x, "disableAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableAlphaUndefined: Self = StObject.set(x, "disableAlpha", js.undefined)
      
      @scala.inline
      def setOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Unit): Self = StObject.set(x, "onSwatchHover", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSwatchHoverUndefined: Self = StObject.set(x, "onSwatchHover", js.undefined)
      
      @scala.inline
      def setPresetColors(value: js.Array[PresetColor]): Self = StObject.set(x, "presetColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetColorsUndefined: Self = StObject.set(x, "presetColors", js.undefined)
      
      @scala.inline
      def setPresetColorsVarargs(value: PresetColor*): Self = StObject.set(x, "presetColors", js.Array(value :_*))
      
      @scala.inline
      def setStyles(value: PartialClassesSketchPicke): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SketchPickerStylesProps extends StObject {
    
    var Alpha: CSSProperties = js.native
    
    var Hue: CSSProperties = js.native
    
    var Saturation: CSSProperties = js.native
    
    var activeColor: CSSProperties = js.native
    
    var alpha: CSSProperties = js.native
    
    var color: CSSProperties = js.native
    
    var controls: CSSProperties = js.native
    
    var hue: CSSProperties = js.native
    
    var picker: CSSProperties = js.native
    
    var saturation: CSSProperties = js.native
    
    var sliders: CSSProperties = js.native
  }
  object SketchPickerStylesProps {
    
    @scala.inline
    def apply(
      Alpha: CSSProperties,
      Hue: CSSProperties,
      Saturation: CSSProperties,
      activeColor: CSSProperties,
      alpha: CSSProperties,
      color: CSSProperties,
      controls: CSSProperties,
      hue: CSSProperties,
      picker: CSSProperties,
      saturation: CSSProperties,
      sliders: CSSProperties
    ): SketchPickerStylesProps = {
      val __obj = js.Dynamic.literal(Alpha = Alpha.asInstanceOf[js.Any], Hue = Hue.asInstanceOf[js.Any], Saturation = Saturation.asInstanceOf[js.Any], activeColor = activeColor.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], sliders = sliders.asInstanceOf[js.Any])
      __obj.asInstanceOf[SketchPickerStylesProps]
    }
    
    @scala.inline
    implicit class SketchPickerStylesPropsMutableBuilder[Self <: SketchPickerStylesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveColor(value: CSSProperties): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlpha(value: CSSProperties): Self = StObject.set(x, "Alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: CSSProperties): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControls(value: CSSProperties): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHue(value: CSSProperties): Self = StObject.set(x, "Hue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaturation(value: CSSProperties): Self = StObject.set(x, "Saturation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliders(value: CSSProperties): Self = StObject.set(x, "sliders", value.asInstanceOf[js.Any])
    }
  }
}
