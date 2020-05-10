package typingsSlinky.jsSchema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberConstructor extends js.Object {
  def above(n: Double): NumberConstructor = js.native
  def below(n: Double): NumberConstructor = js.native
  def max(n: Double): NumberConstructor = js.native
  def min(n: Double): NumberConstructor = js.native
  def step(n: Double): NumberConstructor = js.native
}

object NumberConstructor {
  @scala.inline
  def apply(
    above: Double => NumberConstructor,
    below: Double => NumberConstructor,
    max: Double => NumberConstructor,
    min: Double => NumberConstructor,
    step: Double => NumberConstructor
  ): NumberConstructor = {
    val __obj = js.Dynamic.literal(above = js.Any.fromFunction1(above), below = js.Any.fromFunction1(below), max = js.Any.fromFunction1(max), min = js.Any.fromFunction1(min), step = js.Any.fromFunction1(step))
    __obj.asInstanceOf[NumberConstructor]
  }
  @scala.inline
  implicit class NumberConstructorOps[Self <: NumberConstructor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbove(value: Double => NumberConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("above")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBelow(value: Double => NumberConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("below")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMax(value: Double => NumberConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMin(value: Double => NumberConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStep(value: Double => NumberConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

