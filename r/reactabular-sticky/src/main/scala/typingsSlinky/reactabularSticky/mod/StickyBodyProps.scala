package typingsSlinky.reactabularSticky.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactabularSticky.PartialUIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StickyBodyProps extends js.Object {
  var onScroll: js.UndefOr[js.Function1[/* e */ PartialUIEvent, Unit]] = js.native
  var tableHeader: HTMLElement | Null = js.native
}

object StickyBodyProps {
  @scala.inline
  def apply(): StickyBodyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StickyBodyProps]
  }
  @scala.inline
  implicit class StickyBodyPropsOps[Self <: StickyBodyProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnScroll(value: /* e */ PartialUIEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withTableHeader(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableHeaderNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableHeader")(null)
        ret
    }
  }
  
}

