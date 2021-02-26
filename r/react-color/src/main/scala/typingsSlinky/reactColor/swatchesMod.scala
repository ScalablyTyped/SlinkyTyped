package typingsSlinky.reactColor

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.reactColor.anon.PartialClassesSwatchesPic
import typingsSlinky.reactColor.mod.ColorPickerProps
import typingsSlinky.reactColor.mod.ColorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swatchesMod {
  
  @JSImport("react-color/lib/components/swatches/Swatches", JSImport.Default)
  @js.native
  class default ()
    extends Component[SwatchesPickerProps, js.Object, js.Any]
  
  @js.native
  trait SwatchesPicker
    extends Component[SwatchesPickerProps, js.Object, js.Any]
  
  @js.native
  trait SwatchesPickerProps extends ColorPickerProps[SwatchesPicker] {
    
    var colors: js.UndefOr[js.Array[js.Array[String]]] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.native
    
    @JSName("styles")
    var styles_SwatchesPickerProps: js.UndefOr[PartialClassesSwatchesPic] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object SwatchesPickerProps {
    
    @scala.inline
    def apply(): SwatchesPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwatchesPickerProps]
    }
    
    @scala.inline
    implicit class SwatchesPickerPropsMutableBuilder[Self <: SwatchesPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: js.Array[js.Array[String]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setColorsVarargs(value: js.Array[String]*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Unit): Self = StObject.set(x, "onSwatchHover", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSwatchHoverUndefined: Self = StObject.set(x, "onSwatchHover", js.undefined)
      
      @scala.inline
      def setStyles(value: PartialClassesSwatchesPic): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SwatchesPickerStylesProps extends StObject {
    
    var body: CSSProperties = js.native
    
    var clear: CSSProperties = js.native
    
    var overflow: CSSProperties = js.native
    
    var picker: CSSProperties = js.native
  }
  object SwatchesPickerStylesProps {
    
    @scala.inline
    def apply(body: CSSProperties, clear: CSSProperties, overflow: CSSProperties, picker: CSSProperties): SwatchesPickerStylesProps = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwatchesPickerStylesProps]
    }
    
    @scala.inline
    implicit class SwatchesPickerStylesPropsMutableBuilder[Self <: SwatchesPickerStylesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: CSSProperties): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClear(value: CSSProperties): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflow(value: CSSProperties): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    }
  }
}
