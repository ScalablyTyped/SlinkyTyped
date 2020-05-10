package typingsSlinky.knockoutKogrid.kg

import typingsSlinky.jquery.JQueryGenericPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnDef extends js.Object {
  /** Appends a css class for the column cells */
  var cellClass: js.UndefOr[String] = js.native
  /**
    * A function which takes the value of the cell and returns the display value. Useful when your data model has an underlying value which you need to convert to a human readable format.
    * @param val 
    * @returns the display value
    * @example function(unixTimeTicks) { return new Date(unixTimeTicks); }
    */
  var cellFormatter: js.UndefOr[js.Function1[/* val */ js.Any, String]] = js.native
  /**Sets the cell template for the column. See github wiki for more details.*/
  var cellTemplate: js.UndefOr[String | JQueryGenericPromise[String]] = js.native
  /** Sets the pretty display name of the column. default is the field given */
  var displayName: js.UndefOr[String] = js.native
  /** The string name of the property in your data model you want that column to represent. Can also be a property path on your data model. 'foo.bar.myField', 'Name.First', etc.. */
  var field: String = js.native
  /** Sets the template for the column header cell. See github wiki for more details. */
  var headerCellTemplate: js.UndefOr[String | JQueryGenericPromise[String]] = js.native
  /** Appends a css class for the column header. */
  var headerClass: js.UndefOr[String] = js.native
  /**Sets the maximum width of the column.*/
  var maxWidth: js.UndefOr[Double] = js.native
  /**Whether or not column is resizable. */
  var resizable: js.UndefOr[Boolean] = js.native
  /** Sets the sort function for the column. Useful when you have data that is formatted in an unusal way or if you want to sort on an underlying data type. Example: function(a,b){return a > b} */
  var sortFn: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]] = js.native
  /**Whether or not column is sortable. */
  var sortable: js.UndefOr[Boolean] = js.native
  /** Sets the width of the column. Can be a fixed width in pixels as an int (42), string px('42px'), percentage string ('42%'), weighted asterisks (width divided by total number of *'s is all column definition widths) See github wiki for more details. */
  var width: js.UndefOr[String] = js.native
}

object ColumnDef {
  @scala.inline
  def apply(field: String): ColumnDef = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDef]
  }
  @scala.inline
  implicit class ColumnDefOps[Self <: ColumnDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
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
    def withCellFormatter(value: /* val */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCellFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withCellTemplate(value: String | JQueryGenericPromise[String]): Self = {
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
    def withHeaderCellTemplate(value: String | JQueryGenericPromise[String]): Self = {
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
    def withMaxWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
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
    def withWidth(value: String): Self = {
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

