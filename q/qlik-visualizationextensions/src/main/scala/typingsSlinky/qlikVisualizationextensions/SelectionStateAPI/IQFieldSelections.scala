package typingsSlinky.qlikVisualizationextensions.SelectionStateAPI

import typingsSlinky.qlikVisualizationextensions.FieldAPI.IQField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQFieldSelections extends js.Object {
  /**
    * Reference to the field.
    */
  var field: IQField = js.native
  /**
    * Selection state for a field.
    */
  var fieldName: String = js.native
  /**
    * Defines if the field is numeric.
    */
  var isNumeric: Boolean = js.native
  /**
    * Defines if the field is locked.
    */
  var locked: Boolean = js.native
  /**
    * Array with maximum of qSelectionThreshold values that are not selected.
    * For each value, the text plus the selection mode (NORMAL/AND/NOT)
    */
  var notSelectedValues: js.Array[Double] = js.native
  /**
    * Concatenated string of selected values if number of values are less
    * than the threshold, or if the string is of format "7 of 123".
    */
  var qSelected: String = js.native
  /**
    * Number of values that will be listed.
    */
  var qSelectionThreshold: Double = js.native
  /**
    * Sort index. Starting from 0.
    */
  var qSortIndex: Double = js.native
  /**
    * Object with number of values in different states.
    */
  var qStateCounts: js.Any = js.native
  /**
    * Number of selected values.
    */
  var selectedCount: Double = js.native
  /**
    * Array with maximum of qSelectionThreshold values that are selected.
    * For each value, the text plus the selection mode (NORMAL/AND/NOT)
    */
  var selectedValues: js.Array[Double] = js.native
  /**
    * Total number of values in the field.
    */
  var totalCount: Double = js.native
}

object IQFieldSelections {
  @scala.inline
  def apply(
    field: IQField,
    fieldName: String,
    isNumeric: Boolean,
    locked: Boolean,
    notSelectedValues: js.Array[Double],
    qSelected: String,
    qSelectionThreshold: Double,
    qSortIndex: Double,
    qStateCounts: js.Any,
    selectedCount: Double,
    selectedValues: js.Array[Double],
    totalCount: Double
  ): IQFieldSelections = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], isNumeric = isNumeric.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], notSelectedValues = notSelectedValues.asInstanceOf[js.Any], qSelected = qSelected.asInstanceOf[js.Any], qSelectionThreshold = qSelectionThreshold.asInstanceOf[js.Any], qSortIndex = qSortIndex.asInstanceOf[js.Any], qStateCounts = qStateCounts.asInstanceOf[js.Any], selectedCount = selectedCount.asInstanceOf[js.Any], selectedValues = selectedValues.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQFieldSelections]
  }
  @scala.inline
  implicit class IQFieldSelectionsOps[Self <: IQFieldSelections] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: IQField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNumeric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNumeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotSelectedValues(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notSelectedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSelected")(value.asInstanceOf[js.Any])
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
    def withQStateCounts(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qStateCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedValues(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

