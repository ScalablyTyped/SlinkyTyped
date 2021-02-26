package typingsSlinky.reactColor

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.reactColor.anon.PartialClassesAlphaPicker
import typingsSlinky.reactColor.mod.ColorPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alphaMod {
  
  @JSImport("react-color/lib/components/alpha/Alpha", JSImport.Default)
  @js.native
  class default ()
    extends Component[AlphaPickerProps, js.Object, js.Any]
  
  @js.native
  trait AlphaPicker
    extends Component[AlphaPickerProps, js.Object, js.Any]
  
  @js.native
  trait AlphaPickerProps extends ColorPickerProps[AlphaPicker] {
    
    var height: js.UndefOr[String] = js.native
    
    @JSName("styles")
    var styles_AlphaPickerProps: js.UndefOr[PartialClassesAlphaPicker] = js.native
    
    var width: js.UndefOr[String] = js.native
  }
  object AlphaPickerProps {
    
    @scala.inline
    def apply(): AlphaPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlphaPickerProps]
    }
    
    @scala.inline
    implicit class AlphaPickerPropsMutableBuilder[Self <: AlphaPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setStyles(value: PartialClassesAlphaPicker): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait AlphaPickerStylesProps extends StObject {
    
    var alpha: CSSProperties = js.native
    
    var picker: CSSProperties = js.native
  }
  object AlphaPickerStylesProps {
    
    @scala.inline
    def apply(alpha: CSSProperties, picker: CSSProperties): AlphaPickerStylesProps = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], picker = picker.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlphaPickerStylesProps]
    }
    
    @scala.inline
    implicit class AlphaPickerStylesPropsMutableBuilder[Self <: AlphaPickerStylesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: CSSProperties): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPicker(value: CSSProperties): Self = StObject.set(x, "picker", value.asInstanceOf[js.Any])
    }
  }
}
