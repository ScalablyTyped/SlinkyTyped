package typingsSlinky.dojo.dojox.grid.enhanced.plugins.filter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/enhanced/plugins/filter/_DataExprs.html
  *
  *
  */
@js.native
trait DataExprs_ extends js.Object {
  /**
    *
    */
  def BooleanExpr(): Unit = js.native
  /**
    *
    */
  def DateExpr(): Unit = js.native
  /**
    *
    */
  def NumberExpr(): Unit = js.native
  /**
    *
    */
  def StringExpr(): Unit = js.native
  /**
    *
    */
  def TimeExpr(): Unit = js.native
}

object DataExprs_ {
  @scala.inline
  def apply(
    BooleanExpr: () => Unit,
    DateExpr: () => Unit,
    NumberExpr: () => Unit,
    StringExpr: () => Unit,
    TimeExpr: () => Unit
  ): DataExprs_ = {
    val __obj = js.Dynamic.literal(BooleanExpr = js.Any.fromFunction0(BooleanExpr), DateExpr = js.Any.fromFunction0(DateExpr), NumberExpr = js.Any.fromFunction0(NumberExpr), StringExpr = js.Any.fromFunction0(StringExpr), TimeExpr = js.Any.fromFunction0(TimeExpr))
    __obj.asInstanceOf[DataExprs_]
  }
  @scala.inline
  implicit class DataExprs_Ops[Self <: DataExprs_] (val x: Self) extends AnyVal {
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
    def withDateExpr(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateExpr")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNumberExpr(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberExpr")(js.Any.fromFunction0(value))
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

