package typingsSlinky.rcDashMentions.esOptionMod

import slinky.core.TagMod
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object OptionProps {
  @scala.inline
  def apply(
    children: TagMod[Any] = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    value: String = null
  ): OptionProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionProps]
  }
}

