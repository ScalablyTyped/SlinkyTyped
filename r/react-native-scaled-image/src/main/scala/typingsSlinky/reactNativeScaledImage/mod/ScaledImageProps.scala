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
    height: Int | Double = null,
    style: StyleProp[ImageStyle] = null,
    width: Int | Double = null
  ): ScaledImageProps = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaledImageProps]
  }
}

