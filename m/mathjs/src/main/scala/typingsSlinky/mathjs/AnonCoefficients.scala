package typingsSlinky.mathjs

import typingsSlinky.mathjs.mod.MathNode
import typingsSlinky.mathjs.mod.MathType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCoefficients extends js.Object {
  var coefficients: js.Array[MathType] = js.native
  var expression: MathNode | String = js.native
  var variables: js.Array[String] = js.native
}

object AnonCoefficients {
  @scala.inline
  def apply(coefficients: js.Array[MathType], expression: MathNode | String, variables: js.Array[String]): AnonCoefficients = {
    val __obj = js.Dynamic.literal(coefficients = coefficients.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoefficients]
  }
  @scala.inline
  implicit class AnonCoefficientsOps[Self <: AnonCoefficients] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoefficients(value: js.Array[MathType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coefficients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpression(value: MathNode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVariables(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

