package typingsSlinky.reactColor

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.reactColor.anon.PartialClassesCirclePicke
import typingsSlinky.reactColor.mod.ColorPickerProps
import typingsSlinky.reactColor.mod.ColorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleMod {
  
  @JSImport("react-color/lib/components/circle/Circle", JSImport.Default)
  @js.native
  class default ()
    extends Component[CirclePickerProps, js.Object, js.Any]
  
  @js.native
  trait CirclePicker
    extends Component[CirclePickerProps, js.Object, js.Any]
  
  @js.native
  trait CirclePickerProps extends ColorPickerProps[CirclePicker] {
    
    var circleSize: js.UndefOr[Double] = js.native
    
    var circleSpacing: js.UndefOr[Double] = js.native
    
    var colors: js.UndefOr[js.Array[String]] = js.native
    
    var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.native
    
    @JSName("styles")
    var styles_CirclePickerProps: js.UndefOr[PartialClassesCirclePicke] = js.native
    
    var width: js.UndefOr[String] = js.native
  }
  object CirclePickerProps {
    
    @scala.inline
    def apply(): CirclePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CirclePickerProps]
    }
    
    @scala.inline
    implicit class CirclePickerPropsMutableBuilder[Self <: CirclePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircleSize(value: Double): Self = StObject.set(x, "circleSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleSizeUndefined: Self = StObject.set(x, "circleSize", js.undefined)
      
      @scala.inline
      def setCircleSpacing(value: Double): Self = StObject.set(x, "circleSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleSpacingUndefined: Self = StObject.set(x, "circleSpacing", js.undefined)
      
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
      def setStyles(value: PartialClassesCirclePicke): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait CirclePickerStylesProps extends StObject {
    
    var card: CSSProperties = js.native
  }
  object CirclePickerStylesProps {
    
    @scala.inline
    def apply(card: CSSProperties): CirclePickerStylesProps = {
      val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any])
      __obj.asInstanceOf[CirclePickerStylesProps]
    }
    
    @scala.inline
    implicit class CirclePickerStylesPropsMutableBuilder[Self <: CirclePickerStylesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCard(value: CSSProperties): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    }
  }
}
