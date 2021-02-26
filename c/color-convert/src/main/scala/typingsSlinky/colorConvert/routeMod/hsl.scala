package typingsSlinky.colorConvert.routeMod

import typingsSlinky.colorConvert.conversionsMod.ANSI16_
import typingsSlinky.colorConvert.conversionsMod.ANSI256_
import typingsSlinky.colorConvert.conversionsMod.APPLE_
import typingsSlinky.colorConvert.conversionsMod.CMYK_
import typingsSlinky.colorConvert.conversionsMod.GRAY_
import typingsSlinky.colorConvert.conversionsMod.HCG_
import typingsSlinky.colorConvert.conversionsMod.HEX_
import typingsSlinky.colorConvert.conversionsMod.HSL_
import typingsSlinky.colorConvert.conversionsMod.HSV_
import typingsSlinky.colorConvert.conversionsMod.HWB_
import typingsSlinky.colorConvert.conversionsMod.KEYWORD_
import typingsSlinky.colorConvert.conversionsMod.LAB_
import typingsSlinky.colorConvert.conversionsMod.LCH_
import typingsSlinky.colorConvert.conversionsMod.RGB_
import typingsSlinky.colorConvert.conversionsMod.XYZ_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hsl extends StObject {
  
  def ansi16(from: HSL_): ANSI16_ = js.native
  
  def ansi256(from: HSL_): ANSI256_ = js.native
  
  def apple(from: HSL_): APPLE_ = js.native
  
  def cmyk(from: HSL_): CMYK_ = js.native
  
  def gray(from: HSL_): GRAY_ = js.native
  
  def hcg(from: HSL_): HCG_ = js.native
  
  def hex(from: HSL_): HEX_ = js.native
  
  def hsv(from: HSL_): HSV_ = js.native
  
  def hwb(from: HSL_): HWB_ = js.native
  
  def keyword(from: HSL_): KEYWORD_ = js.native
  
  def lab(from: HSL_): LAB_ = js.native
  
  def lch(from: HSL_): LCH_ = js.native
  
  def rgb(from: HSL_): RGB_ = js.native
  
  def xyz(from: HSL_): XYZ_ = js.native
}
object hsl {
  
  @scala.inline
  def apply(
    ansi16: HSL_ => ANSI16_,
    ansi256: HSL_ => ANSI256_,
    apple: HSL_ => APPLE_,
    cmyk: HSL_ => CMYK_,
    gray: HSL_ => GRAY_,
    hcg: HSL_ => HCG_,
    hex: HSL_ => HEX_,
    hsv: HSL_ => HSV_,
    hwb: HSL_ => HWB_,
    keyword: HSL_ => KEYWORD_,
    lab: HSL_ => LAB_,
    lch: HSL_ => LCH_,
    rgb: HSL_ => RGB_,
    xyz: HSL_ => XYZ_
  ): hsl = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[hsl]
  }
  
  @scala.inline
  implicit class hslMutableBuilder[Self <: hsl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnsi16(value: HSL_ => ANSI16_): Self = StObject.set(x, "ansi16", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnsi256(value: HSL_ => ANSI256_): Self = StObject.set(x, "ansi256", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApple(value: HSL_ => APPLE_): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCmyk(value: HSL_ => CMYK_): Self = StObject.set(x, "cmyk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGray(value: HSL_ => GRAY_): Self = StObject.set(x, "gray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHcg(value: HSL_ => HCG_): Self = StObject.set(x, "hcg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHex(value: HSL_ => HEX_): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsv(value: HSL_ => HSV_): Self = StObject.set(x, "hsv", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHwb(value: HSL_ => HWB_): Self = StObject.set(x, "hwb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyword(value: HSL_ => KEYWORD_): Self = StObject.set(x, "keyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLab(value: HSL_ => LAB_): Self = StObject.set(x, "lab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLch(value: HSL_ => LCH_): Self = StObject.set(x, "lch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRgb(value: HSL_ => RGB_): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXyz(value: HSL_ => XYZ_): Self = StObject.set(x, "xyz", js.Any.fromFunction1(value))
  }
}
