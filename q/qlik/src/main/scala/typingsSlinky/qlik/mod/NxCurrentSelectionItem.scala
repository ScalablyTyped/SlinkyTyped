package typingsSlinky.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NxCurrentSelectionItem extends js.Object {
  var qField: String = js.native
  var qIsNum: js.UndefOr[Boolean] = js.native
  var qLocked: js.UndefOr[Boolean] = js.native
  var qNotSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo] = js.native
  var qOneAndOnlyOne: js.UndefOr[Boolean] = js.native
  var qRangeInfo: js.Array[RangeSelectInfo] = js.native
  var qSelected: String = js.native
  var qSelectedCount: Double = js.native
  var qSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo] = js.native
  var qSelectionThreshold: Double = js.native
  var qSortIndex: Double = js.native
  var qStateCounts: NxStateCounts = js.native
  var qTextSearch: js.UndefOr[String] = js.native
  var qTotal: Double = js.native
}

object NxCurrentSelectionItem {
  @scala.inline
  def apply(
    qField: String,
    qNotSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo],
    qRangeInfo: js.Array[RangeSelectInfo],
    qSelected: String,
    qSelectedCount: Double,
    qSelectedFieldSelectionInfo: js.Array[NxFieldSelectionInfo],
    qSelectionThreshold: Double,
    qSortIndex: Double,
    qStateCounts: NxStateCounts,
    qTotal: Double
  ): NxCurrentSelectionItem = {
    val __obj = js.Dynamic.literal(qField = qField.asInstanceOf[js.Any], qNotSelectedFieldSelectionInfo = qNotSelectedFieldSelectionInfo.asInstanceOf[js.Any], qRangeInfo = qRangeInfo.asInstanceOf[js.Any], qSelected = qSelected.asInstanceOf[js.Any], qSelectedCount = qSelectedCount.asInstanceOf[js.Any], qSelectedFieldSelectionInfo = qSelectedFieldSelectionInfo.asInstanceOf[js.Any], qSelectionThreshold = qSelectionThreshold.asInstanceOf[js.Any], qSortIndex = qSortIndex.asInstanceOf[js.Any], qStateCounts = qStateCounts.asInstanceOf[js.Any], qTotal = qTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxCurrentSelectionItem]
  }
  @scala.inline
  implicit class NxCurrentSelectionItemOps[Self <: NxCurrentSelectionItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQNotSelectedFieldSelectionInfo(value: js.Array[NxFieldSelectionInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNotSelectedFieldSelectionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQRangeInfo(value: js.Array[RangeSelectInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qRangeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSelectedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSelectedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSelectedFieldSelectionInfo(value: js.Array[NxFieldSelectionInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSelectedFieldSelectionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSelectionThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSelectionThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSortIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSortIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQStateCounts(value: NxStateCounts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStateCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIsNum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQIsNum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsNum")(js.undefined)
        ret
    }
    @scala.inline
    def withQLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLocked")(js.undefined)
        ret
    }
    @scala.inline
    def withQOneAndOnlyOne(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOneAndOnlyOne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQOneAndOnlyOne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOneAndOnlyOne")(js.undefined)
        ret
    }
    @scala.inline
    def withQTextSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTextSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQTextSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTextSearch")(js.undefined)
        ret
    }
  }
  
}

