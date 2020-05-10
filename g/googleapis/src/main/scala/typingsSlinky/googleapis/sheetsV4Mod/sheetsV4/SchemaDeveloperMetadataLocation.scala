package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A location where metadata may be associated in a spreadsheet.
  */
@js.native
trait SchemaDeveloperMetadataLocation extends js.Object {
  /**
    * Represents the row or column when metadata is associated with a
    * dimension. The specified DimensionRange must represent a single row or
    * column; it cannot be unbounded or span multiple rows or columns.
    */
  var dimensionRange: js.UndefOr[SchemaDimensionRange] = js.native
  /**
    * The type of location this object represents.  This field is read-only.
    */
  var locationType: js.UndefOr[String] = js.native
  /**
    * The ID of the sheet when metadata is associated with an entire sheet.
    */
  var sheetId: js.UndefOr[Double] = js.native
  /**
    * True when metadata is associated with an entire spreadsheet.
    */
  var spreadsheet: js.UndefOr[Boolean] = js.native
}

object SchemaDeveloperMetadataLocation {
  @scala.inline
  def apply(): SchemaDeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeveloperMetadataLocation]
  }
  @scala.inline
  implicit class SchemaDeveloperMetadataLocationOps[Self <: SchemaDeveloperMetadataLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionRange(value: SchemaDimensionRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionRange")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationType")(js.undefined)
        ret
    }
    @scala.inline
    def withSheetId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheetId")(js.undefined)
        ret
    }
    @scala.inline
    def withSpreadsheet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spreadsheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpreadsheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spreadsheet")(js.undefined)
        ret
    }
  }
  
}

