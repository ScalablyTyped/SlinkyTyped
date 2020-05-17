package typingsSlinky.jsoneditoronline

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditorSearchBox extends js.Object {
  def clearDelay(): Unit = js.native
  def focusActiveResult(): Unit = js.native
  def next(): Unit = js.native
  def onDelayedSearch(event: Event): Unit = js.native
  def onKeyDown(event: Event): Unit = js.native
  def onKeyUp(event: Event): Unit = js.native
  def onSearch(event: Event, forcedSearch: Boolean): Unit = js.native
  def previous(): Unit = js.native
  def setActiveResult(index: Double): Unit = js.native
}

object JSONEditorSearchBox {
  @scala.inline
  def apply(
    clearDelay: () => Unit,
    focusActiveResult: () => Unit,
    next: () => Unit,
    onDelayedSearch: Event => Unit,
    onKeyDown: Event => Unit,
    onKeyUp: Event => Unit,
    onSearch: (Event, Boolean) => Unit,
    previous: () => Unit,
    setActiveResult: Double => Unit
  ): JSONEditorSearchBox = {
    val __obj = js.Dynamic.literal(clearDelay = js.Any.fromFunction0(clearDelay), focusActiveResult = js.Any.fromFunction0(focusActiveResult), next = js.Any.fromFunction0(next), onDelayedSearch = js.Any.fromFunction1(onDelayedSearch), onKeyDown = js.Any.fromFunction1(onKeyDown), onKeyUp = js.Any.fromFunction1(onKeyUp), onSearch = js.Any.fromFunction2(onSearch), previous = js.Any.fromFunction0(previous), setActiveResult = js.Any.fromFunction1(setActiveResult))
    __obj.asInstanceOf[JSONEditorSearchBox]
  }
  @scala.inline
  implicit class JSONEditorSearchBoxOps[Self <: JSONEditorSearchBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearDelay(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearDelay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFocusActiveResult(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusActiveResult")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDelayedSearch(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDelayedSearch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnKeyDown(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnKeyUp(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSearch(value: (Event, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSearch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPrevious(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previous")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetActiveResult(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setActiveResult")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

