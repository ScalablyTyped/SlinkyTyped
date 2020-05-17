package typingsSlinky.breeze.breeze

import typingsSlinky.breeze.breeze.core.EnumSymbol
import typingsSlinky.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterQueryOp extends IEnum {
  var All: FilterQueryOpSymbol = js.native
  var Any: FilterQueryOpSymbol = js.native
  var Contains: FilterQueryOpSymbol = js.native
  var EndsWith: FilterQueryOpSymbol = js.native
  var Equals: FilterQueryOpSymbol = js.native
  var GreaterThan: FilterQueryOpSymbol = js.native
  var GreaterThanOrEqual: FilterQueryOpSymbol = js.native
  var IsTypeOf: FilterQueryOpSymbol = js.native
  var LessThan: FilterQueryOpSymbol = js.native
  var LessThanOrEqual: FilterQueryOpSymbol = js.native
  var NotEquals: FilterQueryOpSymbol = js.native
  var StartsWith: FilterQueryOpSymbol = js.native
}

object FilterQueryOp {
  @scala.inline
  def apply(
    All: FilterQueryOpSymbol,
    Any: FilterQueryOpSymbol,
    Contains: FilterQueryOpSymbol,
    EndsWith: FilterQueryOpSymbol,
    Equals: FilterQueryOpSymbol,
    GreaterThan: FilterQueryOpSymbol,
    GreaterThanOrEqual: FilterQueryOpSymbol,
    IsTypeOf: FilterQueryOpSymbol,
    LessThan: FilterQueryOpSymbol,
    LessThanOrEqual: FilterQueryOpSymbol,
    NotEquals: FilterQueryOpSymbol,
    StartsWith: FilterQueryOpSymbol,
    contains: js.Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): FilterQueryOp = {
    val __obj = js.Dynamic.literal(All = All.asInstanceOf[js.Any], Any = Any.asInstanceOf[js.Any], Contains = Contains.asInstanceOf[js.Any], EndsWith = EndsWith.asInstanceOf[js.Any], Equals = Equals.asInstanceOf[js.Any], GreaterThan = GreaterThan.asInstanceOf[js.Any], GreaterThanOrEqual = GreaterThanOrEqual.asInstanceOf[js.Any], IsTypeOf = IsTypeOf.asInstanceOf[js.Any], LessThan = LessThan.asInstanceOf[js.Any], LessThanOrEqual = LessThanOrEqual.asInstanceOf[js.Any], NotEquals = NotEquals.asInstanceOf[js.Any], StartsWith = StartsWith.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
    __obj.asInstanceOf[FilterQueryOp]
  }
  @scala.inline
  implicit class FilterQueryOpOps[Self <: FilterQueryOp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll(value: FilterQueryOpSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("All")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAny(value: FilterQueryOpSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Any")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContains(value: FilterQueryOpSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndsWith(value: FilterQueryOpSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndsWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEquals(value: FilterQueryOpSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Equals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreaterThan(value: FilterQueryOpSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreaterThan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreaterThanOrEqual(value: FilterQueryOpSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreaterThanOrEqual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTypeOf(value: FilterQueryOpSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsTypeOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLessThan(value: FilterQueryOpSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LessThan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLessThanOrEqual(value: FilterQueryOpSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LessThanOrEqual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotEquals(value: FilterQueryOpSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NotEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartsWith(value: FilterQueryOpSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartsWith")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

