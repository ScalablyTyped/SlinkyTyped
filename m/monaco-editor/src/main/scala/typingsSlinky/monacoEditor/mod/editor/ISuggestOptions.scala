package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestOptions extends js.Object {
  /**
    * Enable graceful matching. Defaults to true.
    */
  var filterGraceful: js.UndefOr[Boolean] = js.native
  /**
    * Names of suggestion types to filter.
    */
  var filteredTypes: js.UndefOr[Record[String, Boolean]] = js.native
  /**
    * Favours words that appear close to the cursor.
    */
  var localityBonus: js.UndefOr[Boolean] = js.native
  /**
    * Max suggestions to show in suggestions. Defaults to 12.
    */
  var maxVisibleSuggestions: js.UndefOr[Boolean] = js.native
  /**
    * Enable using global storage for remembering suggestions.
    */
  var shareSuggestSelections: js.UndefOr[Boolean] = js.native
  /**
    * Enable or disable icons in suggestions. Defaults to true.
    */
  var showIcons: js.UndefOr[Boolean] = js.native
  /**
    * Prevent quick suggestions when a snippet is active. Defaults to true.
    */
  var snippetsPreventQuickSuggestions: js.UndefOr[Boolean] = js.native
}

object ISuggestOptions {
  @scala.inline
  def apply(): ISuggestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISuggestOptions]
  }
  @scala.inline
  implicit class ISuggestOptionsOps[Self <: ISuggestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterGraceful(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterGraceful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterGraceful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterGraceful")(js.undefined)
        ret
    }
    @scala.inline
    def withFilteredTypes(value: Record[String, Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilteredTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalityBonus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localityBonus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalityBonus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localityBonus")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxVisibleSuggestions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVisibleSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxVisibleSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVisibleSuggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withShareSuggestSelections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareSuggestSelections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareSuggestSelections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareSuggestSelections")(js.undefined)
        ret
    }
    @scala.inline
    def withShowIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcons")(js.undefined)
        ret
    }
    @scala.inline
    def withSnippetsPreventQuickSuggestions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippetsPreventQuickSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnippetsPreventQuickSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippetsPreventQuickSuggestions")(js.undefined)
        ret
    }
  }
  
}

