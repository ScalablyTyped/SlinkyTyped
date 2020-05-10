package typingsSlinky.oracleOraclejet.ojdataproviderMod

import typingsSlinky.oracleOraclejet.ojdataproviderMod.CompoundFilterOperator.CompoundOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompoundFilterOperator_[D] extends js.Object {
  var criteria: js.Array[FilterOperator[D]] = js.native
  var op: CompoundOperator = js.native
}

object CompoundFilterOperator_ {
  @scala.inline
  def apply[D](criteria: js.Array[FilterOperator[D]], op: CompoundOperator): CompoundFilterOperator_[D] = {
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompoundFilterOperator_[D]]
  }
  @scala.inline
  implicit class CompoundFilterOperator_Ops[Self[d] <: CompoundFilterOperator_[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withCriteria(value: js.Array[FilterOperator[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("criteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOp(value: CompoundOperator): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("op")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

