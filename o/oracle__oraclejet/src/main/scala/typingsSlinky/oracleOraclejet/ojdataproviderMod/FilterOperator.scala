package typingsSlinky.oracleOraclejet.ojdataproviderMod

import typingsSlinky.oracleOraclejet.ojdataproviderMod.AttributeFilterOperator.AttributeOperator
import typingsSlinky.oracleOraclejet.ojdataproviderMod.CompoundFilterOperator.CompoundOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterOperator[D] extends js.Object {
  var op: AttributeOperator | CompoundOperator = js.native
  def filter(data: js.Array[_]): js.Array[_] = js.native
}

object FilterOperator {
  @scala.inline
  def apply[D](filter: js.Array[_] => js.Array[_], op: AttributeOperator | CompoundOperator): FilterOperator[D] = {
    val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOperator[D]]
  }
  @scala.inline
  implicit class FilterOperatorOps[Self[d] <: FilterOperator[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withFilter(value: js.Array[_] => js.Array[_]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOp(value: AttributeOperator | CompoundOperator): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

