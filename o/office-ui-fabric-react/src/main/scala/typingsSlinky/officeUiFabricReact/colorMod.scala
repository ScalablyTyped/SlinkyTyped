package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.interfacesMod.IColor
import typingsSlinky.officeUiFabricReact.interfacesMod.IHSL
import typingsSlinky.officeUiFabricReact.interfacesMod.IHSV
import typingsSlinky.officeUiFabricReact.interfacesMod.IRGB
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`100`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`1`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`255`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`359`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`3`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactNumbers.`6`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.a
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.b
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.g
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.r
import typingsSlinky.officeUiFabricReact.shadesMod.Shade
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/color", JSImport.Namespace)
@js.native
object colorMod extends js.Object {
  val HEX_REGEX: js.RegExp = js.native
  val MAX_COLOR_ALPHA: `100` = js.native
  val MAX_COLOR_HUE: `359` = js.native
  val MAX_COLOR_RGB: `255` = js.native
  val MAX_COLOR_RGBA: `255` = js.native
  val MAX_COLOR_SATURATION: `100` = js.native
  val MAX_COLOR_VALUE: `100` = js.native
  val MAX_HEX_LENGTH: `6` = js.native
  val MAX_RGBA_LENGTH: `3` = js.native
  val MIN_HEX_LENGTH: `3` = js.native
  val MIN_RGBA_LENGTH: `1` = js.native
  val RGBA_REGEX: js.RegExp = js.native
  def clamp(value: Double, max: Double): Double = js.native
  def clamp(value: Double, max: Double, min: Double): Double = js.native
  def correctHSV(color: IHSV): IHSV = js.native
  def correctHex(hex: String): String = js.native
  def correctRGB(color: IRGB): IRGB = js.native
  def cssColor(): js.UndefOr[IRGB] = js.native
  def cssColor(color: String): js.UndefOr[IRGB] = js.native
  def getBackgroundShade(color: IColor, shade: Shade): IColor | Null = js.native
  def getBackgroundShade(color: IColor, shade: Shade, isInverted: Boolean): IColor | Null = js.native
  def getColorFromHSV(hsv: IHSV): IColor = js.native
  def getColorFromHSV(hsv: IHSV, a: Double): IColor = js.native
  def getColorFromRGBA(rgba: IRGB): IColor = js.native
  def getColorFromString(inputColor: String): js.UndefOr[IColor] = js.native
  def getContrastRatio(color1: IColor, color2: IColor): Double = js.native
  def getFullColorString(color: IColor): String = js.native
  def getShade(color: IColor, shade: Shade): IColor | Null = js.native
  def getShade(color: IColor, shade: Shade, isInverted: Boolean): IColor | Null = js.native
  def hsl2hsv(h: Double, s: Double, l: Double): IHSV = js.native
  def hsl2rgb(h: Double, s: Double, l: Double): IRGB = js.native
  def hsv2hex(h: Double, s: Double, v: Double): String = js.native
  def hsv2hsl(h: Double, s: Double, v: Double): IHSL = js.native
  def hsv2rgb(h: Double, s: Double, v: Double): IRGB = js.native
  def isDark(color: IColor): Boolean = js.native
  def isValidShade(): Boolean = js.native
  def isValidShade(shade: Shade): Boolean = js.native
  def rgb2hex(r: Double, g: Double, b: Double): String = js.native
  def rgb2hsv(r: Double, g: Double, b: Double): IHSV = js.native
  def updateA(color: IColor, a: Double): IColor = js.native
  def updateH(color: IColor, h: Double): IColor = js.native
  @JSName("updateRGB")
  def updateRGB_a(color: IColor, component: a, value: Double): IColor = js.native
  @JSName("updateRGB")
  def updateRGB_b(color: IColor, component: b, value: Double): IColor = js.native
  @JSName("updateRGB")
  def updateRGB_g(color: IColor, component: g, value: Double): IColor = js.native
  @JSName("updateRGB")
  def updateRGB_r(color: IColor, component: r, value: Double): IColor = js.native
  def updateSV(color: IColor, s: Double, v: Double): IColor = js.native
  @js.native
  object Shade extends js.Object {
    /* 1 */ val Shade1: typingsSlinky.officeUiFabricReact.shadesMod.Shade.Shade1 with Double = js.native
    /* 2 */ val Shade2: typingsSlinky.officeUiFabricReact.shadesMod.Shade.Shade2 with Double = js.native
    /* 3 */ val Shade3: typingsSlinky.officeUiFabricReact.shadesMod.Shade.Shade3 with Double = js.native
    /* 4 */ val Shade4: typingsSlinky.officeUiFabricReact.shadesMod.Shade.Shade4 with Double = js.native
    /* 5 */ val Shade5: typingsSlinky.officeUiFabricReact.shadesMod.Shade.Shade5 with Double = js.native
    /* 6 */ val Shade6: typingsSlinky.officeUiFabricReact.shadesMod.Shade.Shade6 with Double = js.native
    /* 7 */ val Shade7: typingsSlinky.officeUiFabricReact.shadesMod.Shade.Shade7 with Double = js.native
    /* 8 */ val Shade8: typingsSlinky.officeUiFabricReact.shadesMod.Shade.Shade8 with Double = js.native
    /* 0 */ val Unshaded: typingsSlinky.officeUiFabricReact.shadesMod.Shade.Unshaded with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.shadesMod.Shade with Double] = js.native
  }
  
}

