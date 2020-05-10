package typingsSlinky.reactJoyride.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreHelpers extends js.Object {
  def close(): Unit = js.native
  def go(nextIndex: Double): Unit = js.native
  def info(): StoreState = js.native
  def next(): Unit = js.native
  def open(): Unit = js.native
  def prev(): Unit = js.native
  def reset(restart: Boolean): Unit = js.native
  def skip(): Unit = js.native
}

object StoreHelpers {
  @scala.inline
  def apply(
    close: () => Unit,
    go: Double => Unit,
    info: () => StoreState,
    next: () => Unit,
    open: () => Unit,
    prev: () => Unit,
    reset: Boolean => Unit,
    skip: () => Unit
  ): StoreHelpers = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), go = js.Any.fromFunction1(go), info = js.Any.fromFunction0(info), next = js.Any.fromFunction0(next), open = js.Any.fromFunction0(open), prev = js.Any.fromFunction0(prev), reset = js.Any.fromFunction1(reset), skip = js.Any.fromFunction0(skip))
    __obj.asInstanceOf[StoreHelpers]
  }
  @scala.inline
  implicit class StoreHelpersOps[Self <: StoreHelpers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGo(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("go")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInfo(value: () => StoreState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrev(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkip(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

