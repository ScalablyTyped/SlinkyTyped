package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestedTableCellStyle extends js.Object {
  var tableCellStyle: js.UndefOr[TableCellStyle] = js.native
  var tableCellStyleSuggestionState: js.UndefOr[TableCellStyleSuggestionState] = js.native
}

object SuggestedTableCellStyle {
  @scala.inline
  def apply(): SuggestedTableCellStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedTableCellStyle]
  }
  @scala.inline
  implicit class SuggestedTableCellStyleOps[Self <: SuggestedTableCellStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTableCellStyle(value: TableCellStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCellStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTableCellStyleSuggestionState(value: TableCellStyleSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellStyleSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCellStyleSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCellStyleSuggestionState")(js.undefined)
        ret
    }
  }
  
}

