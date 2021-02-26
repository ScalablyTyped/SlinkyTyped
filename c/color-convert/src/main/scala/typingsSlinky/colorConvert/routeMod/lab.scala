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
trait lab extends StObject {
  
  def ansi16(from: LAB_): ANSI16_ = js.native
  
  def ansi256(from: LAB_): ANSI256_ = js.native
  
  def apple(from: LAB_): APPLE_ = js.native
  
  def cmyk(from: LAB_): CMYK_ = js.native
  
  def gray(from: LAB_): GRAY_ = js.native
  
  def hcg(from: LAB_): HCG_ = js.native
  
  def hex(from: LAB_): HEX_ = js.native
  
  def hsl(from: LAB_): HSL_ = js.native
  
  def hsv(from: LAB_): HSV_ = js.native
  
  def hwb(from: LAB_): HWB_ = js.native
  
  def keyword(from: LAB_): KEYWORD_ = js.native
  
  def lch(from: LAB_): LCH_ = js.native
  
  def rgb(from: LAB_): RGB_ = js.native
  
  def xyz(from: LAB_): XYZ_ = js.native
}
object lab {
  
  @scala.inline
  def apply(
    ansi16: LAB_ => ANSI16_,
    ansi256: LAB_ => ANSI256_,
    apple: LAB_ => APPLE_,
    cmyk: LAB_ => CMYK_,
    gray: LAB_ => GRAY_,
    hcg: LAB_ => HCG_,
    hex: LAB_ => HEX_,
    hsl: LAB_ => HSL_,
    hsv: LAB_ => HSV_,
    hwb: LAB_ => HWB_,
    keyword: LAB_ => KEYWORD_,
    lch: LAB_ => LCH_,
    rgb: LAB_ => RGB_,
    xyz: LAB_ => XYZ_
  ): lab = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[lab]
  }
  
  @scala.inline
  implicit class labMutableBuilder[Self <: lab] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnsi16(value: LAB_ => ANSI16_): Self = StObject.set(x, "ansi16", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnsi256(value: LAB_ => ANSI256_): Self = StObject.set(x, "ansi256", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApple(value: LAB_ => APPLE_): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCmyk(value: LAB_ => CMYK_): Self = StObject.set(x, "cmyk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGray(value: LAB_ => GRAY_): Self = StObject.set(x, "gray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHcg(value: LAB_ => HCG_): Self = StObject.set(x, "hcg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHex(value: LAB_ => HEX_): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsl(value: LAB_ => HSL_): Self = StObject.set(x, "hsl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsv(value: LAB_ => HSV_): Self = StObject.set(x, "hsv", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHwb(value: LAB_ => HWB_): Self = StObject.set(x, "hwb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyword(value: LAB_ => KEYWORD_): Self = StObject.set(x, "keyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLch(value: LAB_ => LCH_): Self = StObject.set(x, "lch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRgb(value: LAB_ => RGB_): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXyz(value: LAB_ => XYZ_): Self = StObject.set(x, "xyz", js.Any.fromFunction1(value))
  }
}
