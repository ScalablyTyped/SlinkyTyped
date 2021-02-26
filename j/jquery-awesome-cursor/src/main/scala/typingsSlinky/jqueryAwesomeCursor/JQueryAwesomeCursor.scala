package typingsSlinky.jqueryAwesomeCursor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryAwesomeCursor {
  
  @js.native
  trait Font extends StObject {
    
    var cssClass: String | cssHandler = js.native
    
    var family: String = js.native
  }
  object Font {
    
    @scala.inline
    def apply(cssClass: String | cssHandler, family: String): Font = {
      val __obj = js.Dynamic.literal(cssClass = cssClass.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any])
      __obj.asInstanceOf[Font]
    }
    
    @scala.inline
    implicit class FontMutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssClass(value: String | cssHandler): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassFunction1(value: /* name */ String => Unit): Self = StObject.set(x, "cssClass", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var flip: js.UndefOr[typingsSlinky.jqueryAwesomeCursor.JQueryAwesomeCursor.flip] = js.native
    
    var font: js.UndefOr[Font] = js.native
    
    var hotspot: js.UndefOr[js.Array[Double] | String] = js.native
    
    var outline: js.UndefOr[String] = js.native
    
    var rotate: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFlip(value: flip): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHotspot(value: js.Array[Double] | String): Self = StObject.set(x, "hotspot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotspotUndefined: Self = StObject.set(x, "hotspot", js.undefined)
      
      @scala.inline
      def setHotspotVarargs(value: Double*): Self = StObject.set(x, "hotspot", js.Array(value :_*))
      
      @scala.inline
      def setOutline(value: String): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type cssHandler = js.Function1[/* name */ String, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.horizontal
    - typingsSlinky.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.vertical
    - typingsSlinky.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.both
  */
  trait flip extends StObject
  object flip {
    
    @scala.inline
    def both: typingsSlinky.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.both = "both".asInstanceOf[typingsSlinky.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.both]
    
    @scala.inline
    def horizontal: typingsSlinky.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.horizontal = "horizontal".asInstanceOf[typingsSlinky.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.horizontal]
    
    @scala.inline
    def vertical: typingsSlinky.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.vertical = "vertical".asInstanceOf[typingsSlinky.jqueryAwesomeCursor.jqueryAwesomeCursorStrings.vertical]
  }
}
