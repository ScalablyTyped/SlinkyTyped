package typingsSlinky.colorConvert

import typingsSlinky.colorConvert.colorConvertNumbers.`1`
import typingsSlinky.colorConvert.colorConvertNumbers.`3`
import typingsSlinky.colorConvert.colorConvertNumbers.`4`
import typingsSlinky.colorConvert.colorConvertStrings.b16
import typingsSlinky.colorConvert.colorConvertStrings.c
import typingsSlinky.colorConvert.colorConvertStrings.g
import typingsSlinky.colorConvert.colorConvertStrings.g16
import typingsSlinky.colorConvert.colorConvertStrings.h
import typingsSlinky.colorConvert.colorConvertStrings.r16
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object conversionsMod {
  
  object ansi16 {
    
    @JSImport("color-convert/conversions", "ansi16.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "ansi16.labels")
    @js.native
    val labels: js.Array[typingsSlinky.colorConvert.colorConvertStrings.ansi16] = js.native
    
    @JSImport("color-convert/conversions", "ansi16.rgb")
    @js.native
    def rgb(ansi16: ANSI16_): RGB_ = js.native
  }
  
  object ansi256 {
    
    @JSImport("color-convert/conversions", "ansi256.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "ansi256.labels")
    @js.native
    val labels: js.Array[typingsSlinky.colorConvert.colorConvertStrings.ansi256] = js.native
    
    @JSImport("color-convert/conversions", "ansi256.rgb")
    @js.native
    def rgb(ansi256: ANSI256_): RGB_ = js.native
  }
  
  object apple {
    
    @JSImport("color-convert/conversions", "apple.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "apple.labels")
    @js.native
    val labels: js.Tuple3[r16, g16, b16] = js.native
    
    @JSImport("color-convert/conversions", "apple.rgb")
    @js.native
    def rgb(apple: APPLE_): RGB_ = js.native
  }
  
  object cmyk {
    
    @JSImport("color-convert/conversions", "cmyk.channels")
    @js.native
    val channels: `4` = js.native
    
    @JSImport("color-convert/conversions", "cmyk.labels")
    @js.native
    val labels: typingsSlinky.colorConvert.colorConvertStrings.cmyk = js.native
    
    @JSImport("color-convert/conversions", "cmyk.rgb")
    @js.native
    def rgb(cmyk: CMYK_): RGB_ = js.native
  }
  
  object gray {
    
    @JSImport("color-convert/conversions", "gray.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "gray.cmyk")
    @js.native
    def cmyk(gray: GRAY_): CMYK_ = js.native
    
    @JSImport("color-convert/conversions", "gray.hex")
    @js.native
    def hex(gray: GRAY_): HEX_ = js.native
    
    @JSImport("color-convert/conversions", "gray.hsl")
    @js.native
    def hsl(gray: GRAY_): HSL_ = js.native
    
    @JSImport("color-convert/conversions", "gray.hsv")
    @js.native
    def hsv(gray: GRAY_): HSV_ = js.native
    
    @JSImport("color-convert/conversions", "gray.hwb")
    @js.native
    def hwb(gray: GRAY_): HWB_ = js.native
    
    @JSImport("color-convert/conversions", "gray.lab")
    @js.native
    def lab(gray: GRAY_): LAB_ = js.native
    
    @JSImport("color-convert/conversions", "gray.labels")
    @js.native
    val labels: js.Array[typingsSlinky.colorConvert.colorConvertStrings.gray] = js.native
    
    @JSImport("color-convert/conversions", "gray.rgb")
    @js.native
    def rgb(gray: GRAY_): RGB_ = js.native
  }
  
  object hcg {
    
    @JSImport("color-convert/conversions", "hcg.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "hcg.hsl")
    @js.native
    def hsl(hcg: HCG_): HSL_ = js.native
    
    @JSImport("color-convert/conversions", "hcg.hsv")
    @js.native
    def hsv(hcg: HCG_): HSV_ = js.native
    
    @JSImport("color-convert/conversions", "hcg.hwb")
    @js.native
    def hwb(hcg: HCG_): HWB_ = js.native
    
    @JSImport("color-convert/conversions", "hcg.labels")
    @js.native
    val labels: js.Tuple3[h, c, g] = js.native
    
    @JSImport("color-convert/conversions", "hcg.rgb")
    @js.native
    def rgb(hcg: HCG_): RGB_ = js.native
  }
  
  object hex {
    
    @JSImport("color-convert/conversions", "hex.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "hex.labels")
    @js.native
    val labels: js.Array[typingsSlinky.colorConvert.colorConvertStrings.hex] = js.native
    
    @JSImport("color-convert/conversions", "hex.rgb")
    @js.native
    def rgb(hex: HEX_): RGB_ = js.native
  }
  
  object hsl {
    
    @JSImport("color-convert/conversions", "hsl.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "hsl.hcg")
    @js.native
    def hcg(hsl: HSL_): HCG_ = js.native
    
    @JSImport("color-convert/conversions", "hsl.hsv")
    @js.native
    def hsv(hsl: HSL_): HSV_ = js.native
    
    @JSImport("color-convert/conversions", "hsl.labels")
    @js.native
    val labels: typingsSlinky.colorConvert.colorConvertStrings.hsl = js.native
    
    @JSImport("color-convert/conversions", "hsl.rgb")
    @js.native
    def rgb(hsl: HSL_): RGB_ = js.native
  }
  
  object hsv {
    
    @JSImport("color-convert/conversions", "hsv.ansi16")
    @js.native
    def ansi16(hsv: HSV_): ANSI16_ = js.native
    
    @JSImport("color-convert/conversions", "hsv.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "hsv.hcg")
    @js.native
    def hcg(hsv: HSV_): HCG_ = js.native
    
    @JSImport("color-convert/conversions", "hsv.hsl")
    @js.native
    def hsl(hsv: HSV_): HSL_ = js.native
    
    @JSImport("color-convert/conversions", "hsv.labels")
    @js.native
    val labels: typingsSlinky.colorConvert.colorConvertStrings.hsv = js.native
    
    @JSImport("color-convert/conversions", "hsv.rgb")
    @js.native
    def rgb(hsv: HSV_): RGB_ = js.native
  }
  
  object hwb {
    
    @JSImport("color-convert/conversions", "hwb.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "hwb.hcg")
    @js.native
    def hcg(hwb: HWB_): HCG_ = js.native
    
    @JSImport("color-convert/conversions", "hwb.labels")
    @js.native
    val labels: typingsSlinky.colorConvert.colorConvertStrings.hwb = js.native
    
    @JSImport("color-convert/conversions", "hwb.rgb")
    @js.native
    def rgb(hwb: HWB_): RGB_ = js.native
  }
  
  object keyword {
    
    @JSImport("color-convert/conversions", "keyword.channels")
    @js.native
    val channels: `1` = js.native
    
    @JSImport("color-convert/conversions", "keyword.labels")
    @js.native
    val labels: js.Array[typingsSlinky.colorConvert.colorConvertStrings.keyword] = js.native
    
    @JSImport("color-convert/conversions", "keyword.rgb")
    @js.native
    def rgb(keyword: KEYWORD_): RGB_ = js.native
  }
  
  object lab {
    
    @JSImport("color-convert/conversions", "lab.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "lab.labels")
    @js.native
    val labels: typingsSlinky.colorConvert.colorConvertStrings.lab = js.native
    
    @JSImport("color-convert/conversions", "lab.lch")
    @js.native
    def lch(lab: LAB_): LCH_ = js.native
    
    @JSImport("color-convert/conversions", "lab.xyz")
    @js.native
    def xyz(lab: LAB_): XYZ_ = js.native
  }
  
  object lch {
    
    @JSImport("color-convert/conversions", "lch.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "lch.lab")
    @js.native
    def lab(lch: LCH_): LAB_ = js.native
    
    @JSImport("color-convert/conversions", "lch.labels")
    @js.native
    val labels: typingsSlinky.colorConvert.colorConvertStrings.lch = js.native
  }
  
  object rgb {
    
    @JSImport("color-convert/conversions", "rgb.ansi16")
    @js.native
    def ansi16(rgb: RGB_): ANSI16_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.ansi256")
    @js.native
    def ansi256(rgb: RGB_): ANSI256_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.apple")
    @js.native
    def apple(rgb: RGB_): APPLE_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "rgb.cmyk")
    @js.native
    def cmyk(rgb: RGB_): CMYK_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.gray")
    @js.native
    def gray(rgb: RGB_): GRAY_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.hcg")
    @js.native
    def hcg(rgb: RGB_): HCG_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.hex")
    @js.native
    def hex(rgb: RGB_): HEX_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.hsl")
    @js.native
    def hsl(rgb: RGB_): HSL_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.hsv")
    @js.native
    def hsv(rgb: RGB_): HSV_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.hwb")
    @js.native
    def hwb(rgb: RGB_): HWB_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.keyword")
    @js.native
    def keyword(rgb: RGB_): KEYWORD_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.lab")
    @js.native
    def lab(rgb: RGB_): LAB_ = js.native
    
    @JSImport("color-convert/conversions", "rgb.labels")
    @js.native
    val labels: typingsSlinky.colorConvert.colorConvertStrings.rgb = js.native
    
    @JSImport("color-convert/conversions", "rgb.xyz")
    @js.native
    def xyz(rgb: RGB_): XYZ_ = js.native
  }
  
  object xyz {
    
    @JSImport("color-convert/conversions", "xyz.channels")
    @js.native
    val channels: `3` = js.native
    
    @JSImport("color-convert/conversions", "xyz.lab")
    @js.native
    def lab(xyz: XYZ_): LAB_ = js.native
    
    @JSImport("color-convert/conversions", "xyz.labels")
    @js.native
    val labels: typingsSlinky.colorConvert.colorConvertStrings.xyz = js.native
    
    @JSImport("color-convert/conversions", "xyz.rgb")
    @js.native
    def rgb(xyz: XYZ_): RGB_ = js.native
  }
  
  type ANSI16_ = Double
  
  type ANSI256_ = Double
  
  type APPLE_ = js.Tuple3[Double, Double, Double]
  
  type CMYK_ = js.Tuple4[Double, Double, Double, Double]
  
  type GRAY_ = js.Array[Double]
  
  type HCG_ = js.Tuple3[Double, Double, Double]
  
  type HEX_ = String
  
  type HSL_ = js.Tuple3[Double, Double, Double]
  
  type HSV_ = js.Tuple3[Double, Double, Double]
  
  type HWB_ = js.Tuple3[Double, Double, Double]
  
  /* keyof color-convert.anon.TypeofcssKeywords */ /* Rewritten from type alias, can be one of: 
    - typingsSlinky.colorConvert.colorConvertStrings.black
    - typingsSlinky.colorConvert.colorConvertStrings.magenta
    - typingsSlinky.colorConvert.colorConvertStrings.skyblue
    - typingsSlinky.colorConvert.colorConvertStrings.darkseagreen
    - typingsSlinky.colorConvert.colorConvertStrings.midnightblue
    - typingsSlinky.colorConvert.colorConvertStrings.rosybrown
    - typingsSlinky.colorConvert.colorConvertStrings.honeydew
    - typingsSlinky.colorConvert.colorConvertStrings.cadetblue
    - typingsSlinky.colorConvert.colorConvertStrings.darkgrey
    - typingsSlinky.colorConvert.colorConvertStrings.lavenderblush
    - typingsSlinky.colorConvert.colorConvertStrings.lightblue
    - typingsSlinky.colorConvert.colorConvertStrings.moccasin
    - typingsSlinky.colorConvert.colorConvertStrings.salmon
    - typingsSlinky.colorConvert.colorConvertStrings.indianred
    - typingsSlinky.colorConvert.colorConvertStrings.red
    - typingsSlinky.colorConvert.colorConvertStrings.purple
    - typingsSlinky.colorConvert.colorConvertStrings.chocolate
    - typingsSlinky.colorConvert.colorConvertStrings.darkslategray
    - typingsSlinky.colorConvert.colorConvertStrings.lightcyan
    - typingsSlinky.colorConvert.colorConvertStrings.limegreen
    - typingsSlinky.colorConvert.colorConvertStrings.lightslategray
    - typingsSlinky.colorConvert.colorConvertStrings.sandybrown
    - typingsSlinky.colorConvert.colorConvertStrings.mediumblue
    - typingsSlinky.colorConvert.colorConvertStrings.darkorange
    - typingsSlinky.colorConvert.colorConvertStrings.darkgray
    - typingsSlinky.colorConvert.colorConvertStrings.darkslategrey
    - typingsSlinky.colorConvert.colorConvertStrings.lightgrey
    - typingsSlinky.colorConvert.colorConvertStrings.ivory
    - typingsSlinky.colorConvert.colorConvertStrings.green
    - typingsSlinky.colorConvert.colorConvertStrings.lavender
    - typingsSlinky.colorConvert.colorConvertStrings.lightpink
    - typingsSlinky.colorConvert.colorConvertStrings.darkmagenta
    - typingsSlinky.colorConvert.colorConvertStrings.mediumspringgreen
    - typingsSlinky.colorConvert.colorConvertStrings.darkorchid
    - typingsSlinky.colorConvert.colorConvertStrings.aqua
    - typingsSlinky.colorConvert.colorConvertStrings.lightyellow
    - typingsSlinky.colorConvert.colorConvertStrings.hotpink
    - typingsSlinky.colorConvert.colorConvertStrings.khaki
    - typingsSlinky.colorConvert.colorConvertStrings.beige
    - typingsSlinky.colorConvert.colorConvertStrings.darkred
    - typingsSlinky.colorConvert.colorConvertStrings.darkslateblue
    - typingsSlinky.colorConvert.colorConvertStrings.sienna
    - typingsSlinky.colorConvert.colorConvertStrings.lightsalmon
    - typingsSlinky.colorConvert.colorConvertStrings.mediumseagreen
    - typingsSlinky.colorConvert.colorConvertStrings.blue
    - typingsSlinky.colorConvert.colorConvertStrings.lightsteelblue
    - typingsSlinky.colorConvert.colorConvertStrings.lightgoldenrodyellow
    - typingsSlinky.colorConvert.colorConvertStrings.mediumpurple
    - typingsSlinky.colorConvert.colorConvertStrings.maroon
    - typingsSlinky.colorConvert.colorConvertStrings.slategrey
    - typingsSlinky.colorConvert.colorConvertStrings.darkgoldenrod
    - typingsSlinky.colorConvert.colorConvertStrings.violet
    - typingsSlinky.colorConvert.colorConvertStrings.darkolivegreen
    - typingsSlinky.colorConvert.colorConvertStrings.springgreen
    - typingsSlinky.colorConvert.colorConvertStrings.oldlace
    - typingsSlinky.colorConvert.colorConvertStrings.forestgreen
    - typingsSlinky.colorConvert.colorConvertStrings.goldenrod
    - typingsSlinky.colorConvert.colorConvertStrings.coral
    - typingsSlinky.colorConvert.colorConvertStrings.aquamarine
    - typingsSlinky.colorConvert.colorConvertStrings.mintcream
    - typingsSlinky.colorConvert.colorConvertStrings.snow
    - typingsSlinky.colorConvert.colorConvertStrings.lightseagreen
    - typingsSlinky.colorConvert.colorConvertStrings.seashell
    - typingsSlinky.colorConvert.colorConvertStrings.palevioletred
    - typingsSlinky.colorConvert.colorConvertStrings.darkcyan
    - typingsSlinky.colorConvert.colorConvertStrings.aliceblue
    - typingsSlinky.colorConvert.colorConvertStrings.linen
    - typingsSlinky.colorConvert.colorConvertStrings.wheat
    - typingsSlinky.colorConvert.colorConvertStrings.mediumturquoise
    - typingsSlinky.colorConvert.colorConvertStrings.crimson
    - typingsSlinky.colorConvert.colorConvertStrings.dodgerblue
    - typingsSlinky.colorConvert.colorConvertStrings.yellowgreen
    - typingsSlinky.colorConvert.colorConvertStrings.firebrick
    - typingsSlinky.colorConvert.colorConvertStrings.burlywood
    - typingsSlinky.colorConvert.colorConvertStrings.darkviolet
    - typingsSlinky.colorConvert.colorConvertStrings.gray
    - typingsSlinky.colorConvert.colorConvertStrings.mediumorchid
    - typingsSlinky.colorConvert.colorConvertStrings.navy
    - typingsSlinky.colorConvert.colorConvertStrings.azure
    - typingsSlinky.colorConvert.colorConvertStrings.mediumslateblue
    - typingsSlinky.colorConvert.colorConvertStrings.fuchsia
    - typingsSlinky.colorConvert.colorConvertStrings.papayawhip
    - typingsSlinky.colorConvert.colorConvertStrings.lemonchiffon
    - typingsSlinky.colorConvert.colorConvertStrings.orangered
    - typingsSlinky.colorConvert.colorConvertStrings.lightskyblue
    - typingsSlinky.colorConvert.colorConvertStrings.mistyrose
    - typingsSlinky.colorConvert.colorConvertStrings.lightgreen
    - typingsSlinky.colorConvert.colorConvertStrings.royalblue
    - typingsSlinky.colorConvert.colorConvertStrings.antiquewhite
    - typingsSlinky.colorConvert.colorConvertStrings.grey
    - typingsSlinky.colorConvert.colorConvertStrings.tan
    - typingsSlinky.colorConvert.colorConvertStrings.brown
    - typingsSlinky.colorConvert.colorConvertStrings.chartreuse
    - typingsSlinky.colorConvert.colorConvertStrings.gainsboro
    - typingsSlinky.colorConvert.colorConvertStrings.pink
    - typingsSlinky.colorConvert.colorConvertStrings.lightcoral
    - typingsSlinky.colorConvert.colorConvertStrings.lightgray
    - typingsSlinky.colorConvert.colorConvertStrings.darkgreen
    - typingsSlinky.colorConvert.colorConvertStrings.lawngreen
    - typingsSlinky.colorConvert.colorConvertStrings.blueviolet
    - typingsSlinky.colorConvert.colorConvertStrings.steelblue
    - typingsSlinky.colorConvert.colorConvertStrings.slategray
    - typingsSlinky.colorConvert.colorConvertStrings.ghostwhite
    - typingsSlinky.colorConvert.colorConvertStrings.greenyellow
    - typingsSlinky.colorConvert.colorConvertStrings.palegoldenrod
    - typingsSlinky.colorConvert.colorConvertStrings.darkturquoise
    - typingsSlinky.colorConvert.colorConvertStrings.deeppink
    - typingsSlinky.colorConvert.colorConvertStrings.whitesmoke
    - typingsSlinky.colorConvert.colorConvertStrings.thistle
    - typingsSlinky.colorConvert.colorConvertStrings.paleturquoise
    - typingsSlinky.colorConvert.colorConvertStrings.white
    - typingsSlinky.colorConvert.colorConvertStrings.plum
    - typingsSlinky.colorConvert.colorConvertStrings.blanchedalmond
    - typingsSlinky.colorConvert.colorConvertStrings.orange
    - typingsSlinky.colorConvert.colorConvertStrings.deepskyblue
    - typingsSlinky.colorConvert.colorConvertStrings.darkkhaki
    - typingsSlinky.colorConvert.colorConvertStrings.mediumvioletred
    - typingsSlinky.colorConvert.colorConvertStrings.silver
    - typingsSlinky.colorConvert.colorConvertStrings.peru
    - typingsSlinky.colorConvert.colorConvertStrings.slateblue
    - typingsSlinky.colorConvert.colorConvertStrings.cornflowerblue
    - typingsSlinky.colorConvert.colorConvertStrings.floralwhite
    - typingsSlinky.colorConvert.colorConvertStrings.darksalmon
    - typingsSlinky.colorConvert.colorConvertStrings.mediumaquamarine
    - typingsSlinky.colorConvert.colorConvertStrings.turquoise
    - typingsSlinky.colorConvert.colorConvertStrings.seagreen
    - typingsSlinky.colorConvert.colorConvertStrings.palegreen
    - typingsSlinky.colorConvert.colorConvertStrings.saddlebrown
    - typingsSlinky.colorConvert.colorConvertStrings.cyan
    - typingsSlinky.colorConvert.colorConvertStrings.peachpuff
    - typingsSlinky.colorConvert.colorConvertStrings.darkblue
    - typingsSlinky.colorConvert.colorConvertStrings.olivedrab
    - typingsSlinky.colorConvert.colorConvertStrings.powderblue
    - typingsSlinky.colorConvert.colorConvertStrings.orchid
    - typingsSlinky.colorConvert.colorConvertStrings.bisque
    - typingsSlinky.colorConvert.colorConvertStrings.dimgray
    - typingsSlinky.colorConvert.colorConvertStrings.navajowhite
    - typingsSlinky.colorConvert.colorConvertStrings.teal
    - typingsSlinky.colorConvert.colorConvertStrings.rebeccapurple
    - typingsSlinky.colorConvert.colorConvertStrings.indigo
    - typingsSlinky.colorConvert.colorConvertStrings.lime
    - typingsSlinky.colorConvert.colorConvertStrings.gold
    - typingsSlinky.colorConvert.colorConvertStrings.dimgrey
    - typingsSlinky.colorConvert.colorConvertStrings.cornsilk
    - typingsSlinky.colorConvert.colorConvertStrings.tomato
    - typingsSlinky.colorConvert.colorConvertStrings.olive
    - typingsSlinky.colorConvert.colorConvertStrings.lightslategrey
    - typingsSlinky.colorConvert.colorConvertStrings.yellow
  */
  trait KEYWORD_ extends StObject
  
  type LAB_ = js.Tuple3[Double, Double, Double]
  
  type LCH_ = js.Tuple3[Double, Double, Double]
  
  type RGB_ = js.Tuple3[Double, Double, Double]
  
  type XYZ_ = js.Tuple3[Double, Double, Double]
}
