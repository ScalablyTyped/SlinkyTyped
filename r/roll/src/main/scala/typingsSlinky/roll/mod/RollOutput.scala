package typingsSlinky.roll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollOutput extends js.Object {
  var calculations: js.Array[Double] = js.native
  var input: RollObject = js.native
  var result: Double = js.native
  var rolled: js.Array[Double] = js.native
}

object RollOutput {
  @scala.inline
  def apply(calculations: js.Array[Double], input: RollObject, result: Double, rolled: js.Array[Double]): RollOutput = {
    val __obj = js.Dynamic.literal(calculations = calculations.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], rolled = rolled.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollOutput]
  }
  @scala.inline
  implicit class RollOutputOps[Self <: RollOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculations(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: RollObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRolled(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

