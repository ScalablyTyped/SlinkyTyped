package typingsSlinky.reactColor

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.reactColor.anon.PartialClassesCompactPick
import typingsSlinky.reactColor.mod.ColorPickerProps
import typingsSlinky.reactColor.mod.ColorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compactMod {
  
  @JSImport("react-color/lib/components/compact/Compact", JSImport.Default)
  @js.native
  class default ()
    extends Component[CompactPickerProps, js.Object, js.Any]
  
  @js.native
  trait CompactPicker
    extends Component[CompactPickerProps, js.Object, js.Any]
  
  @js.native
  trait CompactPickerProps extends ColorPickerProps[CompactPicker] {
    
    var colors: js.UndefOr[js.Array[String]] = js.native
    
    var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.native
    
    @JSName("styles")
    var styles_CompactPickerProps: js.UndefOr[PartialClassesCompactPick] = js.native
  }
  object CompactPickerProps {
    
    @scala.inline
    def apply(): CompactPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompactPickerProps]
    }
    
    @scala.inline
    implicit class CompactPickerPropsMutableBuilder[Self <: CompactPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Unit): Self = StObject.set(x, "onSwatchHover", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSwatchHoverUndefined: Self = StObject.set(x, "onSwatchHover", js.undefined)
      
      @scala.inline
      def setStyles(value: PartialClassesCompactPick): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait CompactPickerStylesProps extends StObject {
    
    var Compact: CSSProperties = js.native
    
    var clear: CSSProperties = js.native
    
    var compact: CSSProperties = js.native
  }
  object CompactPickerStylesProps {
    
    @scala.inline
    def apply(Compact: CSSProperties, clear: CSSProperties, compact: CSSProperties): CompactPickerStylesProps = {
      val __obj = js.Dynamic.literal(Compact = Compact.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], compact = compact.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompactPickerStylesProps]
    }
    
    @scala.inline
    implicit class CompactPickerStylesPropsMutableBuilder[Self <: CompactPickerStylesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: CSSProperties): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompact(value: CSSProperties): Self = StObject.set(x, "Compact", value.asInstanceOf[js.Any])
    }
  }
}
