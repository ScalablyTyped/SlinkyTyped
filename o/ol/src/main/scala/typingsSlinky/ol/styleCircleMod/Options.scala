package typingsSlinky.ol.styleCircleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var atlasManager: js.UndefOr[typingsSlinky.ol.styleAtlasManagerMod.default] = js.undefined
  var fill: js.UndefOr[typingsSlinky.ol.styleFillMod.default] = js.undefined
  var radius: Double
  var stroke: js.UndefOr[typingsSlinky.ol.styleStrokeMod.default] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    radius: Double,
    atlasManager: typingsSlinky.ol.styleAtlasManagerMod.default = null,
    fill: typingsSlinky.ol.styleFillMod.default = null,
    stroke: typingsSlinky.ol.styleStrokeMod.default = null
  ): Options = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any])
    if (atlasManager != null) __obj.updateDynamic("atlasManager")(atlasManager.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

