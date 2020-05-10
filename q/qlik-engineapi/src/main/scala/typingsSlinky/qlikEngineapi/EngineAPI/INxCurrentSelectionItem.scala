package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxCurrentSelectionItem...
  */
@js.native
trait INxCurrentSelectionItem extends js.Object {
  /**
    * Name of the field that is selected.
    */
  var qField: String = js.native
  /**
    * Optional parameter. This parameter is displayed if its value is true.
    * Is set to true if the field is a numeric.
    */
  var qIsNum: js.UndefOr[Boolean] = js.native
  /**
    * Optional parameter. This parameter is displayed if its value is true.
    * Is set to true if the field is locked.
    */
  var qLocked: js.UndefOr[Boolean] = js.native
  /**
    * Information about the fields that are not selected.
    */
  var qNotSelectedFieldSelectionInfo: js.Array[INxFieldSelectionInfo] = js.native
  /**
    * Optional parameter. This parameter is displayed if its value is true.
    * Property that is set to a field. Is set to true if the field cannot be unselected.
    */
  var qOneAndOnlyOne: js.UndefOr[Boolean] = js.native
  /**
    * Information about the range of selected values.
    * Is empty if there is no range of selected values.
    */
  var qRangeInfo: js.Array[IRangeSelectInfo] = js.native
  /**
    * Label that, if defined, is displayed in current selections instead of the actual expression.
    */
  var qReadableName: String = js.native
  /**
    * Values that are selected.
    */
  var qSelected: String = js.native
  /**
    * Number of values that are selected.
    */
  var qSelectedCount: Double = js.native
  /**
    * Information about the fields that are selected.
    */
  var qSelectedFieldSelectionInfo: js.Array[INxFieldSelectionInfo] = js.native
  /**
    * Maximum values to show in the current selections.
    * >> The default value is 6.
    */
  var qSelectionThreshold: Double = js.native
  /**
    * Sort index of the field. Indexing starts from 0.
    */
  var qSortIndex: Double = js.native
  /**
    * Number of values in a particular state.
    */
  var qStateCounts: INxStateCounts = js.native
  /**
    * Optional parameter.
    * Text that was used for the search.
    * This parameter is filled when searching for a value and selecting it.
    */
  var qTextSearch: js.UndefOr[String] = js.native
  /**
    * Number of values in the field.
    */
  var qTotal: Double = js.native
}

object INxCurrentSelectionItem {
  @scala.inline
  def apply(
    qField: String,
    qNotSelectedFieldSelectionInfo: js.Array[INxFieldSelectionInfo],
    qRangeInfo: js.Array[IRangeSelectInfo],
    qReadableName: String,
    qSelected: String,
    qSelectedCount: Double,
    qSelectedFieldSelectionInfo: js.Array[INxFieldSelectionInfo],
    qSelectionThreshold: Double,
    qSortIndex: Double,
    qStateCounts: INxStateCounts,
    qTotal: Double
  ): INxCurrentSelectionItem = {
    val __obj = js.Dynamic.literal(qField = qField.asInstanceOf[js.Any], qNotSelectedFieldSelectionInfo = qNotSelectedFieldSelectionInfo.asInstanceOf[js.Any], qRangeInfo = qRangeInfo.asInstanceOf[js.Any], qReadableName = qReadableName.asInstanceOf[js.Any], qSelected = qSelected.asInstanceOf[js.Any], qSelectedCount = qSelectedCount.asInstanceOf[js.Any], qSelectedFieldSelectionInfo = qSelectedFieldSelectionInfo.asInstanceOf[js.Any], qSelectionThreshold = qSelectionThreshold.asInstanceOf[js.Any], qSortIndex = qSortIndex.asInstanceOf[js.Any], qStateCounts = qStateCounts.asInstanceOf[js.Any], qTotal = qTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxCurrentSelectionItem]
  }
  @scala.inline
  implicit class INxCurrentSelectionItemOps[Self <: INxCurrentSelectionItem] (val x: Self) extends AnyVal {
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
    def withQNotSelectedFieldSelectionInfo(value: js.Array[INxFieldSelectionInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNotSelectedFieldSelectionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQRangeInfo(value: js.Array[IRangeSelectInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qRangeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQReadableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qReadableName")(value.asInstanceOf[js.Any])
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
    def withQSelectedFieldSelectionInfo(value: js.Array[INxFieldSelectionInfo]): Self = {
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
    def withQStateCounts(value: INxStateCounts): Self = {
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

