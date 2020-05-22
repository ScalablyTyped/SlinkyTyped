package typingsSlinky.reactContentLoader.holderMod

import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeSvg.mod.NumberProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<std.Required<react-content-loader.react-content-loader/dist/native.IContentLoaderProps>, 'animate' | 'height' | 'preserveAspectRatio' | 'primaryColor' | 'rtl' | 'secondaryColor' | 'speed' | 'style' | 'width'> */
trait DefaultProps_ extends js.Object {
  var animate: Boolean
  var height: NumberProp
  var preserveAspectRatio: String
  var primaryColor: String
  var rtl: Boolean
  var secondaryColor: String
  var speed: Double
  var style: StyleProp[ViewStyle]
  var width: NumberProp
}

object DefaultProps_ {
  @scala.inline
  def apply(
    animate: Boolean,
    height: NumberProp,
    preserveAspectRatio: String,
    primaryColor: String,
    rtl: Boolean,
    secondaryColor: String,
    speed: Double,
    width: NumberProp,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): DefaultProps_ = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], primaryColor = primaryColor.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], secondaryColor = secondaryColor.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps_]
  }
}

