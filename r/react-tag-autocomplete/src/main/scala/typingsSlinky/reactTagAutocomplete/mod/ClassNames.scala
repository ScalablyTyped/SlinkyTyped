package typingsSlinky.reactTagAutocomplete.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassNames extends js.Object {
  var root: String = js.native
  var rootFocused: String = js.native
  var search: String = js.native
  var searchInput: String = js.native
  var selected: String = js.native
  var selectedTag: String = js.native
  var selectedTagName: String = js.native
  var suggestionActive: String = js.native
  var suggestionDisabled: String = js.native
  var suggestions: String = js.native
}

object ClassNames {
  @scala.inline
  def apply(
    root: String,
    rootFocused: String,
    search: String,
    searchInput: String,
    selected: String,
    selectedTag: String,
    selectedTagName: String,
    suggestionActive: String,
    suggestionDisabled: String,
    suggestions: String
  ): ClassNames = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], rootFocused = rootFocused.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], searchInput = searchInput.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectedTag = selectedTag.asInstanceOf[js.Any], selectedTagName = selectedTagName.asInstanceOf[js.Any], suggestionActive = suggestionActive.asInstanceOf[js.Any], suggestionDisabled = suggestionDisabled.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassNames]
  }
  @scala.inline
  implicit class ClassNamesOps[Self <: ClassNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootFocused(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFocused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestionActive(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestionDisabled(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

