package typingsSlinky.colorDashConvert

import typingsSlinky.colorDashConvert.colorDashConvertNumbers.`3`
import typingsSlinky.colorDashConvert.colorDashConvertStrings.c
import typingsSlinky.colorDashConvert.colorDashConvertStrings.g
import typingsSlinky.colorDashConvert.colorDashConvertStrings.h
import typingsSlinky.colorDashConvert.conversionsMod.HCG
import typingsSlinky.colorDashConvert.conversionsMod.HSL
import typingsSlinky.colorDashConvert.conversionsMod.HSV
import typingsSlinky.colorDashConvert.conversionsMod.HWB
import typingsSlinky.colorDashConvert.conversionsMod.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhcg extends js.Object {
  val channels: `3`
  val labels: js.Tuple3[h, c, g]
  def hsl(hcg: HCG): HSL
  def hsv(hcg: HCG): HSV
  def hwb(hcg: HCG): HWB
  def rgb(hcg: HCG): RGB
}

object Typeofhcg {
  @scala.inline
  def apply(
    channels: `3`,
    hsl: HCG => HSL,
    hsv: HCG => HSV,
    hwb: HCG => HWB,
    labels: js.Tuple3[h, c, g],
    rgb: HCG => RGB
  ): Typeofhcg = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], hsl = js.Any.fromFunction1(hsl), hsv = js.Any.fromFunction1(hsv), hwb = js.Any.fromFunction1(hwb), labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofhcg]
  }
}

