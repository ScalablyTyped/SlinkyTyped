package typingsSlinky.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupByCustomField extends js.Object {
  var groupByCustomField: js.UndefOr[String] = js.native
  var settlementDate: String = js.native
}

object GroupByCustomField {
  @scala.inline
  def apply(settlementDate: String): GroupByCustomField = {
    val __obj = js.Dynamic.literal(settlementDate = settlementDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupByCustomField]
  }
  @scala.inline
  implicit class GroupByCustomFieldOps[Self <: GroupByCustomField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSettlementDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settlementDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupByCustomField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByCustomField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupByCustomField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupByCustomField")(js.undefined)
        ret
    }
  }
  
}

