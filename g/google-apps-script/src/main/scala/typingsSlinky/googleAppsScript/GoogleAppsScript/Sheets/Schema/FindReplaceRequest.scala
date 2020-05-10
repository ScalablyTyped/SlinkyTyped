package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindReplaceRequest extends js.Object {
  var allSheets: js.UndefOr[Boolean] = js.native
  var find: js.UndefOr[String] = js.native
  var includeFormulas: js.UndefOr[Boolean] = js.native
  var matchCase: js.UndefOr[Boolean] = js.native
  var matchEntireCell: js.UndefOr[Boolean] = js.native
  var range: js.UndefOr[GridRange] = js.native
  var replacement: js.UndefOr[String] = js.native
  var searchByRegex: js.UndefOr[Boolean] = js.native
  var sheetId: js.UndefOr[Double] = js.native
}

object FindReplaceRequest {
  @scala.inline
  def apply(): FindReplaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindReplaceRequest]
  }
  @scala.inline
  implicit class FindReplaceRequestOps[Self <: FindReplaceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllSheets(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allSheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllSheets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allSheets")(js.undefined)
        ret
    }
    @scala.inline
    def withFind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeFormulas(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFormulas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeFormulas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeFormulas")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchCase")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchEntireCell(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchEntireCell")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchEntireCell: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchEntireCell")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: GridRange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withReplacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replacement")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchByRegex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchByRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchByRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchByRegex")(js.undefined)
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
  }
  
}

