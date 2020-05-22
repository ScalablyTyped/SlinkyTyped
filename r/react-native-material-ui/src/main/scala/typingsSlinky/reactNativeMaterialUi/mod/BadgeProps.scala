package typingsSlinky.reactNativeMaterialUi.mod

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeMaterialUi.anon.StrokeContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends js.Object {
  var accent: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactElement] = js.undefined
  var icon: js.UndefOr[String | typingsSlinky.reactNativeMaterialUi.anon.Color] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var stroke: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[StrokeContainer] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    accent: js.UndefOr[Boolean] = js.undefined,
    children: ReactElement = null,
    icon: String | typingsSlinky.reactNativeMaterialUi.anon.Color = null,
    size: js.UndefOr[Double] = js.undefined,
    stroke: js.UndefOr[Double] = js.undefined,
    style: StrokeContainer = null,
    text: String = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accent)) __obj.updateDynamic("accent")(accent.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
}

