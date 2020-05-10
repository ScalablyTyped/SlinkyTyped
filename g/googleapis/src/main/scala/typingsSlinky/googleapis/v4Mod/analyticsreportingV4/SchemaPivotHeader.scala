package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The headers for each of the pivot sections defined in the request.
  */
@js.native
trait SchemaPivotHeader extends js.Object {
  /**
    * A single pivot section header.
    */
  var pivotHeaderEntries: js.UndefOr[js.Array[SchemaPivotHeaderEntry]] = js.native
  /**
    * The total number of groups for this pivot.
    */
  var totalPivotGroupsCount: js.UndefOr[Double] = js.native
}

object SchemaPivotHeader {
  @scala.inline
  def apply(): SchemaPivotHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotHeader]
  }
  @scala.inline
  implicit class SchemaPivotHeaderOps[Self <: SchemaPivotHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPivotHeaderEntries(value: js.Array[SchemaPivotHeaderEntry]): Self = {
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

