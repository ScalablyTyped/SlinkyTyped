package typingsSlinky.ctrlTinycolor

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.ctrlTinycolor.anon.A
import typingsSlinky.ctrlTinycolor.anon.FnCall
import typingsSlinky.ctrlTinycolor.anon.PartialTinyColorOptions
import typingsSlinky.ctrlTinycolor.distMod.ColorInput
import typingsSlinky.ctrlTinycolor.distMod.TinyColor_
import typingsSlinky.ctrlTinycolor.fromRatioMod.RatioInput
import typingsSlinky.ctrlTinycolor.interfacesMod.HSL
import typingsSlinky.ctrlTinycolor.interfacesMod.HSLA
import typingsSlinky.ctrlTinycolor.interfacesMod.HSV
import typingsSlinky.ctrlTinycolor.interfacesMod.HSVA
import typingsSlinky.ctrlTinycolor.interfacesMod.RGB
import typingsSlinky.ctrlTinycolor.interfacesMod.RGBA
import typingsSlinky.ctrlTinycolor.randomMod.RandomCountOptions
import typingsSlinky.ctrlTinycolor.randomMod.RandomOptions
import typingsSlinky.ctrlTinycolor.readabilityMod.WCAG2FallbackParms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ctrl/tinycolor/dist/umd_api", JSImport.Namespace)
@js.native
object umdApiMod extends js.Object {
  
  @js.native
  trait TinyColorUMD extends js.Object {
    
    def apply(): TinyColor_ = js.native
    
    var TinyColor: Instantiable2[
        /* color */ js.UndefOr[ColorInput], 
        /* opts */ js.UndefOr[PartialTinyColorOptions], 
        TinyColor_
      ] = js.native
    
    def fromRatio(ratio: RatioInput): TinyColor_ = js.native
    def fromRatio(ratio: RatioInput, opts: js.Any): TinyColor_ = js.native
    @JSName("fromRatio")
    var fromRatio_Original: js.Function2[/* ratio */ RatioInput, /* opts */ js.UndefOr[js.Any], TinyColor_] = js.native
    
    def inputToRGB(color: String): A = js.native
    def inputToRGB(color: js.Any): A = js.native
    def inputToRGB(color: HSL): A = js.native
    def inputToRGB(color: HSLA): A = js.native
    def inputToRGB(color: HSV): A = js.native
    def inputToRGB(color: HSVA): A = js.native
    def inputToRGB(color: RGB): A = js.native
    def inputToRGB(color: RGBA): A = js.native
    @JSName("inputToRGB")
    var inputToRGB_Original: js.Function1[/* color */ String | RGB | RGBA | HSL | HSLA | HSV | HSVA | js.Any, A] = js.native
    
    def isValidCSSUnit(color: String): Boolean = js.native
    def isValidCSSUnit(color: Double): Boolean = js.native
    @JSName("isValidCSSUnit")
    var isValidCSSUnit_Original: js.Function1[/* color */ String | Double, Boolean] = js.native
    
    def legacyRandom(): TinyColor_ = js.native
    @JSName("legacyRandom")
    var legacyRandom_Original: js.Function0[TinyColor_] = js.native
    
    def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput]): TinyColor_ | Null = js.native
    def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput], args: WCAG2FallbackParms): TinyColor_ | Null = js.native
    @JSName("mostReadable")
    var mostReadable_Original: js.Function3[
        /* baseColor */ ColorInput, 
        /* colorList */ js.Array[ColorInput], 
        /* args */ js.UndefOr[WCAG2FallbackParms], 
        TinyColor_ | Null
      ] = js.native
    
    var names: StringDictionary[String] = js.native
    
    def random(): TinyColor_ = js.native
    def random(options: RandomCountOptions): js.Array[TinyColor_] = js.native
    def random(options: RandomOptions): TinyColor_ = js.native
    @JSName("random")
    def random_Array(): js.Array[TinyColor_] = js.native
    @JSName("random")
    var random_Original: FnCall = js.native
    
    def readability(color1: ColorInput, color2: ColorInput): Double = js.native
    @JSName("readability")
    var readability_Original: js.Function2[/* color1 */ ColorInput, /* color2 */ ColorInput, Double] = js.native
    
    def stringInputToObject(color: String): js.Any = js.native
    @JSName("stringInputToObject")
    var stringInputToObject_Original: js.Function1[/* color */ String, _] = js.native
    
    def toMsFilter(firstColor: ColorInput): String = js.native
    def toMsFilter(firstColor: ColorInput, secondColor: ColorInput): String = js.native
    @JSName("toMsFilter")
    var toMsFilter_Original: js.Function2[/* firstColor */ ColorInput, /* secondColor */ js.UndefOr[ColorInput], String] = js.native
  }
  
  @js.native
  object default extends TopLevel[TinyColorUMD] {
    
    @js.native
    class TinyColor () extends TinyColor_ {
      def this(color: ColorInput) = this()
      def this(color: js.UndefOr[ColorInput], opts: PartialTinyColorOptions) = this()
    }
  }
}
