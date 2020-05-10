package typingsSlinky.gremlin.mod.process

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operator_ extends js.Object {
  var addall: EnumValue = js.native
  var and: EnumValue = js.native
  var assign: EnumValue = js.native
  var div: EnumValue = js.native
  var max: EnumValue = js.native
  var min: EnumValue = js.native
  var minus: EnumValue = js.native
  var mult: EnumValue = js.native
  var or: EnumValue = js.native
  var sum: EnumValue = js.native
  var sumlong: EnumValue = js.native
}

object Operator_ {
  @scala.inline
  def apply(
    addall: EnumValue,
    and: EnumValue,
    assign: EnumValue,
    div: EnumValue,
    max: EnumValue,
    min: EnumValue,
    minus: EnumValue,
    mult: EnumValue,
    or: EnumValue,
    sum: EnumValue,
    sumlong: EnumValue
  ): Operator_ = {
    val __obj = js.Dynamic.literal(addall = addall.asInstanceOf[js.Any], and = and.asInstanceOf[js.Any], assign = assign.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minus = minus.asInstanceOf[js.Any], mult = mult.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], sumlong = sumlong.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operator_]
  }
  @scala.inline
  implicit class Operator_Ops[Self <: Operator_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddall(value: EnumValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnd(value: EnumValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssign(value: EnumValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiv(value: EnumValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("div")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: EnumValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: EnumValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinus(value: EnumValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMult(value: EnumValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOr(value: EnumValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("or")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSum(value: EnumValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSumlong(value: EnumValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sumlong")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

