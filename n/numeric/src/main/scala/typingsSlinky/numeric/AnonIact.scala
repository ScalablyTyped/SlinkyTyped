package typingsSlinky.numeric

import typingsSlinky.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIact extends js.Object {
  var iact: Vector = js.native
  var iterations: Vector = js.native
  var message: String = js.native
  var solution: Vector = js.native
  var unconstrained_solution: Vector = js.native
  var value: Vector = js.native
}

object AnonIact {
  @scala.inline
  def apply(
    iact: Vector,
    iterations: Vector,
    message: String,
    solution: Vector,
    unconstrained_solution: Vector,
    value: Vector
  ): AnonIact = {
    val __obj = js.Dynamic.literal(iact = iact.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], solution = solution.asInstanceOf[js.Any], unconstrained_solution = unconstrained_solution.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIact]
  }
  @scala.inline
  implicit class AnonIactOps[Self <: AnonIact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIact(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterations(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSolution(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnconstrained_solution(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unconstrained_solution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

