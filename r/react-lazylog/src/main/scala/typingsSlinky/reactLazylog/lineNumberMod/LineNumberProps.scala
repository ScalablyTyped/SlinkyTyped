package typingsSlinky.reactLazylog.lineNumberMod

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineNumberProps extends js.Object {
  var highlight: js.UndefOr[Boolean] = js.undefined
  var number: Double
  var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LineNumberProps {
  @scala.inline
  def apply(
    number: Double,
    highlight: js.UndefOr[Boolean] = js.undefined,
    onClick: SyntheticMouseEvent[HTMLAnchorElement] => Unit = null,
    style: CSSProperties = null
  ): LineNumberProps = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineNumberProps]
  }
}

