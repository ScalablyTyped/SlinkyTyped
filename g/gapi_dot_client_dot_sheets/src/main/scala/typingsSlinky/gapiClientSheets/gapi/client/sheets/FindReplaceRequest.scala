package typingsSlinky.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindReplaceRequest extends js.Object {
  /** True to find/replace over all sheets. */
  var allSheets: js.UndefOr[Boolean] = js.native
  /** The value to search. */
  var find: js.UndefOr[String] = js.native
  /**
    * True if the search should include cells with formulas.
    * False to skip cells with formulas.
    */
  var includeFormulas: js.UndefOr[Boolean] = js.native
  /** True if the search is case sensitive. */
  var matchCase: js.UndefOr[Boolean] = js.native
  /** True if the find value should match the entire cell. */
  var matchEntireCell: js.UndefOr[Boolean] = js.native
  /** The range to find/replace over. */
  var range: js.UndefOr[GridRange] = js.native
  /** The value to use as the replacement. */
  var replacement: js.UndefOr[String] = js.native
  /**
    * True if the find value is a regex.
    * The regular expression and replacement should follow Java regex rules
    * at https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html.
    * The replacement string is allowed to refer to capturing groups.
    * For example, if one cell has the contents `"Google Sheets"` and another
    * has `"Google Docs"`, then searching for `"o.&#42; (.&#42;)"` with a replacement of
    * `"$1 Rocks"` would change the contents of the cells to
    * `"GSheets Rocks"` and `"GDocs Rocks"` respectively.
    */
  var searchByRegex: js.UndefOr[Boolean] = js.native
  /** The sheet to find/replace over. */
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

