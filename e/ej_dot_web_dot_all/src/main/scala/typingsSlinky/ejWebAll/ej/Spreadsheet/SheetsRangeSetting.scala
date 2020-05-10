package typingsSlinky.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetsRangeSetting extends js.Object {
  /** Gets or sets the data to render the Spreadsheet.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Specifies the header styles for the headers in datasource range.
    * @Default {null}
    */
  var headerStyles: js.UndefOr[js.Any] = js.native
  /** Specifies the primary key for the datasource in Spreadsheet.
    */
  var primaryKey: js.UndefOr[String] = js.native
  /** Specifies the query for the datasource in Spreadsheet.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  /** Gets or sets a value that indicates whether to enable or disable the datasource header in Spreadsheet.
    * @Default {true}
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  /** Specifies the start cell for the datasource range in Spreadsheet.
    * @Default {A1}
    */
  var startCell: js.UndefOr[String] = js.native
}

object SheetsRangeSetting {
  @scala.inline
  def apply(): SheetsRangeSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetsRangeSetting]
  }
  @scala.inline
  implicit class SheetsRangeSettingOps[Self <: SheetsRangeSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderStyles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryKey")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withStartCell(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCell")(js.undefined)
        ret
    }
  }
  
}

