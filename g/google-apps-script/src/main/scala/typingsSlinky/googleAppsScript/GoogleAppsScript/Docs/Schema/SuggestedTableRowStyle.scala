package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestedTableRowStyle extends js.Object {
  var tableRowStyle: js.UndefOr[TableRowStyle] = js.native
  var tableRowStyleSuggestionState: js.UndefOr[TableRowStyleSuggestionState] = js.native
}

object SuggestedTableRowStyle {
  @scala.inline
  def apply(): SuggestedTableRowStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedTableRowStyle]
  }
  @scala.inline
  implicit class SuggestedTableRowStyleOps[Self <: SuggestedTableRowStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTableRowStyle(value: TableRowStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRowStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRowStyleSuggestionState(value: TableRowStyleSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowStyleSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRowStyleSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowStyleSuggestionState")(js.undefined)
        ret
    }
  }
  
}

