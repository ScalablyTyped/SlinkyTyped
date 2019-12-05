package typingsSlinky.colorDashConvert

import typingsSlinky.colorDashConvert.colorDashConvertNumbers.`3`
import typingsSlinky.colorDashConvert.colorDashConvertStrings.xyz
import typingsSlinky.colorDashConvert.conversionsMod.LAB
import typingsSlinky.colorDashConvert.conversionsMod.RGB
import typingsSlinky.colorDashConvert.conversionsMod.XYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofxyz extends js.Object {
  val channels: `3`
  val labels: xyz
  def lab(xyz: XYZ): LAB
  def rgb(xyz: XYZ): RGB
}

object Typeofxyz {
  @scala.inline
  def apply(channels: `3`, lab: XYZ => LAB, labels: xyz, rgb: XYZ => RGB): Typeofxyz = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], lab = js.Any.fromFunction1(lab), labels = labels.asInstanceOf[js.Any], rgb = js.Any.fromFunction1(rgb))
  
    __obj.asInstanceOf[Typeofxyz]
  }
}

