package typingsSlinky.jqueryColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HslaColor extends js.Object {
  var alpha: js.UndefOr[Double] = js.native
  var hue: js.UndefOr[Double] = js.native
  var lightness: js.UndefOr[Double] = js.native
  var saturation: js.UndefOr[Double] = js.native
}

object HslaColor {
  @scala.inline
  def apply(): HslaColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HslaColor]
  }
  @scala.inline
  implicit class HslaColorOps[Self <: HslaColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withHue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hue")(js.undefined)
        ret
    }
    @scala.inline
    def withLightness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLightness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lightness")(js.undefined)
        ret
    }
    @scala.inline
    def withSaturation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaturation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saturation")(js.undefined)
        ret
    }
  }
  
}

