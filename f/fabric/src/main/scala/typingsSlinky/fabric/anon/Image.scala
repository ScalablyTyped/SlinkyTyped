package typingsSlinky.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var image: js.UndefOr[typingsSlinky.fabric.fabricImplMod.Image] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
}

object Image {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    image: typingsSlinky.fabric.fabricImplMod.Image = null,
    mode: String = null
  ): Image = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

