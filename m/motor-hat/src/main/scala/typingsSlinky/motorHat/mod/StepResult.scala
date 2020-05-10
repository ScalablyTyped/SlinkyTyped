package typingsSlinky.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepResult extends js.Object {
  /**
    * Direction of steps performed
    */
  var dir: Direction = js.native
  /**
    * Time in ms taken to perform the steps
    */
  var duration: Double = js.native
  /**
    * Number of steps retried
    */
  var retried: Double = js.native
  /**
    * Performed steps
    */
  var steps: Double = js.native
}

object StepResult {
  @scala.inline
  def apply(dir: Direction, duration: Double, retried: Double, steps: Double): StepResult = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], retried = retried.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepResult]
  }
  @scala.inline
  implicit class StepResultOps[Self <: StepResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDir(value: Direction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetried(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retried")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

