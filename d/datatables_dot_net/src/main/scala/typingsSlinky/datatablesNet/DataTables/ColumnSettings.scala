package typingsSlinky.datatablesNet.DataTables

import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "ajax-settings"
//#region "colunm-settings"
@js.native
trait ColumnSettings extends js.Object {
  /**
    * Cell type to be created for a column. th/td Since: 1.10
    */
  var cellType: js.UndefOr[String] = js.native
  /**
    * Class to assign to each cell in the column. Since: 1.10
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Add padding to the text content used when calculating the optimal with for a table. Since: 1.10
    */
  var contentPadding: js.UndefOr[String] = js.native
  /**
    * Cell created callback to allow DOM manipulation. Since: 1.10
    */
  var createdCell: js.UndefOr[FunctionColumnCreatedCell] = js.native
  /**
    * Class to assign to each cell in the column. Since: 1.10
    */
  var data: js.UndefOr[Double | String | ObjectColumnData | FunctionColumnData | Null] = js.native
  /**
    * Set default, static, content for a column. Since: 1.10
    */
  var defaultContent: js.UndefOr[String] = js.native
  /**
    * Set a descriptive name for a column. Since: 1.10
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Define multiple column ordering as the default order for a column. Since: 1.10
    */
  var orderData: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * Live DOM sorting type assignment. Since: 1.10
    */
  var orderDataType: js.UndefOr[String] = js.native
  /**
    * Ordering to always be applied to the table. Since 1.10
    *
    * Array type is prefix ordering only and is a two-element array:
    * 0: Column index to order upon.
    * 1: Direction so order to apply ("asc" for ascending order or "desc" for descending order).
    */
  var orderFixed: js.UndefOr[js.Array[_] | ObjectOrderFixed] = js.native
  /**
    * Order direction application sequence. Since: 1.10
    */
  var orderSequence: js.UndefOr[js.Array[String]] = js.native
  /**
    * Enable or disable ordering on this column. Since: 1.10
    */
  var orderable: js.UndefOr[Boolean] = js.native
  /**
    * Render (process) the data for use in the table. Since: 1.10
    */
  var render: js.UndefOr[Double | String | ObjectColumnData | FunctionColumnRender | ObjectColumnRender] = js.native
  /**
    * Enable or disable filtering on the data in this column. Since: 1.10
    */
  var searchable: js.UndefOr[Boolean] = js.native
  /**
    * Set the column title. Since: 1.10
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Set the column type - used for filtering and sorting string processing. Since: 1.10
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Enable or disable the display of this column. Since: 1.10
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Column width assignment. Since: 1.10
    */
  var width: js.UndefOr[String] = js.native
}

object ColumnSettings {
  @scala.inline
  def apply(): ColumnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSettings]
  }
  @scala.inline
  implicit class ColumnSettingsOps[Self <: ColumnSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCellType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCellType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellType")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withContentPadding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedCell(
      value: (/* cell */ Node, /* cellData */ js.Any, /* rowData */ js.Any, /* row */ Double, /* col */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdCell")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutCreatedCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdCell")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: Double | String | ObjectColumnData | FunctionColumnData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(null)
        ret
    }
    @scala.inline
    def withDefaultContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultContent")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderData(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderData")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderDataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderDataType")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderFixed(value: js.Array[_] | ObjectOrderFixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderFixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderFixed")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderSequence(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderSequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderSequence")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderable")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withRender(value: Double | String | ObjectColumnData | FunctionColumnRender | ObjectColumnRender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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

