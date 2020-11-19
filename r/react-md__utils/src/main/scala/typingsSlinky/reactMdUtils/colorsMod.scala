package typingsSlinky.reactMdUtils

import typingsSlinky.reactMdUtils.hexToRGBMod.BlueBit
import typingsSlinky.reactMdUtils.hexToRGBMod.GreenBit
import typingsSlinky.reactMdUtils.hexToRGBMod.HexString
import typingsSlinky.reactMdUtils.hexToRGBMod.RedBit
import typingsSlinky.reactMdUtils.isContrastCompliantMod.ContrastRatioCompliance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/colors", JSImport.Namespace)
@js.native
object colorsMod extends js.Object {
  
  def getContrastRatio(background: HexString, foreground: HexString): Double = js.native
  
  def hexToRGB(hex: HexString): js.Tuple3[RedBit, GreenBit, BlueBit] = js.native
  
  def isContrastCompliant(background: HexString, foreground: HexString): Boolean = js.native
  def isContrastCompliant(background: HexString, foreground: HexString, compliance: Double): Boolean = js.native
  def isContrastCompliant(background: HexString, foreground: HexString, compliance: ContrastRatioCompliance): Boolean = js.native
}
