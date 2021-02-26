package typingsSlinky.reactBootstrapTypeahead

import typingsSlinky.csstype.mod.BoxSizingProperty
import typingsSlinky.csstype.mod.WidthProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CustomOption extends StObject {
    
    var customOption: Boolean = js.native
  }
  object CustomOption {
    
    @scala.inline
    def apply(customOption: Boolean): CustomOption = {
      val __obj = js.Dynamic.literal(customOption = customOption.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomOption]
    }
    
    @scala.inline
    implicit class CustomOptionMutableBuilder[Self <: CustomOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomOption(value: Boolean): Self = StObject.set(x, "customOption", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<react.react.CSSProperties, 'boxSizing' | 'width'> */
  @js.native
  trait PickCSSPropertiesboxSizin extends StObject {
    
    var boxSizing: js.UndefOr[BoxSizingProperty] = js.native
    
    var width: js.UndefOr[WidthProperty[String | Double]] = js.native
  }
  object PickCSSPropertiesboxSizin {
    
    @scala.inline
    def apply(): PickCSSPropertiesboxSizin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickCSSPropertiesboxSizin]
    }
    
    @scala.inline
    implicit class PickCSSPropertiesboxSizinMutableBuilder[Self <: PickCSSPropertiesboxSizin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoxSizing(value: BoxSizingProperty): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxSizingUndefined: Self = StObject.set(x, "boxSizing", js.undefined)
      
      @scala.inline
      def setWidth(value: WidthProperty[String | Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
