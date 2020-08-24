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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    @scala.inline
    def setFormat(value: hsvArray | hslArray | hsl | hsla | rgbArray | rgb | rgba | hex): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHue(value: Double | String): Self = this.set("hue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHue: Self = this.set("hue", js.undefined)
    @scala.inline
    def setLuminosity(value: bright | light | dark | random): Self = this.set("luminosity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLuminosity: Self = this.set("luminosity", js.undefined)
    @scala.inline
    def setSeed(value: Double | String): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
  }
  
}

