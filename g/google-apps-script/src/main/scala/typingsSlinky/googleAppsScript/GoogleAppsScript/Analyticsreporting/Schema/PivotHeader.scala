package typingsSlinky.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotHeader extends js.Object {
  var pivotHeaderEntries: js.UndefOr[js.Array[PivotHeaderEntry]] = js.native
  var totalPivotGroupsCount: js.UndefOr[Double] = js.native
}

object PivotHeader {
  @scala.inline
  def apply(): PivotHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotHeader]
  }
  @scala.inline
  implicit class PivotHeaderOps[Self <: PivotHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPivotHeaderEntries(value: js.Array[PivotHeaderEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotHeaderEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPivotHeaderEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pivotHeaderEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalPivotGroupsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPivotGroupsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalPivotGroupsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPivotGroupsCount")(js.undefined)
        ret
    }
  }
  
}

