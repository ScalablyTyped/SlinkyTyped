package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClampToGround extends js.Object {
  var clampToGround: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.undefined
  var markerColor: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.undefined
  var markerSize: js.UndefOr[Double] = js.undefined
  var markerSymbol: js.UndefOr[String] = js.undefined
  var sourceUri: js.UndefOr[String] = js.undefined
  var stroke: js.UndefOr[typingsSlinky.cesium.mod.Color] = js.undefined
  var strokeWidth: js.UndefOr[Double] = js.undefined
}

object ClampToGround {
  @scala.inline
  def apply(
    clampToGround: js.UndefOr[Boolean] = js.undefined,
    fill: typingsSlinky.cesium.mod.Color = null,
    markerColor: typingsSlinky.cesium.mod.Color = null,
    markerSize: js.UndefOr[Double] = js.undefined,
    markerSymbol: String = null,
    sourceUri: String = null,
    stroke: typingsSlinky.cesium.mod.Color = null,
    strokeWidth: js.UndefOr[Double] = js.undefined
  ): ClampToGround = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clampToGround)) __obj.updateDynamic("clampToGround")(clampToGround.get.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (markerColor != null) __obj.updateDynamic("markerColor")(markerColor.asInstanceOf[js.Any])
    if (!js.isUndefined(markerSize)) __obj.updateDynamic("markerSize")(markerSize.get.asInstanceOf[js.Any])
    if (markerSymbol != null) __obj.updateDynamic("markerSymbol")(markerSymbol.asInstanceOf[js.Any])
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClampToGround]
  }
}

