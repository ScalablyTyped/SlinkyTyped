package typingsSlinky.colorConvert.conversionsMod

import typingsSlinky.colorConvert.colorConvertNumbers.`3`
import typingsSlinky.colorConvert.colorConvertStrings.c
import typingsSlinky.colorConvert.colorConvertStrings.g
import typingsSlinky.colorConvert.colorConvertStrings.h
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("color-convert/conversions", "hcg")
@js.native
object hcg extends js.Object {
  val channels: `3` = js.native
  val labels: js.Tuple3[h, c, g] = js.native
  def hsl(hcg: HCG_): HSL_ = js.native
  def hsv(hcg: HCG_): HSV_ = js.native
  def hwb(hcg: HCG_): HWB_ = js.native
  def rgb(hcg: HCG_): RGB_ = js.native
}

