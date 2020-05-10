package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeaturesLegacy extends js.Object {
  var bAutoWidth: Boolean = js.native
  var bDeferRender: Boolean = js.native
  var bFilter: Boolean = js.native
  var bInfo: Boolean = js.native
  var bLengthChange: Boolean = js.native
  var bPaginate: Boolean = js.native
  var bProcessing: Boolean = js.native
  var bServerSide: Boolean = js.native
  var bSort: Boolean = js.native
  var bSortClasses: Boolean = js.native
  var bStateSave: Boolean = js.native
}

object FeaturesLegacy {
  @scala.inline
  def apply(
    bAutoWidth: Boolean,
    bDeferRender: Boolean,
    bFilter: Boolean,
    bInfo: Boolean,
    bLengthChange: Boolean,
    bPaginate: Boolean,
    bProcessing: Boolean,
    bServerSide: Boolean,
    bSort: Boolean,
    bSortClasses: Boolean,
    bStateSave: Boolean
  ): FeaturesLegacy = {
    val __obj = js.Dynamic.literal(bAutoWidth = bAutoWidth.asInstanceOf[js.Any], bDeferRender = bDeferRender.asInstanceOf[js.Any], bFilter = bFilter.asInstanceOf[js.Any], bInfo = bInfo.asInstanceOf[js.Any], bLengthChange = bLengthChange.asInstanceOf[js.Any], bPaginate = bPaginate.asInstanceOf[js.Any], bProcessing = bProcessing.asInstanceOf[js.Any], bServerSide = bServerSide.asInstanceOf[js.Any], bSort = bSort.asInstanceOf[js.Any], bSortClasses = bSortClasses.asInstanceOf[js.Any], bStateSave = bStateSave.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturesLegacy]
  }
  @scala.inline
  implicit class FeaturesLegacyOps[Self <: FeaturesLegacy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBAutoWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bAutoWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBDeferRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bDeferRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBLengthChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bLengthChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBPaginate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bPaginate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBProcessing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBServerSide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bServerSide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBSort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBSortClasses(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bSortClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBStateSave(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bStateSave")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

