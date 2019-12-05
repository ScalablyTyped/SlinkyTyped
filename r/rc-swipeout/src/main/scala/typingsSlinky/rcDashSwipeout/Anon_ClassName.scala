package typingsSlinky.rcDashSwipeout

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var text: TagMod[Any]
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object Anon_ClassName {
  @scala.inline
  def apply(
    text: TagMod[Any],
    className: String = null,
    onPress: () => Unit = null,
    style: js.Any = null,
    `type`: js.Any = null
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassName]
  }
}

