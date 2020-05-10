package typingsSlinky.ngprogress.NgProgress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INgProgress extends js.Object {
  def color(color: String): Unit = js.native
  def complete(): Unit = js.native
  def height(height: String): Unit = js.native
  def reset(): Unit = js.native
  def set(value: Double): Unit = js.native
  def start(): Unit = js.native
  def status(): Double = js.native
  def stop(): Unit = js.native
}

object INgProgress {
  @scala.inline
  def apply(
    color: String => Unit,
    complete: () => Unit,
    height: String => Unit,
    reset: () => Unit,
    set: Double => Unit,
    start: () => Unit,
    status: () => Double,
    stop: () => Unit
  ): INgProgress = {
    val __obj = js.Dynamic.literal(color = js.Any.fromFunction1(color), complete = js.Any.fromFunction0(complete), height = js.Any.fromFunction1(height), reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction1(set), start = js.Any.fromFunction0(start), status = js.Any.fromFunction0(status), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[INgProgress]
  }
  @scala.inline
  implicit class INgProgressOps[Self <: INgProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStatus(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

