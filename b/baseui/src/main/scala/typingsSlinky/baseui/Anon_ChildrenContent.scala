package typingsSlinky.baseui

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.MouseEvent
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenContent extends js.Object {
  var children: TagMod[Any]
  var content: TagMod[Any] | js.Function0[TagMod[Any]]
  var isOpen: Boolean
  var onBlur: js.UndefOr[js.Function0[_]] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* e */ Event, _]] = js.undefined
  var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent, _]] = js.undefined
  var onEsc: js.UndefOr[js.Function0[_]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[_]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function0[_]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function0[_]] = js.undefined
}

object Anon_ChildrenContent {
  @scala.inline
  def apply(
    children: TagMod[Any],
    content: TagMod[Any] | js.Function0[TagMod[Any]],
    isOpen: Boolean,
    onBlur: () => _ = null,
    onClick: /* e */ Event => _ = null,
    onClickOutside: /* event */ MouseEvent => _ = null,
    onEsc: () => _ = null,
    onFocus: () => _ = null,
    onMouseEnter: () => _ = null,
    onMouseLeave: () => _ = null
  ): Anon_ChildrenContent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClickOutside != null) __obj.updateDynamic("onClickOutside")(js.Any.fromFunction1(onClickOutside))
    if (onEsc != null) __obj.updateDynamic("onEsc")(js.Any.fromFunction0(onEsc))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction0(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction0(onMouseLeave))
    __obj.asInstanceOf[Anon_ChildrenContent]
  }
}

