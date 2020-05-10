package typingsSlinky.hystrixjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandMetrics extends js.Object {
  def addExecutionTime(value: Double): Unit = js.native
  def decrementExecutionCount(): Unit = js.native
  def getCurrentExecutionCount(): Double = js.native
  def getExecutionTime(percentile: js.Any): Double = js.native
  def getHealthCounts(): HealthCounts = js.native
  def getRollingCount(`type`: js.Any): Double = js.native
  def incrementExecutionCount(): Unit = js.native
  def markFailure(): Unit = js.native
  def markRejected(): Unit = js.native
  def markShortCircuited(): Unit = js.native
  def markSuccess(): Unit = js.native
  def markTimeout(): Unit = js.native
  def reset(): Unit = js.native
}

object CommandMetrics {
  @scala.inline
  def apply(
    addExecutionTime: Double => Unit,
    decrementExecutionCount: () => Unit,
    getCurrentExecutionCount: () => Double,
    getExecutionTime: js.Any => Double,
    getHealthCounts: () => HealthCounts,
    getRollingCount: js.Any => Double,
    incrementExecutionCount: () => Unit,
    markFailure: () => Unit,
    markRejected: () => Unit,
    markShortCircuited: () => Unit,
    markSuccess: () => Unit,
    markTimeout: () => Unit,
    reset: () => Unit
  ): CommandMetrics = {
    val __obj = js.Dynamic.literal(addExecutionTime = js.Any.fromFunction1(addExecutionTime), decrementExecutionCount = js.Any.fromFunction0(decrementExecutionCount), getCurrentExecutionCount = js.Any.fromFunction0(getCurrentExecutionCount), getExecutionTime = js.Any.fromFunction1(getExecutionTime), getHealthCounts = js.Any.fromFunction0(getHealthCounts), getRollingCount = js.Any.fromFunction1(getRollingCount), incrementExecutionCount = js.Any.fromFunction0(incrementExecutionCount), markFailure = js.Any.fromFunction0(markFailure), markRejected = js.Any.fromFunction0(markRejected), markShortCircuited = js.Any.fromFunction0(markShortCircuited), markSuccess = js.Any.fromFunction0(markSuccess), markTimeout = js.Any.fromFunction0(markTimeout), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[CommandMetrics]
  }
  @scala.inline
  implicit class CommandMetricsOps[Self <: CommandMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddExecutionTime(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addExecutionTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecrementExecutionCount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decrementExecutionCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentExecutionCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentExecutionCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExecutionTime(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExecutionTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHealthCounts(value: () => HealthCounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHealthCounts")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRollingCount(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRollingCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncrementExecutionCount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementExecutionCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMarkFailure(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markFailure")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMarkRejected(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markRejected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMarkShortCircuited(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markShortCircuited")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMarkSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markSuccess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMarkTimeout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markTimeout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

