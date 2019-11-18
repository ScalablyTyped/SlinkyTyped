package typingsSlinky.antd.esTableInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableEventListeners
  extends /* name */ StringDictionary[js.Any] {
  var onClick: js.UndefOr[js.Function1[/* arg */ SyntheticMouseEvent[Element], Unit]] = js.undefined
  var onContextMenu: js.UndefOr[js.Function1[/* arg */ SyntheticMouseEvent[Element], Unit]] = js.undefined
  var onDoubleClick: js.UndefOr[js.Function1[/* arg */ SyntheticMouseEvent[Element], Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* arg */ SyntheticMouseEvent[Element], Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* arg */ SyntheticMouseEvent[Element], Unit]] = js.undefined
}

object TableEventListeners {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    onClick: /* arg */ SyntheticMouseEvent[Element] => Unit = null,
    onContextMenu: /* arg */ SyntheticMouseEvent[Element] => Unit = null,
    onDoubleClick: /* arg */ SyntheticMouseEvent[Element] => Unit = null,
    onMouseEnter: /* arg */ SyntheticMouseEvent[Element] => Unit = null,
    onMouseLeave: /* arg */ SyntheticMouseEvent[Element] => Unit = null
  ): TableEventListeners = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    __obj.asInstanceOf[TableEventListeners]
  }
}

