package typingsSlinky.algebraJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Term extends Union {
  var coefficients: js.Array[typingsSlinky.algebraJs.mod.algebra.js_.Fraction] = js.native
  var variables: js.Array[Variable] = js.native
  def coefficient(): typingsSlinky.algebraJs.mod.algebra.js_.Fraction = js.native
}

object Term {
  @scala.inline
  def apply(
    coefficient: () => typingsSlinky.algebraJs.mod.algebra.js_.Fraction,
    coefficients: js.Array[typingsSlinky.algebraJs.mod.algebra.js_.Fraction],
    variables: js.Array[Variable]
  ): Term = {
    val __obj = js.Dynamic.literal(coefficient = js.Any.fromFunction0(coefficient), coefficients = coefficients.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Term]
  }
  @scala.inline
  implicit class TermOps[Self <: Term] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoefficient(value: () => typingsSlinky.algebraJs.mod.algebra.js_.Fraction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coefficient")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCoefficients(value: js.Array[typingsSlinky.algebraJs.mod.algebra.js_.Fraction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coefficients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: js.Array[Variable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

