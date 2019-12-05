package typingsSlinky.colorDashConvert

import typingsSlinky.colorDashConvert.colorDashConvertNumbers.`4`
import typingsSlinky.colorDashConvert.colorDashConvertStrings.cmyk
import typingsSlinky.colorDashConvert.conversionsMod.CMYK
import typingsSlinky.colorDashConvert.conversionsMod.RGB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcmyk extends js.Object {
  val channels: `4`
  val labels: cmyk
  def rgb(cmyk: CMYK): RGB
}

object Typeofcmyk {
  @scala.inline
  def apply(channels: `4`, labels: cmyk, rgb: CMYK => RGB): Typeofcmyk = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofcmyk]
  }
}

