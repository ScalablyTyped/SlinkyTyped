package typingsSlinky.ol.styleRegularShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var atlasManager: js.UndefOr[typingsSlinky.ol.styleAtlasManagerMod.default] = js.undefined
  var fill: js.UndefOr[typingsSlinky.ol.styleFillMod.default] = js.undefined
  var points: Double
  var radius: js.UndefOr[Double] = js.undefined
  var radius1: js.UndefOr[Double] = js.undefined
  var radius2: js.UndefOr[Double] = js.undefined
  var rotateWithView: js.UndefOr[Boolean] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[typingsSlinky.ol.styleStrokeMod.default] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    points: Double,
    angle: Int | Double = null,
    atlasManager: typingsSlinky.ol.styleAtlasManagerMod.default = null,
    fill: typingsSlinky.ol.styleFillMod.default = null,
    radius: Int | Double = null,
    radius1: Int | Double = null,
    radius2: Int | Double = null,
    rotateWithView: js.UndefOr[Boolean] = js.undefined,
    rotation: Int | Double = null,
    stroke: typingsSlinky.ol.styleStrokeMod.default = null
  ): Options = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (atlasManager != null) __obj.updateDynamic("atlasManager")(atlasManager.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radius1 != null) __obj.updateDynamic("radius1")(radius1.asInstanceOf[js.Any])
    if (radius2 != null) __obj.updateDynamic("radius2")(radius2.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateWithView)) __obj.updateDynamic("rotateWithView")(rotateWithView.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

