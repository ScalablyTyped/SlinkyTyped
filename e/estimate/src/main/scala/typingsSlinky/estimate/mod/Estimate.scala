package typingsSlinky.estimate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Estimate extends js.Object {
  var progress: Double = js.native
  var remaining: Double = js.native
  var total: Double = js.native
  def initialize(): Unit = js.native
  def update(): Unit = js.native
}

object Estimate {
  @scala.inline
  def apply(initialize: () => Unit, progress: Double, remaining: Double, total: Double, update: () => Unit): Estimate = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction0(initialize), progress = progress.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Estimate]
  }
  @scala.inline
  implicit class EstimateOps[Self <: Estimate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialize(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

