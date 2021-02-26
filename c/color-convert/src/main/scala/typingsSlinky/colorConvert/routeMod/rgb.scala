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
trait rgb extends StObject {
  
  def ansi16(from: RGB_): ANSI16_ = js.native
  
  def ansi256(from: RGB_): ANSI256_ = js.native
  
  def apple(from: RGB_): APPLE_ = js.native
  
  def cmyk(from: RGB_): CMYK_ = js.native
  
  def gray(from: RGB_): GRAY_ = js.native
  
  def hcg(from: RGB_): HCG_ = js.native
  
  def hex(from: RGB_): HEX_ = js.native
  
  def hsl(from: RGB_): HSL_ = js.native
  
  def hsv(from: RGB_): HSV_ = js.native
  
  def hwb(from: RGB_): HWB_ = js.native
  
  def keyword(from: RGB_): KEYWORD_ = js.native
  
  def lab(from: RGB_): LAB_ = js.native
  
  def lch(from: RGB_): LCH_ = js.native
  
  def xyz(from: RGB_): XYZ_ = js.native
}
object rgb {
  
  @scala.inline
  def apply(
    ansi16: RGB_ => ANSI16_,
    ansi256: RGB_ => ANSI256_,
    apple: RGB_ => APPLE_,
    cmyk: RGB_ => CMYK_,
    gray: RGB_ => GRAY_,
    hcg: RGB_ => HCG_,
    hex: RGB_ => HEX_,
    hsl: RGB_ => HSL_,
    hsv: RGB_ => HSV_,
    hwb: RGB_ => HWB_,
    keyword: RGB_ => KEYWORD_,
    lab: RGB_ => LAB_,
    lch: RGB_ => LCH_,
    xyz: RGB_ => XYZ_
  ): rgb = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[rgb]
  }
  
  @scala.inline
  implicit class rgbMutableBuilder[Self <: rgb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnsi16(value: RGB_ => ANSI16_): Self = StObject.set(x, "ansi16", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnsi256(value: RGB_ => ANSI256_): Self = StObject.set(x, "ansi256", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApple(value: RGB_ => APPLE_): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCmyk(value: RGB_ => CMYK_): Self = StObject.set(x, "cmyk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGray(value: RGB_ => GRAY_): Self = StObject.set(x, "gray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHcg(value: RGB_ => HCG_): Self = StObject.set(x, "hcg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHex(value: RGB_ => HEX_): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsl(value: RGB_ => HSL_): Self = StObject.set(x, "hsl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsv(value: RGB_ => HSV_): Self = StObject.set(x, "hsv", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHwb(value: RGB_ => HWB_): Self = StObject.set(x, "hwb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyword(value: RGB_ => KEYWORD_): Self = StObject.set(x, "keyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLab(value: RGB_ => LAB_): Self = StObject.set(x, "lab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLch(value: RGB_ => LCH_): Self = StObject.set(x, "lch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXyz(value: RGB_ => XYZ_): Self = StObject.set(x, "xyz", js.Any.fromFunction1(value))
  }
}
