package typingsSlinky.colorDashConvert

import typingsSlinky.colorDashConvert.colorDashConvertNumbers.`3`
import typingsSlinky.colorDashConvert.colorDashConvertStrings.hsl
import typingsSlinky.colorDashConvert.conversionsMod.HCG
import typingsSlinky.colorDashConvert.conversionsMod.HSL
import typingsSlinky.colorDashConvert.conversionsMod.HSV
import typingsSlinky.colorDashConvert.conversionsMod.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofhsl extends js.Object {
  val channels: `3`
  val labels: hsl
  def hcg(hsl: HSL): HCG
  def hsv(hsl: HSL): HSV
  def rgb(hsl: HSL): RGB
}

object Typeofhsl {
  @scala.inline
  def apply(channels: `3`, hcg: HSL => HCG, hsv: HSL => HSV, labels: hsl, rgb: HSL => RGB): Typeofhsl = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], hcg = js.Any.fromFunction1(hcg), hsv = js.Any.fromFunction1(hsv), labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofhsl]
  }
}

