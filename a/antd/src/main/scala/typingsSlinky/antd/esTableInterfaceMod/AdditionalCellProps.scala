package typingsSlinky.antd.esTableInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalCellProps
  extends /* name */ StringDictionary[js.Any] {
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
}

object AdditionalCellProps {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    onClick: SyntheticMouseEvent[HTMLElement] => Unit = null
  ): AdditionalCellProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[AdditionalCellProps]
  }
}

