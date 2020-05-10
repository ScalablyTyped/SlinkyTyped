package typingsSlinky.ngTable.publicInterfacesMod

import typingsSlinky.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDynamicTableColDef extends js.Object {
  /**
    * Custom CSS class that should be added to the `th` tag(s) of this column in the table header
    */
  var `class`: js.UndefOr[DynamicTableColField[String]] = js.native
  /**
    * The definition of 0 or more html filter templates that should be rendered for this column in
    * the table header
    */
  var filter: js.UndefOr[DynamicTableColField[IFilterTemplateDefMap]] = js.native
  /**
    * Supplies the `ISelectOption`s that can be used in a html filter template for this colums.
    * At the creation of the `NgTableParams` this field will be called and the result then assigned
    * to the `data` field of this column.
    */
  var filterData: js.UndefOr[DynamicTableColField[IPromise[SelectData] | SelectData]] = js.native
  /**
    * The name of the data row field that will be used to group on, or false when this column
    * does not support grouping
    */
  var groupable: js.UndefOr[DynamicTableColField[String | Boolean]] = js.native
  /**
    * The url of a custom html template that should be used to render a table header for this column
    */
  var headerTemplateURL: js.UndefOr[DynamicTableColField[String | Boolean]] = js.native
  /**
    * The text that should be used as a tooltip for this column in the table header
    */
  var headerTitle: js.UndefOr[DynamicTableColField[String]] = js.native
  /**
    * Determines whether this column should be displayed in the table
    */
  var show: js.UndefOr[DynamicTableColField[Boolean]] = js.native
  /**
    * The name of the data row field that will be used to sort on, or false when this column
    * does not support sorting
    */
  var sortable: js.UndefOr[DynamicTableColField[String | Boolean]] = js.native
  /**
    * The title of this column that should be displayed in the table header
    */
  var title: js.UndefOr[DynamicTableColField[String]] = js.native
  /**
    * An alternate column title. Typically this can be used for responsive table layouts
    * where the titleAlt should be used for small screen sizes
    */
  var titleAlt: js.UndefOr[DynamicTableColField[String]] = js.native
}

object IDynamicTableColDef {
  @scala.inline
  def apply(): IDynamicTableColDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDynamicTableColDef]
  }
  @scala.inline
  implicit class IDynamicTableColDefOps[Self <: IDynamicTableColDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassFunction1(value: /* context */ ColumnFieldContext => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClass(value: DynamicTableColField[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterFunction1(value: /* context */ ColumnFieldContext => IFilterTemplateDefMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilter(value: DynamicTableColField[IFilterTemplateDefMap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterDataFunction1(value: /* context */ ColumnFieldContext => IPromise[SelectData] | SelectData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilterDataFunction0(value: () => js.Array[ISelectOption] | IPromise[js.Array[ISelectOption]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFilterData(value: DynamicTableColField[IPromise[SelectData] | SelectData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterData")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupableFunction1(value: /* context */ ColumnFieldContext => String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroupable(value: DynamicTableColField[String | Boolean]): Self = {
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
    def withHeaderTemplateURLFunction1(value: /* context */ ColumnFieldContext => String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplateURL")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaderTemplateURL(value: DynamicTableColField[String | Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplateURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTemplateURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplateURL")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTitleFunction1(value: /* context */ ColumnFieldContext => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaderTitle(value: DynamicTableColField[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFunction1(value: /* context */ ColumnFieldContext => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShow(value: DynamicTableColField[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withSortableFunction1(value: /* context */ ColumnFieldContext => String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSortable(value: DynamicTableColField[String | Boolean]): Self = {
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
    def withTitleFunction1(value: /* context */ ColumnFieldContext => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTitle(value: DynamicTableColField[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleAltFunction1(value: /* context */ ColumnFieldContext => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAlt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTitleAlt(value: DynamicTableColField[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAlt")(js.undefined)
        ret
    }
  }
  
}

