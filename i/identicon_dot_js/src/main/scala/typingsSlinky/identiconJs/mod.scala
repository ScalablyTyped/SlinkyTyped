package typingsSlinky.identiconJs

import typingsSlinky.identiconJs.identiconJsStrings.png
import typingsSlinky.identiconJs.identiconJsStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("identicon.js", JSImport.Default)
  @js.native
  class default protected () extends Identicon {
    def this(hash: String) = this()
    def this(hash: String, options: IdenticonOptions) = this()
    def this(hash: String, size: Double) = this()
  }
  
  type Color = js.Tuple4[Double, Double, Double, Double]
  
  @js.native
  trait Identicon extends StObject {
    
    var background: Color = js.native
    
    var foreground: Color = js.native
    
    var format: svg | png = js.native
    
    var hash: String = js.native
    
    /**
      * Converts from hsl to rgb.
      * @param h hue
      * @param s saturation
      * @param b brightness
      */
    def hsl2rgb(h: Double, s: Double, b: Double): js.Tuple3[Double, Double, Double] = js.native
    
    /**
      * Returns a new blank image as Svg or PNGlib.
      */
    def image(): Svg | PNGlib = js.native
    
    /**
      * Returns true if the identicon is a Svg.
      */
    def isSvg(): Boolean = js.native
    
    var margin: Double = js.native
    
    def rectangle(x: Double, y: Double, w: Double, h: Double, color: Color, image: PNGlib): Unit = js.native
    /**
      * Places a rectangle at the given position with the given width, height and color in the image.
      * @param x The x coordinate.
      * @param y The y coordinate
      * @param w The width.
      * @param h The height.
      * @param color The color.
      * @param image The image.
      */
    def rectangle(x: Double, y: Double, w: Double, h: Double, color: Color, image: Svg): Unit = js.native
    
    /**
      * Returns a new image as Svg or PNGlib with the identicon applied.
      */
    def render(): Svg | PNGlib = js.native
    
    var size: Double = js.native
  }
  
  @js.native
  trait IdenticonOptions extends StObject {
    
    var background: js.UndefOr[Color] = js.native
    
    var foreground: js.UndefOr[Color] = js.native
    
    var format: js.UndefOr[svg | png] = js.native
    
    var margin: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[Double] = js.native
  }
  object IdenticonOptions {
    
    @scala.inline
    def apply(): IdenticonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdenticonOptions]
    }
    
    @scala.inline
    implicit class IdenticonOptionsMutableBuilder[Self <: IdenticonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setForeground(value: Color): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
      
      @scala.inline
      def setFormat(value: svg | png): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait PNGlib extends StObject {
    
    var depth: Double = js.native
    
    /**
      * Returns the image as a base64 encoded string.
      */
    def getBase64(): String = js.native
    
    /**
      * Returns the png as a string.
      */
    def getDump(): String = js.native
    
    var height: Double = js.native
    
    /**
      * Returns the index of a given pixel in the image data array.
      * @param x The given x coordinate of the pixel.
      * @param y The given y coordinate of the pixel.
      */
    def index(x: Double, y: Double): Double = js.native
    
    var width: Double = js.native
  }
  object PNGlib {
    
    @scala.inline
    def apply(
      depth: Double,
      getBase64: () => String,
      getDump: () => String,
      height: Double,
      index: (Double, Double) => Double,
      width: Double
    ): PNGlib = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], getBase64 = js.Any.fromFunction0(getBase64), getDump = js.Any.fromFunction0(getDump), height = height.asInstanceOf[js.Any], index = js.Any.fromFunction2(index), width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PNGlib]
    }
    
    @scala.inline
    implicit class PNGlibMutableBuilder[Self <: PNGlib] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetBase64(value: () => String): Self = StObject.set(x, "getBase64", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDump(value: () => String): Self = StObject.set(x, "getDump", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: (Double, Double) => Double): Self = StObject.set(x, "index", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Svg extends StObject {
    
    var background: Color = js.native
    
    /**
      * Returns a string with the structure 'rgb(r, g, b, a)'.
      * @param red
      * @param green
      * @param blue
      * @param alpha
      */
    def color(red: Double, green: Double, blue: Double, alpha: Double): String = js.native
    
    var foreground: Color = js.native
    
    /**
      * Returns the Svg as a base64 encoded string.
      */
    def getBase64(): String = js.native
    
    /**
      * Returns the Svg as string.
      */
    def getDump(): String = js.native
    
    var rectangles: js.Array[typingsSlinky.identiconJs.anon.Color] = js.native
    
    var size: Double = js.native
  }
  object Svg {
    
    @scala.inline
    def apply(
      background: Color,
      color: (Double, Double, Double, Double) => String,
      foreground: Color,
      getBase64: () => String,
      getDump: () => String,
      rectangles: js.Array[typingsSlinky.identiconJs.anon.Color],
      size: Double
    ): Svg = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = js.Any.fromFunction4(color), foreground = foreground.asInstanceOf[js.Any], getBase64 = js.Any.fromFunction0(getBase64), getDump = js.Any.fromFunction0(getDump), rectangles = rectangles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Svg]
    }
    
    @scala.inline
    implicit class SvgMutableBuilder[Self <: Svg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: Color): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: (Double, Double, Double, Double) => String): Self = StObject.set(x, "color", js.Any.fromFunction4(value))
      
      @scala.inline
      def setForeground(value: Color): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetBase64(value: () => String): Self = StObject.set(x, "getBase64", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDump(value: () => String): Self = StObject.set(x, "getDump", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRectangles(value: js.Array[typingsSlinky.identiconJs.anon.Color]): Self = StObject.set(x, "rectangles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRectanglesVarargs(value: typingsSlinky.identiconJs.anon.Color*): Self = StObject.set(x, "rectangles", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
