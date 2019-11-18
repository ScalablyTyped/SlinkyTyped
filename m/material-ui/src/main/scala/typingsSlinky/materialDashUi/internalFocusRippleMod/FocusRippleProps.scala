package typingsSlinky.materialDashUi.internalFocusRippleMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.Key
import typingsSlinky.react.reactMod.LegacyRef
import typingsSlinky.react.reactMod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusRippleProps extends Props[FocusRipple] {
  var color: js.UndefOr[String] = js.undefined
  var innerStyle: js.UndefOr[CSSProperties] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object FocusRippleProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    color: String = null,
    innerStyle: CSSProperties = null,
    key: Key = null,
    opacity: Int | Double = null,
    ref: LegacyRef[FocusRipple] = null,
    show: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): FocusRippleProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (innerStyle != null) __obj.updateDynamic("innerStyle")(innerStyle.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusRippleProps]
  }
}

