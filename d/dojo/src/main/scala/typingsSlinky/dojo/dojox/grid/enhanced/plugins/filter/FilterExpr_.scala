package typingsSlinky.dojo.dojox.grid.enhanced.plugins.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_FilterExpr.html
  *
  *
  */
@js.native
trait FilterExpr_ extends js.Object {
  /**
    *
    */
  def BooleanExpr(): Unit = js.native
  /**
    *
    */
  def Contains(): Unit = js.native
  /**
    *
    */
  def DateExpr(): Unit = js.native
  /**
    *
    */
  def EndsWith(): Unit = js.native
  /**
    *
    */
  def EqualTo(): Unit = js.native
  /**
    *
    */
  def IsEmpty(): Unit = js.native
  /**
    *
    */
  def LargerThan(): Unit = js.native
  /**
    *
    */
  def LargerThanOrEqualTo(): Unit = js.native
  /**
    *
    */
  def LessThan(): Unit = js.native
  /**
    *
    */
  def LessThanOrEqualTo(): Unit = js.native
  /**
    *
    */
  def LogicALL(): Unit = js.native
  /**
    *
    */
  def LogicAND(): Unit = js.native
  /**
    *
    */
  def LogicANY(): Unit = js.native
  /**
    *
    */
  def LogicNOT(): Unit = js.native
  /**
    *
    */
  def LogicOR(): Unit = js.native
  /**
    *
    */
  def LogicXOR(): Unit = js.native
  /**
    *
    */
  def Matches(): Unit = js.native
  /**
    *
    */
  def NumberExpr(): Unit = js.native
  /**
    *
    */
  def StartsWith(): Unit = js.native
  /**
    *
    */
  def StringExpr(): Unit = js.native
  /**
    *
    */
  def TimeExpr(): Unit = js.native
}

object FilterExpr_ {
  @scala.inline
  def apply(
    BooleanExpr: () => Unit,
    Contains: () => Unit,
    DateExpr: () => Unit,
    EndsWith: () => Unit,
    EqualTo: () => Unit,
    IsEmpty: () => Unit,
    LargerThan: () => Unit,
    LargerThanOrEqualTo: () => Unit,
    LessThan: () => Unit,
    LessThanOrEqualTo: () => Unit,
    LogicALL: () => Unit,
    LogicAND: () => Unit,
    LogicANY: () => Unit,
    LogicNOT: () => Unit,
    LogicOR: () => Unit,
    LogicXOR: () => Unit,
    Matches: () => Unit,
    NumberExpr: () => Unit,
    StartsWith: () => Unit,
    StringExpr: () => Unit,
    TimeExpr: () => Unit
  ): FilterExpr_ = {
    val __obj = js.Dynamic.literal(BooleanExpr = js.Any.fromFunction0(BooleanExpr), Contains = js.Any.fromFunction0(Contains), DateExpr = js.Any.fromFunction0(DateExpr), EndsWith = js.Any.fromFunction0(EndsWith), EqualTo = js.Any.fromFunction0(EqualTo), IsEmpty = js.Any.fromFunction0(IsEmpty), LargerThan = js.Any.fromFunction0(LargerThan), LargerThanOrEqualTo = js.Any.fromFunction0(LargerThanOrEqualTo), LessThan = js.Any.fromFunction0(LessThan), LessThanOrEqualTo = js.Any.fromFunction0(LessThanOrEqualTo), LogicALL = js.Any.fromFunction0(LogicALL), LogicAND = js.Any.fromFunction0(LogicAND), LogicANY = js.Any.fromFunction0(LogicANY), LogicNOT = js.Any.fromFunction0(LogicNOT), LogicOR = js.Any.fromFunction0(LogicOR), LogicXOR = js.Any.fromFunction0(LogicXOR), Matches = js.Any.fromFunction0(Matches), NumberExpr = js.Any.fromFunction0(NumberExpr), StartsWith = js.Any.fromFunction0(StartsWith), StringExpr = js.Any.fromFunction0(StringExpr), TimeExpr = js.Any.fromFunction0(TimeExpr))
    __obj.asInstanceOf[FilterExpr_]
  }
  @scala.inline
  implicit class FilterExpr_Ops[Self <: FilterExpr_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBooleanExpr(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BooleanExpr")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContains(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contains")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDateExpr(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateExpr")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEndsWith(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndsWith")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEqualTo(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EqualTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLargerThan(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LargerThan")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLargerThanOrEqualTo(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LargerThanOrEqualTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLessThan(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LessThan")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLessThanOrEqualTo(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LessThanOrEqualTo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogicALL(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicALL")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogicAND(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicAND")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogicANY(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicANY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogicNOT(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicNOT")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogicOR(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicOR")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLogicXOR(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicXOR")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMatches(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Matches")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNumberExpr(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberExpr")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStartsWith(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartsWith")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStringExpr(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringExpr")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTimeExpr(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeExpr")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

