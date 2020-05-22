package typingsSlinky.reactSpinners.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderHeightWidthProps extends CommonProps {
  var height: js.UndefOr[Double] = js.undefined
  var heightUnit: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var widthUnit: js.UndefOr[String] = js.undefined
}

object LoaderHeightWidthProps {
  @scala.inline
  def apply(
    color: String = null,
    css: String | PrecompiledCss = null,
    height: js.UndefOr[Double] = js.undefined,
    heightUnit: String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    widthUnit: String = null
  ): LoaderHeightWidthProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (heightUnit != null) __obj.updateDynamic("heightUnit")(heightUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (widthUnit != null) __obj.updateDynamic("widthUnit")(widthUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderHeightWidthProps]
  }
}

