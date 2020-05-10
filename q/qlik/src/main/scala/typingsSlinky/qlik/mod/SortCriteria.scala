package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikNumbers.`-1`
import typingsSlinky.qlik.qlikNumbers.`0`
import typingsSlinky.qlik.qlikNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortCriteria extends js.Object {
  var qExpression: ValueExpr = js.native
  var qSortByAscii: `-1` | `0` | `1` = js.native
  var qSortByExpression: `-1` | `0` | `1` = js.native
  var qSortByFrequency: `-1` | `0` | `1` = js.native
  var qSortByLoadOrder: `-1` | `0` | `1` = js.native
  var qSortByNumeric: `-1` | `0` | `1` = js.native
  var qSortByState: `-1` | `0` | `1` = js.native
}

object SortCriteria {
  @scala.inline
  def apply(
    qExpression: ValueExpr,
    qSortByAscii: `-1` | `0` | `1`,
    qSortByExpression: `-1` | `0` | `1`,
    qSortByFrequency: `-1` | `0` | `1`,
    qSortByLoadOrder: `-1` | `0` | `1`,
    qSortByNumeric: `-1` | `0` | `1`,
    qSortByState: `-1` | `0` | `1`
  ): SortCriteria = {
    val __obj = js.Dynamic.literal(qExpression = qExpression.asInstanceOf[js.Any], qSortByAscii = qSortByAscii.asInstanceOf[js.Any], qSortByExpression = qSortByExpression.asInstanceOf[js.Any], qSortByFrequency = qSortByFrequency.asInstanceOf[js.Any], qSortByLoadOrder = qSortByLoadOrder.asInstanceOf[js.Any], qSortByNumeric = qSortByNumeric.asInstanceOf[js.Any], qSortByState = qSortByState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCriteria]
  }
  @scala.inline
  implicit class SortCriteriaOps[Self <: SortCriteria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQExpression(value: ValueExpr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSortByAscii(value: `-1` | `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByAscii")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSortByExpression(value: `-1` | `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSortByFrequency(value: `-1` | `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSortByLoadOrder(value: `-1` | `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByLoadOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSortByNumeric(value: `-1` | `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByNumeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSortByState(value: `-1` | `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortByState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

