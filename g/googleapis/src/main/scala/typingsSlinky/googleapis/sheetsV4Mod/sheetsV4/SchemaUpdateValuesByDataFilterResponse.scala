package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response when updating a range of values by a data filter in a
  * spreadsheet.
  */
@js.native
trait SchemaUpdateValuesByDataFilterResponse extends js.Object {
  /**
    * The data filter that selected the range that was updated.
    */
  var dataFilter: js.UndefOr[SchemaDataFilter] = js.native
  /**
    * The number of cells updated.
    */
  var updatedCells: js.UndefOr[Double] = js.native
  /**
    * The number of columns where at least one cell in the column was updated.
    */
  var updatedColumns: js.UndefOr[Double] = js.native
  /**
    * The values of the cells in the range matched by the dataFilter after all
    * updates were applied. This is only included if the request&#39;s
    * `includeValuesInResponse` field was `true`.
    */
  var updatedData: js.UndefOr[SchemaValueRange] = js.native
  /**
    * The range (in A1 notation) that updates were applied to.
    */
  var updatedRange: js.UndefOr[String] = js.native
  /**
    * The number of rows where at least one cell in the row was updated.
    */
  var updatedRows: js.UndefOr[Double] = js.native
}

object SchemaUpdateValuesByDataFilterResponse {
  @scala.inline
  def apply(): SchemaUpdateValuesByDataFilterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateValuesByDataFilterResponse]
  }
  @scala.inline
  implicit class SchemaUpdateValuesByDataFilterResponseOps[Self <: SchemaUpdateValuesByDataFilterResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFilter(value: SchemaDataFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedCells(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedCells")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedData(value: SchemaValueRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedData")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedRange")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedRows")(js.undefined)
        ret
    }
  }
  
}

