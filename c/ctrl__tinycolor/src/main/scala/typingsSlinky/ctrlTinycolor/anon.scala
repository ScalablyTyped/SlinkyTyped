package typingsSlinky.ctrlTinycolor

import typingsSlinky.ctrlTinycolor.distMod.TinyColor_
import typingsSlinky.ctrlTinycolor.randomMod.RandomCountOptions
import typingsSlinky.ctrlTinycolor.randomMod.RandomOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait A extends StObject {
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var format: js.Any = js.native
    
    var g: Double = js.native
    
    var ok: Boolean = js.native
    
    var r: Double = js.native
  }
  object A {
    
    @scala.inline
    def apply(a: Double, b: Double, format: js.Any, g: Double, ok: Boolean, r: Double): A = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[A]
    }
    
    @scala.inline
    implicit class AMutableBuilder[Self <: A] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: js.Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): TinyColor_ = js.native
    def apply(options: RandomCountOptions): js.Array[TinyColor_] = js.native
    def apply(options: RandomOptions): TinyColor_ = js.native
  }
  
  /* Inlined @ctrl/tinycolor.@ctrl/tinycolor/dist/interfaces.Numberify<@ctrl/tinycolor.@ctrl/tinycolor/dist/interfaces.HSL> */
  @js.native
  trait NumberifyHSL extends StObject {
    
    var h: Double = js.native
    
    var l: Double = js.native
    
    var s: Double = js.native
  }
  object NumberifyHSL {
    
    @scala.inline
    def apply(h: Double, l: Double, s: Double): NumberifyHSL = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberifyHSL]
    }
    
    @scala.inline
    implicit class NumberifyHSLMutableBuilder[Self <: NumberifyHSL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @ctrl/tinycolor.@ctrl/tinycolor/dist/interfaces.Numberify<@ctrl/tinycolor.@ctrl/tinycolor/dist/interfaces.HSLA> */
  @js.native
  trait NumberifyHSLA extends StObject {
    
    var a: Double = js.native
    
    var h: Double = js.native
    
    var l: Double = js.native
    
    var s: Double = js.native
  }
  object NumberifyHSLA {
    
    @scala.inline
    def apply(a: Double, h: Double, l: Double, s: Double): NumberifyHSLA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberifyHSLA]
    }
    
    @scala.inline
    implicit class NumberifyHSLAMutableBuilder[Self <: NumberifyHSLA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @ctrl/tinycolor.@ctrl/tinycolor/dist/interfaces.Numberify<@ctrl/tinycolor.@ctrl/tinycolor/dist/interfaces.HSV> */
  @js.native
  trait NumberifyHSV extends StObject {
    
    var h: Double = js.native
    
    var s: Double = js.native
    
    var v: Double = js.native
  }
  object NumberifyHSV {
    
    @scala.inline
    def apply(h: Double, s: Double, v: Double): NumberifyHSV = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberifyHSV]
    }
    
    @scala.inline
    implicit class NumberifyHSVMutableBuilder[Self <: NumberifyHSV] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @ctrl/tinycolor.@ctrl/tinycolor/dist/interfaces.Numberify<@ctrl/tinycolor.@ctrl/tinycolor/dist/interfaces.HSVA> */
  @js.native
  trait NumberifyHSVA extends StObject {
    
    var a: Double = js.native
    
    var h: Double = js.native
    
    var s: Double = js.native
    
    var v: Double = js.native
  }
  object NumberifyHSVA {
    
    @scala.inline
    def apply(a: Double, h: Double, s: Double, v: Double): NumberifyHSVA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberifyHSVA]
    }
    
    @scala.inline
    implicit class NumberifyHSVAMutableBuilder[Self <: NumberifyHSVA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @ctrl/tinycolor.@ctrl/tinycolor/dist/interfaces.Numberify<@ctrl/tinycolor.@ctrl/tinycolor/dist/interfaces.RGB> */
  @js.native
  trait NumberifyRGB extends StObject {
    
    var b: Double = js.native
    
    var g: Double = js.native
    
    var r: Double = js.native
  }
  object NumberifyRGB {
    
    @scala.inline
    def apply(b: Double, g: Double, r: Double): NumberifyRGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberifyRGB]
    }
    
    @scala.inline
    implicit class NumberifyRGBMutableBuilder[Self <: NumberifyRGB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @ctrl/tinycolor.@ctrl/tinycolor/dist/interfaces.Numberify<@ctrl/tinycolor.@ctrl/tinycolor/dist/interfaces.RGBA> */
  @js.native
  trait NumberifyRGBA extends StObject {
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var g: Double = js.native
    
    var r: Double = js.native
  }
  object NumberifyRGBA {
    
    @scala.inline
    def apply(a: Double, b: Double, g: Double, r: Double): NumberifyRGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberifyRGBA]
    }
    
    @scala.inline
    implicit class NumberifyRGBAMutableBuilder[Self <: NumberifyRGBA] (val x: Self) extends AnyVal {
      
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
  
  /* Inlined std.Partial<@ctrl/tinycolor.@ctrl/tinycolor/dist.TinyColorOptions> */
  @js.native
  trait PartialTinyColorOptions extends StObject {
    
    var format: js.UndefOr[String] = js.native
    
    var gradientType: js.UndefOr[String] = js.native
  }
  object PartialTinyColorOptions {
    
    @scala.inline
    def apply(): PartialTinyColorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTinyColorOptions]
    }
    
    @scala.inline
    implicit class PartialTinyColorOptionsMutableBuilder[Self <: PartialTinyColorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGradientType(value: String): Self = StObject.set(x, "gradientType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientTypeUndefined: Self = StObject.set(x, "gradientType", js.undefined)
    }
  }
}
