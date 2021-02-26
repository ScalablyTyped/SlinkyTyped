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
trait keyword extends StObject {
  
  def ansi16(from: KEYWORD_): ANSI16_ = js.native
  
  def ansi256(from: KEYWORD_): ANSI256_ = js.native
  
  def apple(from: KEYWORD_): APPLE_ = js.native
  
  def cmyk(from: KEYWORD_): CMYK_ = js.native
  
  def gray(from: KEYWORD_): GRAY_ = js.native
  
  def hcg(from: KEYWORD_): HCG_ = js.native
  
  def hex(from: KEYWORD_): HEX_ = js.native
  
  def hsl(from: KEYWORD_): HSL_ = js.native
  
  def hsv(from: KEYWORD_): HSV_ = js.native
  
  def hwb(from: KEYWORD_): HWB_ = js.native
  
  def lab(from: KEYWORD_): LAB_ = js.native
  
  def lch(from: KEYWORD_): LCH_ = js.native
  
  def rgb(from: KEYWORD_): RGB_ = js.native
  
  def xyz(from: KEYWORD_): XYZ_ = js.native
}
object keyword {
  
  @scala.inline
  implicit class keywordMutableBuilder[Self <: keyword] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnsi16(value: KEYWORD_ => ANSI16_): Self = StObject.set(x, "ansi16", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnsi256(value: KEYWORD_ => ANSI256_): Self = StObject.set(x, "ansi256", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApple(value: KEYWORD_ => APPLE_): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCmyk(value: KEYWORD_ => CMYK_): Self = StObject.set(x, "cmyk", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGray(value: KEYWORD_ => GRAY_): Self = StObject.set(x, "gray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHcg(value: KEYWORD_ => HCG_): Self = StObject.set(x, "hcg", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHex(value: KEYWORD_ => HEX_): Self = StObject.set(x, "hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsl(value: KEYWORD_ => HSL_): Self = StObject.set(x, "hsl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsv(value: KEYWORD_ => HSV_): Self = StObject.set(x, "hsv", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHwb(value: KEYWORD_ => HWB_): Self = StObject.set(x, "hwb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLab(value: KEYWORD_ => LAB_): Self = StObject.set(x, "lab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLch(value: KEYWORD_ => LCH_): Self = StObject.set(x, "lch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRgb(value: KEYWORD_ => RGB_): Self = StObject.set(x, "rgb", js.Any.fromFunction1(value))
    
    @scala.inline
    def setXyz(value: KEYWORD_ => XYZ_): Self = StObject.set(x, "xyz", js.Any.fromFunction1(value))
  }
}
