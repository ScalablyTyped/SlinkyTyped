package typingsSlinky.griddleReact.mod.components

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var columnId: js.UndefOr[String] = js.undefined
  var griddleKey: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[Element]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object CellProps {
  @scala.inline
  def apply(
    className: String = null,
    columnId: String = null,
    griddleKey: js.UndefOr[Double] = js.undefined,
    onClick: SyntheticMouseEvent[Element] => Unit = null,
    onMouseEnter: SyntheticMouseEvent[Element] => Unit = null,
    onMouseLeave: SyntheticMouseEvent[Element] => Unit = null,
    style: CSSProperties = null,
    value: js.Any = null
  ): CellProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnId != null) __obj.updateDynamic("columnId")(columnId.asInstanceOf[js.Any])
    if (!js.isUndefined(griddleKey)) __obj.updateDynamic("griddleKey")(griddleKey.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProps]
  }
}

