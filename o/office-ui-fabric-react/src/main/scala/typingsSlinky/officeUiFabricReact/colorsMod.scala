package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.interfacesMod.IColor
import typingsSlinky.officeUiFabricReact.interfacesMod.IHSL
import typingsSlinky.officeUiFabricReact.interfacesMod.IHSV
import typingsSlinky.officeUiFabricReact.interfacesMod.IRGB
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.a
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.b
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.g
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/utilities/color/colors", JSImport.Namespace)
@js.native
object colorsMod extends js.Object {
  
  val HEX_REGEX: js.RegExp = js.native
  
  val MAX_COLOR_ALPHA: /* 100 */ Double = js.native
  
  val MAX_COLOR_HUE: /* 359 */ Double = js.native
  
  val MAX_COLOR_RGB: /* 255 */ Double = js.native
  
  val MAX_COLOR_RGBA: /* 255 */ Double = js.native
  
  val MAX_COLOR_SATURATION: /* 100 */ Double = js.native
  
  val MAX_COLOR_VALUE: /* 100 */ Double = js.native
  
  val MAX_HEX_LENGTH: /* 6 */ Double = js.native
  
  val MAX_RGBA_LENGTH: /* 3 */ Double = js.native
  
  val MIN_HEX_LENGTH: /* 3 */ Double = js.native
  
  val MIN_RGBA_LENGTH: /* 1 */ Double = js.native
  
  val RGBA_REGEX: js.RegExp = js.native
  
  def clamp(value: Double, max: Double): Double = js.native
  def clamp(value: Double, max: Double, min: Double): Double = js.native
  
  def correctHSV(color: IHSV): IHSV = js.native
  
  def correctHex(hex: String): String = js.native
  
  def correctRGB(color: IRGB): IRGB = js.native
  
  def cssColor(): js.UndefOr[IRGB] = js.native
  def cssColor(color: String): js.UndefOr[IRGB] = js.native
  
  def getColorFromHSV(hsv: IHSV): IColor = js.native
  def getColorFromHSV(hsv: IHSV, a: Double): IColor = js.native
  
  def getColorFromRGBA(rgba: IRGB): IColor = js.native
  
  def getColorFromString(inputColor: String): js.UndefOr[IColor] = js.native
  
  def getFullColorString(color: IColor): String = js.native
  
  def hsl2hsv(h: Double, s: Double, l: Double): IHSV = js.native
  
  def hsl2rgb(h: Double, s: Double, l: Double): IRGB = js.native
  
  def hsv2hex(h: Double, s: Double, v: Double): String = js.native
  
  def hsv2hsl(h: Double, s: Double, v: Double): IHSL = js.native
  
  def hsv2rgb(h: Double, s: Double, v: Double): IRGB = js.native
  
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
}
