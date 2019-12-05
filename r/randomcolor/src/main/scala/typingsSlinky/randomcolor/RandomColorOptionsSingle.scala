package typingsSlinky.randomcolor

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

trait RandomColorOptionsSingle extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[hsvArray | hslArray | hsl | hsla | rgbArray | rgb | rgba | hex] = js.undefined
  var hue: js.UndefOr[Double | String] = js.undefined
  var luminosity: js.UndefOr[bright | light | dark | random] = js.undefined
  var seed: js.UndefOr[Double | String] = js.undefined
}

object RandomColorOptionsSingle {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    format: hsvArray | hslArray | hsl | hsla | rgbArray | rgb | rgba | hex = null,
    hue: Double | String = null,
    luminosity: bright | light | dark | random = null,
    seed: Double | String = null
  ): RandomColorOptionsSingle = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (luminosity != null) __obj.updateDynamic("luminosity")(luminosity.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomColorOptionsSingle]
  }
}

