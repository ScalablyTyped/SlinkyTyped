package typingsSlinky.reactabularSticky.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.reactabularSticky.PartialUIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StickyHeaderProps extends js.Object {
  var onScroll: js.UndefOr[js.Function1[/* e */ PartialUIEvent, Unit]] = js.native
  var tableBody: HTMLElement | Null = js.native
}

object StickyHeaderProps {
  @scala.inline
  def apply(): StickyHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StickyHeaderProps]
  }
  @scala.inline
  implicit class StickyHeaderPropsOps[Self <: StickyHeaderProps] (val x: Self) extends AnyVal {
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
    def withTableBody(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableBodyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableBody")(null)
        ret
    }
  }
  
}

