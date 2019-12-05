package typingsSlinky.openlayers.openlayersMod.olx.style

import typingsSlinky.openlayers.openlayersMod.Color
import typingsSlinky.openlayers.openlayersMod.ColorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillOptions extends js.Object {
  var color: js.UndefOr[Color | ColorLike] = js.undefined
}

object FillOptions {
  @scala.inline
  def apply(color: Color | ColorLike = null): FillOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillOptions]
  }
}

