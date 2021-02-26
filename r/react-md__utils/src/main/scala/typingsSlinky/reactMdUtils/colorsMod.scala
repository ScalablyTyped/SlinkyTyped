package typingsSlinky.reactMdUtils

import typingsSlinky.reactMdUtils.hexToRGBMod.BlueBit
import typingsSlinky.reactMdUtils.hexToRGBMod.GreenBit
import typingsSlinky.reactMdUtils.hexToRGBMod.HexString
import typingsSlinky.reactMdUtils.hexToRGBMod.RedBit
import typingsSlinky.reactMdUtils.isContrastCompliantMod.ContrastRatioCompliance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorsMod {
  
  @JSImport("@react-md/utils/types/colors", "AAA_CONTRAST_RATIO")
  @js.native
  val AAA_CONTRAST_RATIO: /* 7 */ Double = js.native
  
  @JSImport("@react-md/utils/types/colors", "LARGE_TEXT_CONTRAST_RATIO")
  @js.native
  val LARGE_TEXT_CONTRAST_RATIO: /* 3 */ Double = js.native
  
  @JSImport("@react-md/utils/types/colors", "NORMAL_TEXT_CONTRAST_RATIO")
  @js.native
  val NORMAL_TEXT_CONTRAST_RATIO: /* 4.5 */ Double = js.native
  
  @JSImport("@react-md/utils/types/colors", "getContrastRatio")
  @js.native
  def getContrastRatio(background: HexString, foreground: HexString): Double = js.native
  
  @JSImport("@react-md/utils/types/colors", "hexToRGB")
  @js.native
  def hexToRGB(hex: HexString): js.Tuple3[RedBit, GreenBit, BlueBit] = js.native
  
  @JSImport("@react-md/utils/types/colors", "isContrastCompliant")
  @js.native
  def isContrastCompliant(background: HexString, foreground: HexString): Boolean = js.native
  @JSImport("@react-md/utils/types/colors", "isContrastCompliant")
  @js.native
  def isContrastCompliant(background: HexString, foreground: HexString, compliance: Double): Boolean = js.native
  @JSImport("@react-md/utils/types/colors", "isContrastCompliant")
  @js.native
  def isContrastCompliant(background: HexString, foreground: HexString, compliance: ContrastRatioCompliance): Boolean = js.native
}
