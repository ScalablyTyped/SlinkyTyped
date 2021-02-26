package typingsSlinky.jqueryColorpicker

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jqueryColorpicker.JQueryColorpickerStatic.RGB
import typingsSlinky.jqueryColorpicker.anon.A
import typingsSlinky.jqueryColorpicker.anon.Cmyk
import typingsSlinky.jqueryColorpicker.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryColorpickerStatic extends StObject {
  
  var Color: Instantiable = js.native
  
  var limits: StringDictionary[js.Function1[/* color */ js.Any, Unit]] = js.native
  
  var parsers: StringDictionary[js.Function1[/* color */ js.Any, _]] = js.native
  
  var parts: StringDictionary[js.Function1[/* inst */ js.Any, _]] = js.native
  
  var partslists: StringDictionary[js.Array[String]] = js.native
  
  var regional: StringDictionary[String] = js.native
  
  var swatches: StringDictionary[StringDictionary[RGB]] = js.native
  
  var writers: StringDictionary[js.Function2[/* color */ js.Any, /* that */ js.Any, _]] = js.native
}
object JQueryColorpickerStatic {
  
  @scala.inline
  def apply(
    Color: Instantiable,
    limits: StringDictionary[js.Function1[/* color */ js.Any, Unit]],
    parsers: StringDictionary[js.Function1[/* color */ js.Any, _]],
    parts: StringDictionary[js.Function1[/* inst */ js.Any, _]],
    partslists: StringDictionary[js.Array[String]],
    regional: StringDictionary[String],
    swatches: StringDictionary[StringDictionary[RGB]],
    writers: StringDictionary[js.Function2[/* color */ js.Any, /* that */ js.Any, _]]
  ): JQueryColorpickerStatic = {
    val __obj = js.Dynamic.literal(Color = Color.asInstanceOf[js.Any], limits = limits.asInstanceOf[js.Any], parsers = parsers.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], partslists = partslists.asInstanceOf[js.Any], regional = regional.asInstanceOf[js.Any], swatches = swatches.asInstanceOf[js.Any], writers = writers.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryColorpickerStatic]
  }
  
  @js.native
  trait CMYK extends StObject {
    
    var c: Double = js.native
    
    var k: Double = js.native
    
    var m: Double = js.native
    
    var y: Double = js.native
  }
  object CMYK {
    
    @scala.inline
    def apply(c: Double, k: Double, m: Double, y: Double): CMYK = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[CMYK]
    }
    
    @scala.inline
    implicit class CMYKMutableBuilder[Self <: CMYK] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK(value: Double): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Color extends StObject {
    
    def copy(): Color = js.native
    
    def distance(color: Color): Double = js.native
    
    def equals(color: Color): Boolean = js.native
    
    def getAlpha(): Double = js.native
    
    def getCMYK(): CMYK = js.native
    
    def getChannels(): A = js.native
    
    def getHSL(): HSL = js.native
    
    def getHSV(): HSV = js.native
    
    def getLAB(): LAB = js.native
    
    def getRGB(): RGB = js.native
    
    def getSpaces(): Cmyk = js.native
    
    def limit(steps: Double): Unit = js.native
    
    def normalize(): Color = js.native
    
    var set: Boolean = js.native
    
    def setAlpha(a: Double): Color = js.native
    
    def setCMYK(c: Double, m: Double, y: Double, k: Double): Color = js.native
    
    def setHSL(h: Double, s: Double, l: Double): Color = js.native
    
    def setHSV(h: Double, s: Double, v: Double): Color = js.native
    
    def setLAB(l: Double, a: Double, b: Double): Color = js.native
    
    def setRGB(r: Double, g: Double, b: Double): Color = js.native
    
    def setSpaces(new_spaces: js.Any): Color = js.native
    
    def toCSS(): String = js.native
    
    def toHEX(): String = js.native
  }
  object Color {
    
    @scala.inline
    def apply(
      copy: () => Color,
      distance: Color => Double,
      equals_ : Color => Boolean,
      getAlpha: () => Double,
      getCMYK: () => CMYK,
      getChannels: () => A,
      getHSL: () => HSL,
      getHSV: () => HSV,
      getLAB: () => LAB,
      getRGB: () => RGB,
      getSpaces: () => Cmyk,
      limit: Double => Unit,
      normalize: () => Color,
      set: Boolean,
      setAlpha: Double => Color,
      setCMYK: (Double, Double, Double, Double) => Color,
      setHSL: (Double, Double, Double) => Color,
      setHSV: (Double, Double, Double) => Color,
      setLAB: (Double, Double, Double) => Color,
      setRGB: (Double, Double, Double) => Color,
      setSpaces: js.Any => Color,
      toCSS: () => String,
      toHEX: () => String
    ): Color = {
      val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), distance = js.Any.fromFunction1(distance), getAlpha = js.Any.fromFunction0(getAlpha), getCMYK = js.Any.fromFunction0(getCMYK), getChannels = js.Any.fromFunction0(getChannels), getHSL = js.Any.fromFunction0(getHSL), getHSV = js.Any.fromFunction0(getHSV), getLAB = js.Any.fromFunction0(getLAB), getRGB = js.Any.fromFunction0(getRGB), getSpaces = js.Any.fromFunction0(getSpaces), limit = js.Any.fromFunction1(limit), normalize = js.Any.fromFunction0(normalize), set = set.asInstanceOf[js.Any], setAlpha = js.Any.fromFunction1(setAlpha), setCMYK = js.Any.fromFunction4(setCMYK), setHSL = js.Any.fromFunction3(setHSL), setHSV = js.Any.fromFunction3(setHSV), setLAB = js.Any.fromFunction3(setLAB), setRGB = js.Any.fromFunction3(setRGB), setSpaces = js.Any.fromFunction1(setSpaces), toCSS = js.Any.fromFunction0(toCSS), toHEX = js.Any.fromFunction0(toHEX))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopy(value: () => Color): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDistance(value: Color => Double): Self = StObject.set(x, "distance", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEquals_(value: Color => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAlpha(value: () => Double): Self = StObject.set(x, "getAlpha", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetCMYK(value: () => CMYK): Self = StObject.set(x, "getCMYK", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetChannels(value: () => A): Self = StObject.set(x, "getChannels", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHSL(value: () => HSL): Self = StObject.set(x, "getHSL", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetHSV(value: () => HSV): Self = StObject.set(x, "getHSV", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLAB(value: () => LAB): Self = StObject.set(x, "getLAB", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRGB(value: () => RGB): Self = StObject.set(x, "getRGB", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSpaces(value: () => Cmyk): Self = StObject.set(x, "getSpaces", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLimit(value: Double => Unit): Self = StObject.set(x, "limit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNormalize(value: () => Color): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: Boolean): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetAlpha(value: Double => Color): Self = StObject.set(x, "setAlpha", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCMYK(value: (Double, Double, Double, Double) => Color): Self = StObject.set(x, "setCMYK", js.Any.fromFunction4(value))
      
      @scala.inline
      def setSetHSL(value: (Double, Double, Double) => Color): Self = StObject.set(x, "setHSL", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetHSV(value: (Double, Double, Double) => Color): Self = StObject.set(x, "setHSV", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetLAB(value: (Double, Double, Double) => Color): Self = StObject.set(x, "setLAB", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetRGB(value: (Double, Double, Double) => Color): Self = StObject.set(x, "setRGB", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSetSpaces(value: js.Any => Color): Self = StObject.set(x, "setSpaces", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToCSS(value: () => String): Self = StObject.set(x, "toCSS", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToHEX(value: () => String): Self = StObject.set(x, "toHEX", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait HSL extends StObject {
    
    var h: Double = js.native
    
    var l: Double = js.native
    
    var s: Double = js.native
  }
  object HSL {
    
    @scala.inline
    def apply(h: Double, l: Double, s: Double): HSL = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSL]
    }
    
    @scala.inline
    implicit class HSLMutableBuilder[Self <: HSL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
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
  
  @scala.inline
  implicit class JQueryColorpickerStaticMutableBuilder[Self <: JQueryColorpickerStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Instantiable): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimits(value: StringDictionary[js.Function1[/* color */ js.Any, Unit]]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsers(value: StringDictionary[js.Function1[/* color */ js.Any, _]]): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParts(value: StringDictionary[js.Function1[/* inst */ js.Any, _]]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartslists(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "partslists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegional(value: StringDictionary[String]): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwatches(value: StringDictionary[StringDictionary[RGB]]): Self = StObject.set(x, "swatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriters(value: StringDictionary[js.Function2[/* color */ js.Any, /* that */ js.Any, _]]): Self = StObject.set(x, "writers", value.asInstanceOf[js.Any])
  }
  
  @js.native
  trait LAB extends StObject {
    
    var a: Double = js.native
    
    var b: Double = js.native
    
    var l: Double = js.native
  }
  object LAB {
    
    @scala.inline
    def apply(a: Double, b: Double, l: Double): LAB = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any])
      __obj.asInstanceOf[LAB]
    }
    
    @scala.inline
    implicit class LABMutableBuilder[Self <: LAB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    }
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
