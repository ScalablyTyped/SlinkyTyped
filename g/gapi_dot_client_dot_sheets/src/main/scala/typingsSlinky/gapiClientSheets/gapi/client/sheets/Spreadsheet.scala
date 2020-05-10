package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spreadsheet extends js.Object {
  /** The developer metadata associated with a spreadsheet. */
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.native
  /** The named ranges defined in a spreadsheet. */
  var namedRanges: js.UndefOr[js.Array[NamedRange]] = js.native
  /** Overall properties of a spreadsheet. */
  var properties: js.UndefOr[SpreadsheetProperties] = js.native
  /** The sheets that are part of a spreadsheet. */
  var sheets: js.UndefOr[js.Array[Sheet]] = js.native
  /**
    * The ID of the spreadsheet.
    * This field is read-only.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * The url of the spreadsheet.
    * This field is read-only.
    */
  var spreadsheetUrl: js.UndefOr[String] = js.native
}

object Spreadsheet {
  @scala.inline
  def apply(): Spreadsheet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Spreadsheet]
  }
  @scala.inline
  implicit class SpreadsheetOps[Self <: Spreadsheet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeveloperMetadata(value: js.Array[DeveloperMetadata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeveloperMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developerMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withNamedRanges(value: js.Array[NamedRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedRanges")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: SpreadsheetProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withSheets(value: js.Array[Sheet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheets")(js.undefined)
        ret
    }
    @scala.inline
    def withSpreadsheetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spreadsheetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpreadsheetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spreadsheetId")(js.undefined)
        ret
    }
    @scala.inline
    def withSpreadsheetUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spreadsheetUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpreadsheetUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spreadsheetUrl")(js.undefined)
        ret
    }
  }
  
}

