package typingsSlinky.reactBytesizeIcons.mod

import slinky.core.TagMod
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesizeIconsProps
  extends Props[js.Any] {
  var color: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var strokeLinecap: js.UndefOr[StrokeLinecap] = js.undefined
  var strokeLinejoin: js.UndefOr[StrokeLinejoin] = js.undefined
  var strokeWidth: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object BytesizeIconsProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    color: String = null,
    height: js.UndefOr[Double] = js.undefined,
    key: Key = null,
    ref: js.UndefOr[Null | LegacyRef[js.Any]] = js.undefined,
    strokeLinecap: StrokeLinecap = null,
    strokeLinejoin: StrokeLinejoin = null,
    strokeWidth: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): BytesizeIconsProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesizeIconsProps]
  }
}

