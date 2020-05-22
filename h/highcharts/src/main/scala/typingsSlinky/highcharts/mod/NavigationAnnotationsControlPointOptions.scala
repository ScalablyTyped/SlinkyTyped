package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationAnnotationsControlPointOptions extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var positioner: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[NavigationAnnotationsControlPointStyleOptions] = js.undefined
  var symbol: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object NavigationAnnotationsControlPointOptions {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    positioner: js.Any = null,
    style: NavigationAnnotationsControlPointStyleOptions = null,
    symbol: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): NavigationAnnotationsControlPointOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (positioner != null) __obj.updateDynamic("positioner")(positioner.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationAnnotationsControlPointOptions]
  }
}

