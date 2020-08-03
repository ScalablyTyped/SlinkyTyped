package typingsSlinky.rcSelect.optionListMod

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.react.mod.KeyboardEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefOptionListProps extends js.Object {
  var onKeyDown: KeyboardEventHandler[Element]
  var onKeyUp: KeyboardEventHandler[Element]
  var scrollTo: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
}

object RefOptionListProps {
  @scala.inline
  def apply(
    onKeyDown: SyntheticKeyboardEvent[Element] => Unit,
    onKeyUp: SyntheticKeyboardEvent[Element] => Unit
  ): RefOptionListProps = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp))
    __obj.asInstanceOf[RefOptionListProps]
  }
  @scala.inline
  implicit class RefOptionListPropsOps[Self <: RefOptionListProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnKeyDown(value: SyntheticKeyboardEvent[Element] => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnKeyUp(value: SyntheticKeyboardEvent[Element] => Unit): Self = this.set("onKeyUp", js.Any.fromFunction1(value))
    @scala.inline
    def setScrollTo(value: /* index */ Double => Unit): Self = this.set("scrollTo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteScrollTo: Self = this.set("scrollTo", js.undefined)
  }
  
}

