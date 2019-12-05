package typingsSlinky.atReachRect.atReachRectMod

import slinky.core.TagMod
import typingsSlinky.atReachRect.Anon_Rect
import typingsSlinky.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* args */ Anon_Rect, TagMod[Any]]] = js.undefined
  var observe: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* rect */ DOMRect, Unit]] = js.undefined
}

object RectProps {
  @scala.inline
  def apply(
    children: /* args */ Anon_Rect => TagMod[Any] = null,
    observe: js.UndefOr[Boolean] = js.undefined,
    onChange: /* rect */ DOMRect => Unit = null
  ): RectProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (!js.isUndefined(observe)) __obj.updateDynamic("observe")(observe.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[RectProps]
  }
}

