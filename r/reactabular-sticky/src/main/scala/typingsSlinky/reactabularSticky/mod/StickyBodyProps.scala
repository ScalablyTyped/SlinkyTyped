package typingsSlinky.reactabularSticky.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactabularSticky.anon.PartialUIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyBodyProps extends js.Object {
  var onScroll: js.UndefOr[js.Function1[/* e */ PartialUIEvent, Unit]] = js.undefined
  var tableHeader: HTMLElement | Null
}

object StickyBodyProps {
  @scala.inline
  def apply(onScroll: /* e */ PartialUIEvent => Unit = null, tableHeader: HTMLElement = null): StickyBodyProps = {
    val __obj = js.Dynamic.literal(tableHeader = tableHeader.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    __obj.asInstanceOf[StickyBodyProps]
  }
}

