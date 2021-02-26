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
trait hsv extends StObject {
  
  def ansi16(from: HSV_): ANSI16_ = js.native
  
  def ansi256(from: HSV_): ANSI256_ = js.native
  
  def apple(from: HSV_): APPLE_ = js.native
  
  def cmyk(from: HSV_): CMYK_ = js.native
  
  def gray(from: HSV_): GRAY_ = js.native
  
  def hcg(from: HSV_): HCG_ = js.native
  
  def hex(from: HSV_): HEX_ = js.native
  
  def hsl(from: HSV_): HSL_ = js.native
  
  def hwb(from: HSV_): HWB_ = js.native
  
  def keyword(from: HSV_): KEYWORD_ = js.native
  
  def lab(from: HSV_): LAB_ = js.native
  
  def lch(from: HSV_): LCH_ = js.native
  
  def rgb(from: HSV_): RGB_ = js.native
  
  def xyz(from: HSV_): XYZ_ = js.native
}
object hsv {
  
  @scala.inline
  def apply(
    ansi16: HSV_ => ANSI16_,
    ansi256: HSV_ => ANSI256_,
    apple: HSV_ => APPLE_,
    cmyk: HSV_ => CMYK_,
    gray: HSV_ => GRAY_,
    hcg: HSV_ => HCG_,
    hex: HSV_ => HEX_,
    hsl: HSV_ => HSL_,
    hwb: HSV_ => HWB_,
    keyword: HSV_ => KEYWORD_,
    lab: HSV_ => LAB_,
    lch: HSV_ => LCH_,
    rgb: HSV_ => RGB_,
    xyz: HSV_ => XYZ_
  ): hsv = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), ansi256 = js.Any.fromFunction1(ansi256), apple = js.Any.fromFunction1(apple), cmyk = js.Any.fromFunction1(cmyk), gray = js.Any.fromFunction1(gray), hcg = js.Any.fromFunction1(hcg), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction1(hsl), hwb = js.Any.fromFunction1(hwb), keyword = js.Any.fromFunction1(keyword), lab = js.Any.fromFunction1(lab), lch = js.Any.fromFunction1(lch), rgb = js.Any.fromFunction1(rgb), xyz = js.Any.fromFunction1(xyz))
    __obj.asInstanceOf[hsv]
  }
  
  @scala.inline
  implicit class hsvMutableBuilder[Self <: hsv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnsi16(value: HSV_ => ANSI16_): Self = StObject.set(x, "ansi16", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnsi256(value: HSV_ => ANSI256_): Self = StObject.set(x, "ansi256", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApple(value: HSV_ => APPLE_): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCmyk(value: HSV_ => CMYK_): Self = StObject.set(x, "cmyk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGray(value: HSV_ => GRAY_): Self = StObject.set(x, "gray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHcg(value: HSV_ => HCG_): Self = StObject.set(x, "hcg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHex(value: HSV_ => HEX_): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsl(value: HSV_ => HSL_): Self = StObject.set(x, "hsl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHwb(value: HSV_ => HWB_): Self = StObject.set(x, "hwb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyword(value: HSV_ => KEYWORD_): Self = StObject.set(x, "keyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLab(value: HSV_ => LAB_): Self = StObject.set(x, "lab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLch(value: HSV_ => LCH_): Self = StObject.set(x, "lch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRgb(value: HSV_ => RGB_): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXyz(value: HSV_ => XYZ_): Self = StObject.set(x, "xyz", js.Any.fromFunction1(value))
  }
}
