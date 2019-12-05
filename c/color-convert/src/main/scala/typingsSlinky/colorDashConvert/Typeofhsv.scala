package typingsSlinky.colorDashConvert

import typingsSlinky.colorDashConvert.colorDashConvertNumbers.`3`
import typingsSlinky.colorDashConvert.colorDashConvertStrings.hsv
import typingsSlinky.colorDashConvert.conversionsMod.ANSI16
import typingsSlinky.colorDashConvert.conversionsMod.HCG
import typingsSlinky.colorDashConvert.conversionsMod.HSL
import typingsSlinky.colorDashConvert.conversionsMod.HSV
import typingsSlinky.colorDashConvert.conversionsMod.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhsv extends js.Object {
  val channels: `3`
  val labels: hsv
  def ansi16(hsv: HSV): ANSI16
  def hcg(hsv: HSV): HCG
  def hsl(hsv: HSV): HSL
  def rgb(hsv: HSV): RGB
}

object Typeofhsv {
  @scala.inline
  def apply(
    ansi16: HSV => ANSI16,
    channels: `3`,
    hcg: HSV => HCG,
    hsl: HSV => HSL,
    labels: hsv,
    rgb: HSV => RGB
  ): Typeofhsv = {
    val __obj = js.Dynamic.literal(ansi16 = js.Any.fromFunction1(ansi16), channels = channels.asInstanceOf[js.Any], hcg = js.Any.fromFunction1(hcg), hsl = js.Any.fromFunction1(hsl), labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofhsv]
  }
}

