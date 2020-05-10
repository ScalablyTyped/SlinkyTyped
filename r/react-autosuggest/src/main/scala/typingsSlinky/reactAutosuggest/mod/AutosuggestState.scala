package typingsSlinky.reactAutosuggest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutosuggestState[TSuggestion] extends js.Object {
  var highlightedSectionIndex: Double | Null = js.native
  var highlightedSuggestion: TSuggestion | Null = js.native
  var highlightedSuggestionIndex: Double | Null = js.native
  var isCollapsed: Boolean = js.native
  var isFocused: Boolean = js.native
  var valueBeforeUpDown: TSuggestion | Null = js.native
}

object AutosuggestState {
  @scala.inline
  def apply[TSuggestion](isCollapsed: Boolean, isFocused: Boolean): AutosuggestState[TSuggestion] = {
    val __obj = js.Dynamic.literal(isCollapsed = isCollapsed.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosuggestState[TSuggestion]]
  }
  @scala.inline
  implicit class AutosuggestStateOps[Self[tsuggestion] <: AutosuggestState[tsuggestion], TSuggestion] (val x: Self[TSuggestion]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSuggestion] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSuggestion]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSuggestion] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSuggestion] with Other]
    @scala.inline
    def withIsCollapsed(value: Boolean): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFocused(value: Boolean): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedSectionIndex(value: Double): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedSectionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedSectionIndexNull: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedSectionIndex")(null)
        ret
    }
    @scala.inline
    def withHighlightedSuggestion(value: TSuggestion): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedSuggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedSuggestionNull: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedSuggestion")(null)
        ret
    }
    @scala.inline
    def withHighlightedSuggestionIndex(value: Double): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedSuggestionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightedSuggestionIndexNull: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedSuggestionIndex")(null)
        ret
    }
    @scala.inline
    def withValueBeforeUpDown(value: TSuggestion): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBeforeUpDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueBeforeUpDownNull: Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueBeforeUpDown")(null)
        ret
    }
  }
  
}

