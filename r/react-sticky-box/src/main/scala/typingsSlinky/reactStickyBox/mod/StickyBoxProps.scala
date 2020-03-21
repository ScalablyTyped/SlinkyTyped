package typingsSlinky.reactStickyBox.mod

import slinky.core.TagMod
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyBoxProps extends js.Object {
  var bottom: js.UndefOr[Boolean] = js.undefined
  var children: TagMod[Any]
  var className: js.UndefOr[String] = js.undefined
  var offsetBottom: js.UndefOr[Double] = js.undefined
  var offsetTop: js.UndefOr[Double] = js.undefined
  var onChangeMode: js.UndefOr[
    js.Function2[/* oldMode */ js.UndefOr[StickyBoxMode], /* newMode */ StickyBoxMode, _]
  ] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object StickyBoxProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    bottom: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    offsetBottom: Int | Double = null,
    offsetTop: Int | Double = null,
    onChangeMode: (/* oldMode */ js.UndefOr[StickyBoxMode], /* newMode */ StickyBoxMode) => _ = null,
    style: CSSProperties = null
  ): StickyBoxProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onChangeMode != null) __obj.updateDynamic("onChangeMode")(js.Any.fromFunction2(onChangeMode))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyBoxProps]
  }
}

