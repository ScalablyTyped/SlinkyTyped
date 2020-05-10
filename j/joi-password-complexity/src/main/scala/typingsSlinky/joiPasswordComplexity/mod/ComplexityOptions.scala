package typingsSlinky.joiPasswordComplexity.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplexityOptions extends js.Object {
  var lowerCase: Double = js.native
  var max: Double = js.native
  var min: Double = js.native
  var numeric: Double = js.native
  var requirementCount: Double = js.native
  var symbol: Double = js.native
  var upperCase: Double = js.native
}

object ComplexityOptions {
  @scala.inline
  def apply(
    lowerCase: Double,
    max: Double,
    min: Double,
    numeric: Double,
    requirementCount: Double,
    symbol: Double,
    upperCase: Double
  ): ComplexityOptions = {
    val __obj = js.Dynamic.literal(lowerCase = lowerCase.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], requirementCount = requirementCount.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], upperCase = upperCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComplexityOptions]
  }
  @scala.inline
  implicit class ComplexityOptionsOps[Self <: ComplexityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLowerCase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumeric(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequirementCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requirementCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpperCase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperCase")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

