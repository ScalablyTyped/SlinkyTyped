package typingsSlinky.baconjs.schedulerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scheduler extends js.Object {
  def clearInterval(id: Double): js.Any = js.native
  def clearTimeout(id: Double): js.Any = js.native
  def now(): Double = js.native
  def setInterval(f: js.Function, i: Double): Double = js.native
  def setTimeout(f: js.Function, d: Double): Double = js.native
}

object Scheduler {
  @scala.inline
  def apply(
    clearInterval: Double => js.Any,
    clearTimeout: Double => js.Any,
    now: () => Double,
    setInterval: (js.Function, Double) => Double,
    setTimeout: (js.Function, Double) => Double
  ): Scheduler = {
    val __obj = js.Dynamic.literal(clearInterval = js.Any.fromFunction1(clearInterval), clearTimeout = js.Any.fromFunction1(clearTimeout), now = js.Any.fromFunction0(now), setInterval = js.Any.fromFunction2(setInterval), setTimeout = js.Any.fromFunction2(setTimeout))
    __obj.asInstanceOf[Scheduler]
  }
  @scala.inline
  implicit class SchedulerOps[Self <: Scheduler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearInterval(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearInterval")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearTimeout(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTimeout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNow(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("now")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetInterval(value: (js.Function, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInterval")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTimeout(value: (js.Function, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

