package typingsSlinky.ctrlTinycolor

import typingsSlinky.ctrlTinycolor.anon.A
import typingsSlinky.ctrlTinycolor.anon.PartialTinyColorOptions
import typingsSlinky.ctrlTinycolor.distMod.ColorInput
import typingsSlinky.ctrlTinycolor.fromRatioMod.RatioInput
import typingsSlinky.ctrlTinycolor.interfacesMod.HSL
import typingsSlinky.ctrlTinycolor.interfacesMod.HSLA
import typingsSlinky.ctrlTinycolor.interfacesMod.HSV
import typingsSlinky.ctrlTinycolor.interfacesMod.HSVA
import typingsSlinky.ctrlTinycolor.interfacesMod.RGB
import typingsSlinky.ctrlTinycolor.interfacesMod.RGBA
import typingsSlinky.ctrlTinycolor.randomMod.ColorBound
import typingsSlinky.ctrlTinycolor.randomMod.RandomCountOptions
import typingsSlinky.ctrlTinycolor.randomMod.RandomOptions
import typingsSlinky.ctrlTinycolor.readabilityMod.WCAG2FallbackParms
import typingsSlinky.ctrlTinycolor.readabilityMod.WCAG2Parms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ctrl/tinycolor", JSImport.Default)
  @js.native
  def default(): typingsSlinky.ctrlTinycolor.distMod.TinyColor_ = js.native
  @JSImport("@ctrl/tinycolor", JSImport.Default)
  @js.native
  def default(color: js.UndefOr[ColorInput], opts: PartialTinyColorOptions): typingsSlinky.ctrlTinycolor.distMod.TinyColor_ = js.native
  @JSImport("@ctrl/tinycolor", JSImport.Default)
  @js.native
  def default(color: ColorInput): typingsSlinky.ctrlTinycolor.distMod.TinyColor_ = js.native
  
  @JSImport("@ctrl/tinycolor", "TinyColor")
  @js.native
  class TinyColor_ ()
    extends typingsSlinky.ctrlTinycolor.distMod.TinyColor_ {
    def this(color: ColorInput) = this()
    def this(color: js.UndefOr[ColorInput], opts: PartialTinyColorOptions) = this()
  }
  
  @JSImport("@ctrl/tinycolor", "bounds")
  @js.native
  val bounds: js.Array[ColorBound] = js.native
  
  @JSImport("@ctrl/tinycolor", "fromRatio")
  @js.native
  def fromRatio(ratio: RatioInput): typingsSlinky.ctrlTinycolor.distMod.TinyColor_ = js.native
  @JSImport("@ctrl/tinycolor", "fromRatio")
  @js.native
  def fromRatio(ratio: RatioInput, opts: js.Any): typingsSlinky.ctrlTinycolor.distMod.TinyColor_ = js.native
  
  @JSImport("@ctrl/tinycolor", "inputToRGB")
  @js.native
  def inputToRGB(color: String): A = js.native
  @JSImport("@ctrl/tinycolor", "inputToRGB")
  @js.native
  def inputToRGB(color: js.Any): A = js.native
  @JSImport("@ctrl/tinycolor", "inputToRGB")
  @js.native
  def inputToRGB(color: HSL): A = js.native
  @JSImport("@ctrl/tinycolor", "inputToRGB")
  @js.native
  def inputToRGB(color: HSLA): A = js.native
  @JSImport("@ctrl/tinycolor", "inputToRGB")
  @js.native
  def inputToRGB(color: HSV): A = js.native
  @JSImport("@ctrl/tinycolor", "inputToRGB")
  @js.native
  def inputToRGB(color: HSVA): A = js.native
  @JSImport("@ctrl/tinycolor", "inputToRGB")
  @js.native
  def inputToRGB(color: RGB): A = js.native
  @JSImport("@ctrl/tinycolor", "inputToRGB")
  @js.native
  def inputToRGB(color: RGBA): A = js.native
  
  @JSImport("@ctrl/tinycolor", "isReadable")
  @js.native
  def isReadable(color1: ColorInput, color2: ColorInput): Boolean = js.native
  @JSImport("@ctrl/tinycolor", "isReadable")
  @js.native
  def isReadable(color1: ColorInput, color2: ColorInput, wcag2: WCAG2Parms): Boolean = js.native
  
  @JSImport("@ctrl/tinycolor", "isValidCSSUnit")
  @js.native
  def isValidCSSUnit(color: String): Boolean = js.native
  @JSImport("@ctrl/tinycolor", "isValidCSSUnit")
  @js.native
  def isValidCSSUnit(color: Double): Boolean = js.native
  
  @JSImport("@ctrl/tinycolor", "legacyRandom")
  @js.native
  def legacyRandom(): typingsSlinky.ctrlTinycolor.distMod.TinyColor_ = js.native
  
  @JSImport("@ctrl/tinycolor", "mostReadable")
  @js.native
  def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput]): typingsSlinky.ctrlTinycolor.distMod.TinyColor_ | Null = js.native
  @JSImport("@ctrl/tinycolor", "mostReadable")
  @js.native
  def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput], args: WCAG2FallbackParms): typingsSlinky.ctrlTinycolor.distMod.TinyColor_ | Null = js.native
  
  @JSImport("@ctrl/tinycolor", "random")
  @js.native
  def random(): typingsSlinky.ctrlTinycolor.distMod.TinyColor_ = js.native
  @JSImport("@ctrl/tinycolor", "random")
  @js.native
  def random(options: RandomCountOptions): js.Array[typingsSlinky.ctrlTinycolor.distMod.TinyColor_] = js.native
  @JSImport("@ctrl/tinycolor", "random")
  @js.native
  def random(options: RandomOptions): typingsSlinky.ctrlTinycolor.distMod.TinyColor_ = js.native
  @JSImport("@ctrl/tinycolor", "random")
  @js.native
  def random_Array(): js.Array[typingsSlinky.ctrlTinycolor.distMod.TinyColor_] = js.native
  
  @JSImport("@ctrl/tinycolor", "readability")
  @js.native
  def readability(color1: ColorInput, color2: ColorInput): Double = js.native
  
  @JSImport("@ctrl/tinycolor", "stringInputToObject")
  @js.native
  def stringInputToObject(color: String): js.Any = js.native
  
  @JSImport("@ctrl/tinycolor", "tinycolor")
  @js.native
  def tinycolor(): typingsSlinky.ctrlTinycolor.distMod.TinyColor_ = js.native
  @JSImport("@ctrl/tinycolor", "tinycolor")
  @js.native
  def tinycolor(color: js.UndefOr[ColorInput], opts: PartialTinyColorOptions): typingsSlinky.ctrlTinycolor.distMod.TinyColor_ = js.native
  @JSImport("@ctrl/tinycolor", "tinycolor")
  @js.native
  def tinycolor(color: ColorInput): typingsSlinky.ctrlTinycolor.distMod.TinyColor_ = js.native
  
  @JSImport("@ctrl/tinycolor", "toMsFilter")
  @js.native
  def toMsFilter(firstColor: ColorInput): String = js.native
  @JSImport("@ctrl/tinycolor", "toMsFilter")
  @js.native
  def toMsFilter(firstColor: ColorInput, secondColor: ColorInput): String = js.native
}
