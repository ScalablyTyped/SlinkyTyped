package typingsSlinky.promptSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History extends js.Object {
  def atEnd(): Boolean = js.native
  def atPenultimate(): Boolean = js.native
  def atStart(): Boolean = js.native
  def next(): String = js.native
  def pastEnd(): Boolean = js.native
  def prev(): String = js.native
  def push(str: String): Unit = js.native
  def reset(): Unit = js.native
  def save(): Unit = js.native
}

object History {
  @scala.inline
  def apply(
    atEnd: () => Boolean,
    atPenultimate: () => Boolean,
    atStart: () => Boolean,
    next: () => String,
    pastEnd: () => Boolean,
    prev: () => String,
    push: String => Unit,
    reset: () => Unit,
    save: () => Unit
  ): History = {
    val __obj = js.Dynamic.literal(atEnd = js.Any.fromFunction0(atEnd), atPenultimate = js.Any.fromFunction0(atPenultimate), atStart = js.Any.fromFunction0(atStart), next = js.Any.fromFunction0(next), pastEnd = js.Any.fromFunction0(pastEnd), prev = js.Any.fromFunction0(prev), push = js.Any.fromFunction1(push), reset = js.Any.fromFunction0(reset), save = js.Any.fromFunction0(save))
    __obj.asInstanceOf[History]
  }
  @scala.inline
  implicit class HistoryOps[Self <: History] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAtEnd(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAtPenultimate(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atPenultimate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAtStart(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNext(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPastEnd(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pastEnd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrev(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPush(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

