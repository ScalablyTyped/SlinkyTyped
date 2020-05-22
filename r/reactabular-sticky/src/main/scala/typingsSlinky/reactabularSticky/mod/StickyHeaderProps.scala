package typingsSlinky.reactabularSticky.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactabularSticky.anon.PartialUIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyHeaderProps extends js.Object {
  var onScroll: js.UndefOr[js.Function1[/* e */ PartialUIEvent, Unit]] = js.undefined
  var tableBody: HTMLElement | Null
}

object StickyHeaderProps {
  @scala.inline
  def apply(onScroll: /* e */ PartialUIEvent => Unit = null, tableBody: HTMLElement = null): StickyHeaderProps = {
    val __obj = js.Dynamic.literal(tableBody = tableBody.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    __obj.asInstanceOf[StickyHeaderProps]
  }
}

