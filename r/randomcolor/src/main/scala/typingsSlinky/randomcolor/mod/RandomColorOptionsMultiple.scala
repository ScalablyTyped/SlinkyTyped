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

trait RandomColorOptionsMultiple extends RandomColorOptionsSingle {
  var count: Double
}

object RandomColorOptionsMultiple {
  @scala.inline
  def apply(
    count: Double,
    alpha: js.UndefOr[Double] = js.undefined,
    format: hsvArray | hslArray | hsl | hsla | rgbArray | rgb | rgba | hex = null,
    hue: Double | String = null,
    luminosity: bright | light | dark | random = null,
    seed: Double | String = null
  ): RandomColorOptionsMultiple = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (luminosity != null) __obj.updateDynamic("luminosity")(luminosity.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomColorOptionsMultiple]
  }
}

