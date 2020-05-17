package typingsSlinky.numeric.anon

import typingsSlinky.numeric.mod.Matrix
import typingsSlinky.numeric.mod.Scalar
import typingsSlinky.numeric.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait F extends js.Object {
  var f: Scalar = js.native
  var gradient: Vector = js.native
  var invHessian: Matrix = js.native
  var iterations: Double = js.native
  var message: String = js.native
  var solution: Vector = js.native
}

object F {
  @scala.inline
  def apply(
    f: Scalar,
    gradient: Vector,
    invHessian: Matrix,
    iterations: Double,
    message: String,
    solution: Vector
  ): F = {
    val __obj = js.Dynamic.literal(f = f.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], invHessian = invHessian.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], solution = solution.asInstanceOf[js.Any])
    __obj.asInstanceOf[F]
  }
  @scala.inline
  implicit class FOps[Self <: F] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withF(value: Scalar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGradient(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvHessian(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invHessian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIterations(value: Double): Self = {
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
  }
  
}

