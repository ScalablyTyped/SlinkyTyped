package typingsSlinky.reactNativeScaledImage.mod

import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.StyleProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaledImageProps extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var source: ImageSourcePropType
  var style: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object ScaledImageProps {
  @scala.inline
  def apply(
    source: ImageSourcePropType,
    height: js.UndefOr[Double] = js.undefined,
    style: js.UndefOr[Null | StyleProp[ImageStyle]] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ScaledImageProps = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledImageProps]
  }
}

