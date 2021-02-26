package typingsSlinky.protonNative

import typingsSlinky.protonNative.protonNativeStrings.auxiliary
import typingsSlinky.protonNative.protonNativeStrings.bold
import typingsSlinky.protonNative.protonNativeStrings.book
import typingsSlinky.protonNative.protonNativeStrings.center
import typingsSlinky.protonNative.protonNativeStrings.condensed
import typingsSlinky.protonNative.protonNativeStrings.double
import typingsSlinky.protonNative.protonNativeStrings.expanded
import typingsSlinky.protonNative.protonNativeStrings.extraCondensed
import typingsSlinky.protonNative.protonNativeStrings.extraExpanded
import typingsSlinky.protonNative.protonNativeStrings.grammar
import typingsSlinky.protonNative.protonNativeStrings.heavy
import typingsSlinky.protonNative.protonNativeStrings.italic
import typingsSlinky.protonNative.protonNativeStrings.left
import typingsSlinky.protonNative.protonNativeStrings.light
import typingsSlinky.protonNative.protonNativeStrings.maximum
import typingsSlinky.protonNative.protonNativeStrings.medium
import typingsSlinky.protonNative.protonNativeStrings.minimum
import typingsSlinky.protonNative.protonNativeStrings.none
import typingsSlinky.protonNative.protonNativeStrings.normal
import typingsSlinky.protonNative.protonNativeStrings.oblique
import typingsSlinky.protonNative.protonNativeStrings.right
import typingsSlinky.protonNative.protonNativeStrings.semiBold
import typingsSlinky.protonNative.protonNativeStrings.semiCondensed
import typingsSlinky.protonNative.protonNativeStrings.semiExpanded
import typingsSlinky.protonNative.protonNativeStrings.single
import typingsSlinky.protonNative.protonNativeStrings.spelling
import typingsSlinky.protonNative.protonNativeStrings.suggestion
import typingsSlinky.protonNative.protonNativeStrings.thin
import typingsSlinky.protonNative.protonNativeStrings.ultraBold
import typingsSlinky.protonNative.protonNativeStrings.ultraCondensed
import typingsSlinky.protonNative.protonNativeStrings.ultraExpanded
import typingsSlinky.protonNative.protonNativeStrings.ultraHeavy
import typingsSlinky.protonNative.protonNativeStrings.ultraLight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait A extends StObject {
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var g: Double = js.native
    
    var r: Double = js.native
  }
  object A {
    
    @scala.inline
    def apply(a: Double, b: Double, g: Double, r: Double): A = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[A]
    }
    
    @scala.inline
    implicit class AMutableBuilder[Self <: A] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BackgroundColor extends StObject {
    
    /**
      * The background color, specified as a CSS color string.
      */
    var backgroundColor: js.UndefOr[String] = js.native
    
    /**
      * The text color, specified as a CSS color string.
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * The font family (only if available on the system).
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /**
      * The font size (in pt).
      */
    var fontSize: js.UndefOr[Double] = js.native
    
    /**
      * Whether an italic font should be used.
      */
    var fontStyle: js.UndefOr[normal | oblique | italic] = js.native
    
    /**
      * Whether a bold font should be used (and the amount).
      */
    var fontWeight: js.UndefOr[
        minimum | thin | ultraLight | light | book | normal | medium | semiBold | bold | ultraBold | heavy | ultraHeavy | maximum | Double
      ] = js.native
    
    /**
      * Wheter the text should be aligned to the left, center or right.
      *
      * **Works only on a top level text component, not it's children!**
      */
    var textAlign: js.UndefOr[left | center | right] = js.native
    
    /**
      * How wide or narrow the characters should be.
      */
    var textStretch: js.UndefOr[
        ultraCondensed | extraCondensed | condensed | semiCondensed | normal | semiExpanded | expanded | extraExpanded | ultraExpanded
      ] = js.native
    
    /**
      * The text underline style.
      */
    var textUnderline: js.UndefOr[none | single | double | suggestion] = js.native
    
    /**
      * The text underline color.
      *
      * A color string | 'spelling' | 'grammar' | 'auxiliary'
      */
    var textUnderlineColor: js.UndefOr[spelling | grammar | auxiliary | String] = js.native
  }
  object BackgroundColor {
    
    @scala.inline
    def apply(): BackgroundColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackgroundColor]
    }
    
    @scala.inline
    implicit class BackgroundColorMutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontStyle(value: normal | oblique | italic): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(
        value: minimum | thin | ultraLight | light | book | normal | medium | semiBold | bold | ultraBold | heavy | ultraHeavy | maximum | Double
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setTextAlign(value: left | center | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextStretch(
        value: ultraCondensed | extraCondensed | condensed | semiCondensed | normal | semiExpanded | expanded | extraExpanded | ultraExpanded
      ): Self = StObject.set(x, "textStretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStretchUndefined: Self = StObject.set(x, "textStretch", js.undefined)
      
      @scala.inline
      def setTextUnderline(value: none | single | double | suggestion): Self = StObject.set(x, "textUnderline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUnderlineColor(value: spelling | grammar | auxiliary | String): Self = StObject.set(x, "textUnderlineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUnderlineColorUndefined: Self = StObject.set(x, "textUnderlineColor", js.undefined)
      
      @scala.inline
      def setTextUnderlineUndefined: Self = StObject.set(x, "textUnderline", js.undefined)
    }
  }
  
  @js.native
  trait Buttons extends StObject {
    
    var buttons: js.Array[String] = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Buttons {
    
    @scala.inline
    def apply(buttons: js.Array[String], height: Double, width: Double, x: Double, y: Double): Buttons = {
      val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Buttons]
    }
    
    @scala.inline
    implicit class ButtonsMutableBuilder[Self <: Buttons] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtons(value: js.Array[String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsVarargs(value: String*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Description extends StObject {
    
    var description: js.UndefOr[String] = js.native
    
    var title: String = js.native
  }
  object Description {
    
    @scala.inline
    def apply(title: String): Description = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait H extends StObject {
    
    var h: Boolean = js.native
    
    var v: Boolean = js.native
  }
  object H {
    
    @scala.inline
    def apply(h: Boolean, v: Boolean): H = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[H]
    }
    
    @scala.inline
    implicit class HMutableBuilder[Self <: H] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Boolean): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Boolean): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Title extends StObject {
    
    var description: String = js.native
    
    var title: js.UndefOr[String] = js.native
  }
  object Title {
    
    @scala.inline
    def apply(description: String): Title = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.asInstanceOf[Title]
    }
    
    @scala.inline
    implicit class TitleMutableBuilder[Self <: Title] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait W extends StObject {
    
    var h: Double = js.native
    
    var w: Double = js.native
  }
  object W {
    
    @scala.inline
    def apply(h: Double, w: Double): W = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[W]
    }
    
    @scala.inline
    implicit class WMutableBuilder[Self <: W] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait X extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Y extends StObject {
    
    var h: Double = js.native
    
    var y: Double = js.native
  }
  object Y {
    
    @scala.inline
    def apply(h: Double, y: Double): Y = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Y]
    }
    
    @scala.inline
    implicit class YMutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
