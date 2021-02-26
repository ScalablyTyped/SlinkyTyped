package typingsSlinky.pleasejs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PleaseJS {
  
  @js.native
  trait HSV extends StObject {
    
    var h: Double = js.native
    
    var s: Double = js.native
    
    var v: Double = js.native
  }
  object HSV {
    
    @scala.inline
    def apply(h: Double, s: Double, v: Double): HSV = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSV]
    }
    
    @scala.inline
    implicit class HSVMutableBuilder[Self <: HSV] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MakeColorOption extends StObject {
    
    var base_color: js.UndefOr[String] = js.native
    
    var colors_returned: js.UndefOr[Double] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var full_random: js.UndefOr[Boolean] = js.native
    
    var golden: js.UndefOr[Boolean] = js.native
    
    var grayscale: js.UndefOr[Boolean] = js.native
    
    var greyscale: js.UndefOr[Boolean] = js.native
    
    var hue: js.UndefOr[Double] = js.native
    
    var saturation: js.UndefOr[Double] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object MakeColorOption {
    
    @scala.inline
    def apply(): MakeColorOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MakeColorOption]
    }
    
    @scala.inline
    implicit class MakeColorOptionMutableBuilder[Self <: MakeColorOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase_color(value: String): Self = StObject.set(x, "base_color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase_colorUndefined: Self = StObject.set(x, "base_color", js.undefined)
      
      @scala.inline
      def setColors_returned(value: Double): Self = StObject.set(x, "colors_returned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColors_returnedUndefined: Self = StObject.set(x, "colors_returned", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setFull_random(value: Boolean): Self = StObject.set(x, "full_random", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFull_randomUndefined: Self = StObject.set(x, "full_random", js.undefined)
      
      @scala.inline
      def setGolden(value: Boolean): Self = StObject.set(x, "golden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoldenUndefined: Self = StObject.set(x, "golden", js.undefined)
      
      @scala.inline
      def setGrayscale(value: Boolean): Self = StObject.set(x, "grayscale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrayscaleUndefined: Self = StObject.set(x, "grayscale", js.undefined)
      
      @scala.inline
      def setGreyscale(value: Boolean): Self = StObject.set(x, "greyscale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreyscaleUndefined: Self = StObject.set(x, "greyscale", js.undefined)
      
      @scala.inline
      def setHue(value: Double): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHueUndefined: Self = StObject.set(x, "hue", js.undefined)
      
      @scala.inline
      def setSaturation(value: Double): Self = StObject.set(x, "saturation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaturationUndefined: Self = StObject.set(x, "saturation", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait MakeSchemeOption extends StObject {
    
    var format: String = js.native
    
    var scheme_type: String = js.native
  }
  object MakeSchemeOption {
    
    @scala.inline
    def apply(format: String, scheme_type: String): MakeSchemeOption = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], scheme_type = scheme_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[MakeSchemeOption]
    }
    
    @scala.inline
    implicit class MakeSchemeOptionMutableBuilder[Self <: MakeSchemeOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheme_type(value: String): Self = StObject.set(x, "scheme_type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Please extends StObject {
    
    /***
      * convert HEX into HSV
      * @param {string} hex
      * @returns {HSV}
      */
    def HEX_to_HSV(hex: String): HSV = js.native
    
    /***
      * convert HEX into RGB
      * @param {string} hex
      * @returns {RGB}
      */
    def HEX_to_RGB(hex: String): RGB | Null = js.native
    
    /***
      * convert HSV into HEX
      * @param {HSV} hsv
      * @returns {string}
      */
    def HSV_to_HEX(hsv: HSV): String = js.native
    
    /***
      * convert HSV into RGB
      * @param {HSV} hsv
      * @returns {RGB}
      */
    def HSV_to_RGB(hsv: HSV): RGB = js.native
    
    /***
      * convert color name into hex string
      * @param {string} name
      * @returns {string}
      */
    def NAME_to_HEX(name: String): js.UndefOr[String] = js.native
    
    /***
      * convert color name into RGB
      * @param {string} name
      * @returns {HSV}
      */
    def NAME_to_HSV(name: String): HSV = js.native
    
    /***
      * convert color name into RGB
      * @param {string} name
      * @returns {RGB}
      */
    def NAME_to_RGB(name: String): RGB | Null = js.native
    
    /***
      * convert RGB into HEX
      * @param {RGB} rgb
      * @returns {string}
      */
    def RGB_to_HEX(rgb: RGB): String = js.native
    
    /***
      * convert RGB into HSV
      * @param {RGB} rgb
      * @returns {HSV}
      */
    def RGB_to_HSV(rgb: RGB): HSV = js.native
    
    /***
      * generate and return a random hex string
      * @param {MakeColorOption} options
      * @returns {Array}
      */
    def make_color(): js.Array[String | RGB | HSV] = js.native
    def make_color(options: MakeColorOption): js.Array[String | RGB | HSV] = js.native
    
    /***
      * make a color scheme
      * @param {MakeSchemeOption} options
      * @returns {Array}
      */
    def make_scheme(base_color: HSV): js.Array[String | RGB | HSV] = js.native
    def make_scheme(base_color: HSV, options: MakeSchemeOption): js.Array[String | RGB | HSV] = js.native
  }
  
  @js.native
  trait RGB extends StObject {
    
    var b: Double = js.native
    
    var g: Double = js.native
    
    var r: Double = js.native
  }
  object RGB {
    
    @scala.inline
    def apply(b: Double, g: Double, r: Double): RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGB]
    }
    
    @scala.inline
    implicit class RGBMutableBuilder[Self <: RGB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
