package typingsSlinky.reactBootstrapTable.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectRow[TRow /* <: js.Object */] extends js.Object {
  /**
  	 * You can assign the background color of row which be selected.
  	 * If your requirement is much complex, you can assign a function to bgColor that
  	 * returns a css color string.
  	 */
  var bgColor: js.UndefOr[String | (js.Function2[/* row */ TRow, /* isSelect */ Boolean, String])] = js.native
  /**
  	 * You can assign the class name of selected rows. This can either be a string, or a function that takes two
  	 * arguments: row and isSelect.
  	 *   `row`: The current row data.
  	 *   `isSelect`: Flag indicating whether this particular row is selected.
  	 */
  var className: js.UndefOr[String | (js.Function2[/* row */ TRow, /* isSelect */ Boolean, String])] = js.native
  /**
  	 * If true, clicking the row will trigger expanding the row. Default is false.
  	 */
  var clickToExpand: js.UndefOr[Boolean] = js.native
  /**
  	 * If true, clicking the row will trigger selection on that row, default is false.
  	 */
  var clickToSelect: js.UndefOr[Boolean] = js.native
  /**
  	 * If true, clicking the row will trigger selection on that row and also trigger cell editing if you enabled cell edit. Default is false.
  	 */
  var clickToSelectAndEditCell: js.UndefOr[Boolean] = js.native
  /**
  	 * You can change the width of the selection column by columnWidth (include units).
  	 */
  var columnWidth: js.UndefOr[String] = js.native
  /**
  	 * Function that returns a component to customize the display of the selection checkbox or radio button with.
  	 */
  var customComponent: js.UndefOr[js.Function1[/* props */ CustomSelectProps, String | ReactElement]] = js.native
  /**
  	 * If true, the radio/checkbox column will be hidden.
  	 * You can enable this attribute if you enable clickToSelect and you don't want to show the selection column.
  	 */
  var hideSelectColumn: js.UndefOr[Boolean] = js.native
  /**
  	 * Specify whether the selection column uses single(radio) or multiple(checkbox) selection modes. Required.
  	 */
  var mode: SelectRowMode = js.native
  /**
  	 * Accept a custom callback function, if a row be selected or unselected, this function will be called.
  	 * This callback function takes four arguments: row, isSelected, event, and rowIndex:
  	 *   `row`: is the row data which you wanted to select or unselect.
  	 *   `isSelected`: it's a boolean value means "whether or not that row will be selected?".
  	 *   `event`: The event target object.
  	 *   `rowIndex`: the index number for the row.
  	 * If the return value of this (function) is false, the select or deselect action will not be applied.
  	 */
  var onSelect: js.UndefOr[
    js.Function4[
      /* row */ TRow, 
      /* isSelected */ Boolean, 
      /* event */ js.Any, 
      /* rowIndex */ Double, 
      Boolean | Unit
    ]
  ] = js.native
  /**
  	 * Accept a custom callback function, if click select all checkbox, this function will be called. This callback
  	 * function taking two arguments: isSelected, rows.
  	 * isSelectedis a boolean value which means "whether or not that row will be selected?".
  	 * rows is the rows which be selected or unselected.
  	 *
  	 * Tips:
  	 * If the return value of this function is false, the select all or deselect all action will not be applied.
  	 * If return value of this function is an array of rowkeys, this array will be applied as selection row when
  	 * select all triggers. It's useful when you have a validation to filter some rows on selecting all.
  	 */
  var onSelectAll: js.UndefOr[
    js.Function2[
      /* isSelected */ Boolean, 
      /* rows */ js.Array[TRow], 
      Boolean | (js.Array[Double | String])
    ]
  ] = js.native
  /**
  	 * Only unselect visible rows.
  	 */
  var onlyUnselectVisible: js.UndefOr[Boolean] = js.native
  /**
  	 * Give an array data to perform which rows you want to be selected when table loading.
  	 * The content of array should be the rowkeys for the rows that you want to be selected.
  	 */
  var selected: js.UndefOr[js.Array[Double | String]] = js.native
  /**
  	 * Default is false, if enabled, there will be a button on top of table for toggling selected rows only.
  	 */
  var showOnlySelected: js.UndefOr[Boolean] = js.native
  /**
  	 * Provide a list of unselectable row keys.
  	 */
  var unselectable: js.UndefOr[js.Array[Double | String]] = js.native
}

object SelectRow {
  @scala.inline
  def apply[TRow](mode: SelectRowMode): SelectRow[TRow] = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectRow[TRow]]
  }
  @scala.inline
  implicit class SelectRowOps[Self[trow] <: SelectRow[trow], TRow] (val x: Self[TRow]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TRow] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TRow]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TRow] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TRow] with Other]
    @scala.inline
    def withMode(value: SelectRowMode): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBgColorFunction2(value: (/* row */ TRow, /* isSelect */ Boolean) => String): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBgColor(value: String | (js.Function2[/* row */ TRow, /* isSelect */ Boolean, String])): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBgColor: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bgColor")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNameFunction2(value: (/* row */ TRow, /* isSelect */ Boolean) => String): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClassName(value: String | (js.Function2[/* row */ TRow, /* isSelect */ Boolean, String])): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClickToExpand(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickToExpand: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withClickToSelect(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickToSelect: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withClickToSelectAndEditCell(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToSelectAndEditCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickToSelectAndEditCell: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickToSelectAndEditCell")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnWidth(value: String): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnWidth: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomComponent(value: /* props */ CustomSelectProps => String | ReactElement): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomComponent: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withHideSelectColumn(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSelectColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideSelectColumn: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSelectColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(
      value: (/* row */ TRow, /* isSelected */ Boolean, /* event */ js.Any, /* rowIndex */ Double) => Boolean | Unit
    ): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectAll(
      value: (/* isSelected */ Boolean, /* rows */ js.Array[TRow]) => Boolean | (js.Array[Double | String])
    ): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectAll")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelectAll: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectAll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyUnselectVisible(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyUnselectVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyUnselectVisible: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyUnselectVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: js.Array[Double | String]): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOnlySelected(value: Boolean): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnlySelected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOnlySelected: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnlySelected")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselectable(value: js.Array[Double | String]): Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnselectable: Self[TRow] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselectable")(js.undefined)
        ret
    }
  }
  
}

