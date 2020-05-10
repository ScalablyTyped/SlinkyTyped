package typingsSlinky.polished.colorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HslColor extends js.Object {
  var hue: Double = js.native
  var lightness: Double = js.native
  var saturation: Double = js.native
}

object HslColor {
  @scala.inline
  def apply(hue: Double, lightness: Double, saturation: Double): HslColor = {
    val __obj = js.Dynamic.literal(hue = hue.asInstanceOf[js.Any], lightness = lightness.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[HslColor]
  }
  @scala.inline
  implicit class HslColorOps[Self <: HslColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaturation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

