package typingsSlinky.ngGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnDef extends js.Object {
  /** String name for filter to use on the aggregate label ('currency', 'date', etc..) defaults to cellFilter if not set. */
  var aggLabelFilter: js.UndefOr[String] = js.native
  /** User defined CSS class name */
  var cellClass: js.UndefOr[String] = js.native
  /** Controls when to use the edit template on per-row basis using an angular expression (enableCellEdit must also be true for editing)*/
  var cellEditableCondition: js.UndefOr[String] = js.native
  /** string name for filter to use on the cell ('currency', 'date', etc..) */
  var cellFilter: js.UndefOr[String] = js.native
  /** Html template used to render the cell */
  var cellTemplate: js.UndefOr[String] = js.native
  /** What to display in the column header */
  var displayName: js.UndefOr[String] = js.native
  /** The template to use while editing */
  var editableCellTemplate: js.UndefOr[String] = js.native
  /** Allows the cell to use an edit template when focused (grid option enableCellSelection must be enabled)*/
  var enableCellEdit: js.UndefOr[Boolean] = js.native
  /** Can also be a property path on your data model. "foo.bar.myField", "Name.First", etc..*/
  var field: js.UndefOr[String] = js.native
  /** Allows the column to be grouped with drag and drop, but has no effect on gridOptions.groups */
  var groupable: js.UndefOr[Boolean] = js.native
  /** Html template used to render the header cell */
  var headerCellTemplate: js.UndefOr[String] = js.native
  /** User defined CSS class name for the header cell */
  var headerClass: js.UndefOr[String] = js.native
  /** The minum width the column is allowed to be. See width for the different options */
  var minWidth: js.UndefOr[js.Any] = js.native
  /** Allows the column to be pinned when enablePinning is set to true */
  var pinnable: js.UndefOr[Boolean] = js.native
  var pinned: js.UndefOr[Boolean] = js.native
  /** Restrict or allow the column to be resized */
  var resizable: js.UndefOr[Boolean] = js.native
  /** The funtion to use when filtering values in this column */
  var sortFn: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.native
  /** Restrict or allow the column to be sorted */
  var sortable: js.UndefOr[Boolean] = js.native
  /** Set the default visiblity of the column */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * This can be an absolute numberor it can also be defined in percentages (20%, 30%),
    * in weighted *s, or "auto" (which sizes the column based on data length)
    * (much like WPF/Silverlight)/ note: "auto" only works in single page apps currently because the re-size
    * happens on "document.ready
    */
  var width: js.UndefOr[js.Any] = js.native
}

object IColumnDef {
  @scala.inline
  def apply(): IColumnDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumnDef]
  }
  @scala.inline
  implicit class IColumnDefOps[Self <: IColumnDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggLabelFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggLabelFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggLabelFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggLabelFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withCellClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCellEditableCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditableCondition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellEditableCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellEditableCondition")(js.undefined)
        ret
    }
    @scala.inline
    def withCellFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withCellTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEditableCellTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editableCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditableCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editableCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableCellEdit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCellEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCellEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupable")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderCellTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderCellTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerCellTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withPinnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinnable")(js.undefined)
        ret
    }
    @scala.inline
    def withPinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPinned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withSortFn(value: (/* a */ js.Any, /* b */ js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSortFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortFn")(js.undefined)
        ret
    }
    @scala.inline
    def withSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

