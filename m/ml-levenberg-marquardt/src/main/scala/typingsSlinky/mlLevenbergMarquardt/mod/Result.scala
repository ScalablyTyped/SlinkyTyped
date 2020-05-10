package typingsSlinky.mlLevenbergMarquardt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var iterations: Double = js.native
  var parameterError: Double = js.native
  var parameterValues: js.Array[Double] = js.native
}

object Result {
  @scala.inline
  def apply(iterations: Double, parameterError: Double, parameterValues: js.Array[Double]): Result = {
    val __obj = js.Dynamic.literal(iterations = iterations.asInstanceOf[js.Any], parameterError = parameterError.asInstanceOf[js.Any], parameterValues = parameterValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterError(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameterValues(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

