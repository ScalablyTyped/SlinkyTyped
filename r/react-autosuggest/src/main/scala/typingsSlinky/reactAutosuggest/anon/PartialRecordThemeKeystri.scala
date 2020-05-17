package typingsSlinky.reactAutosuggest.anon

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactAutosuggest.mod.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<react-autosuggest.react-autosuggest.ThemeKey, string | react.react.CSSProperties>> */
@js.native
trait PartialRecordThemeKeystri extends Theme {
  var container: js.UndefOr[String | CSSProperties] = js.native
  var containerOpen: js.UndefOr[String | CSSProperties] = js.native
  var input: js.UndefOr[String | CSSProperties] = js.native
  var inputFocused: js.UndefOr[String | CSSProperties] = js.native
  var inputOpen: js.UndefOr[String | CSSProperties] = js.native
  var sectionContainer: js.UndefOr[String | CSSProperties] = js.native
  var sectionContainerFirst: js.UndefOr[String | CSSProperties] = js.native
  var sectionTitle: js.UndefOr[String | CSSProperties] = js.native
  var suggestion: js.UndefOr[String | CSSProperties] = js.native
  var suggestionFirst: js.UndefOr[String | CSSProperties] = js.native
  var suggestionHighlighted: js.UndefOr[String | CSSProperties] = js.native
  var suggestionsContainer: js.UndefOr[String | CSSProperties] = js.native
  var suggestionsContainerOpen: js.UndefOr[String | CSSProperties] = js.native
  var suggestionsList: js.UndefOr[String | CSSProperties] = js.native
}

object PartialRecordThemeKeystri {
  @scala.inline
  def apply(): PartialRecordThemeKeystri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordThemeKeystri]
  }
  @scala.inline
  implicit class PartialRecordThemeKeystriOps[Self <: PartialRecordThemeKeystri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: String | CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerOpen(value: String | CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: String | CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(js.undefined)
        ret
    }
    @scala.inline
    def withInputFocused(value: String | CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputFocused")(js.undefined)
        ret
    }
    @scala.inline
    def withInputOpen(value: String | CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withSectionContainer(value: String | CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withSectionContainerFirst(value: String | CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionContainerFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionContainerFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionContainerFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withSectionTitle(value: String | CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestion(value: String | CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestion")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionFirst(value: String | CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionHighlighted(value: String | CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionHighlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionHighlighted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionHighlighted")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsContainer(value: String | CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsContainerOpen(value: String | CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsContainerOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsContainerOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsContainerOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsList(value: String | CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsList")(js.undefined)
        ret
    }
  }
  
}

