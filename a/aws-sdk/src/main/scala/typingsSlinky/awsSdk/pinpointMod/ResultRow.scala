package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultRow extends js.Object {
  /**
    * An array of objects that defines the field and field values that were used to group data in a result set that contains multiple results. This value is null if the data in a result set isn’t grouped.
    */
  var GroupedBys: ListOfResultRowValue = js.native
  /**
    * An array of objects that provides pre-aggregated values for a standard metric that applies to an application, campaign, or journey.
    */
  var Values: ListOfResultRowValue = js.native
}

object ResultRow {
  @scala.inline
  def apply(GroupedBys: ListOfResultRowValue, Values: ListOfResultRowValue): ResultRow = {
    val __obj = js.Dynamic.literal(GroupedBys = GroupedBys.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultRow]
  }
  @scala.inline
  implicit class ResultRowOps[Self <: ResultRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupedBys(value: ListOfResultRowValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupedBys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: ListOfResultRowValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

