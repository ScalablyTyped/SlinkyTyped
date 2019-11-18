package typingsSlinky.reactDashNative.reactDashNativeMod

import typingsSlinky.reactDashNative.reactDashNativeStrings.bevel
import typingsSlinky.reactDashNative.reactDashNativeStrings.butt
import typingsSlinky.reactDashNative.reactDashNativeStrings.miter
import typingsSlinky.reactDashNative.reactDashNativeStrings.round
import typingsSlinky.reactDashNative.reactDashNativeStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ARTTextProps extends ARTRenderableMixin {
  var alignment: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
}

object ARTTextProps {
  @scala.inline
  def apply(
    alignment: String = null,
    fill: String = null,
    font: String = null,
    opacity: Int | Double = null,
    originX: Int | Double = null,
    originY: Int | Double = null,
    scale: Int | Double = null,
    scaleX: Int | Double = null,
    scaleY: Int | Double = null,
    stroke: String = null,
    strokeCap: butt | square | round = null,
    strokeDash: js.Array[Double] = null,
    strokeJoin: bevel | miter | round = null,
    strokeWidth: Int | Double = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    x: Int | Double = null,
    y: Int | Double = null
  ): ARTTextProps = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (originX != null) __obj.updateDynamic("originX")(originX.asInstanceOf[js.Any])
    if (originY != null) __obj.updateDynamic("originY")(originY.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeCap != null) __obj.updateDynamic("strokeCap")(strokeCap.asInstanceOf[js.Any])
    if (strokeDash != null) __obj.updateDynamic("strokeDash")(strokeDash.asInstanceOf[js.Any])
    if (strokeJoin != null) __obj.updateDynamic("strokeJoin")(strokeJoin.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARTTextProps]
  }
}

