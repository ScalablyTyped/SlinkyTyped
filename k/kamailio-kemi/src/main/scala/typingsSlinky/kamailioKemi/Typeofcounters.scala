package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcounters extends js.Object {
  def add(sname: String, v: Double): Double = js.native
  def inc(sname: String): Double = js.native
  def reset(sname: String): Double = js.native
}

object Typeofcounters {
  @scala.inline
  def apply(add: (String, Double) => Double, inc: String => Double, reset: String => Double): Typeofcounters = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), inc = js.Any.fromFunction1(inc), reset = js.Any.fromFunction1(reset))
    __obj.asInstanceOf[Typeofcounters]
  }
  @scala.inline
  implicit class TypeofcountersOps[Self <: Typeofcounters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (String, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInc(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inc")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReset(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

