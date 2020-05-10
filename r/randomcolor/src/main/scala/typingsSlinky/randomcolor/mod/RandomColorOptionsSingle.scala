package typingsSlinky.randomcolor.mod

import typingsSlinky.randomcolor.randomcolorStrings.bright
import typingsSlinky.randomcolor.randomcolorStrings.dark
import typingsSlinky.randomcolor.randomcolorStrings.hex
import typingsSlinky.randomcolor.randomcolorStrings.hsl
import typingsSlinky.randomcolor.randomcolorStrings.hslArray
import typingsSlinky.randomcolor.randomcolorStrings.hsla
import typingsSlinky.randomcolor.randomcolorStrings.hsvArray
import typingsSlinky.randomcolor.randomcolorStrings.light
import typingsSlinky.randomcolor.randomcolorStrings.random
import typingsSlinky.randomcolor.randomcolorStrings.rgb
import typingsSlinky.randomcolor.randomcolorStrings.rgbArray
import typingsSlinky.randomcolor.randomcolorStrings.rgba
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomColorOptionsSingle extends js.Object {
  var alpha: js.UndefOr[Double] = js.native
  var format: js.UndefOr[hsvArray | hslArray | hsl | hsla | rgbArray | rgb | rgba | hex] = js.native
  var hue: js.UndefOr[Double | String] = js.native
  var luminosity: js.UndefOr[bright | light | dark | random] = js.native
  var seed: js.UndefOr[Double | String] = js.native
}

object RandomColorOptionsSingle {
  @scala.inline
  def apply(): RandomColorOptionsSingle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomColorOptionsSingle]
  }
  @scala.inline
  implicit class RandomColorOptionsSingleOps[Self <: RandomColorOptionsSingle] (val x: Self) extends AnyVal {
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
    def withFormat(value: hsvArray | hslArray | hsl | hsla | rgbArray | rgb | rgba | hex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHue(value: Double | String): Self = {
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
    def withLuminosity(value: bright | light | dark | random): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("luminosity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLuminosity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("luminosity")(js.undefined)
        ret
    }
    @scala.inline
    def withSeed(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seed")(js.undefined)
        ret
    }
  }
  
}

