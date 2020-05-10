package typingsSlinky.monacoEditor.mod.editor

import typingsSlinky.monacoEditor.monacoEditorStrings.`inline`
import typingsSlinky.monacoEditor.monacoEditorStrings.bottom
import typingsSlinky.monacoEditor.monacoEditorStrings.none
import typingsSlinky.monacoEditor.monacoEditorStrings.top
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalSuggestOptions extends js.Object {
  val filterGraceful: Boolean = js.native
  val filteredTypes: Record[String, Boolean] = js.native
  val localityBonus: Boolean = js.native
  val maxVisibleSuggestions: Double = js.native
  val shareSuggestSelections: Boolean = js.native
  val showIcons: Boolean = js.native
  val snippets: top | bottom | `inline` | none = js.native
  val snippetsPreventQuickSuggestions: Boolean = js.native
}

object InternalSuggestOptions {
  @scala.inline
  def apply(
    filterGraceful: Boolean,
    filteredTypes: Record[String, Boolean],
    localityBonus: Boolean,
    maxVisibleSuggestions: Double,
    shareSuggestSelections: Boolean,
    showIcons: Boolean,
    snippets: top | bottom | `inline` | none,
    snippetsPreventQuickSuggestions: Boolean
  ): InternalSuggestOptions = {
    val __obj = js.Dynamic.literal(filterGraceful = filterGraceful.asInstanceOf[js.Any], filteredTypes = filteredTypes.asInstanceOf[js.Any], localityBonus = localityBonus.asInstanceOf[js.Any], maxVisibleSuggestions = maxVisibleSuggestions.asInstanceOf[js.Any], shareSuggestSelections = shareSuggestSelections.asInstanceOf[js.Any], showIcons = showIcons.asInstanceOf[js.Any], snippets = snippets.asInstanceOf[js.Any], snippetsPreventQuickSuggestions = snippetsPreventQuickSuggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalSuggestOptions]
  }
  @scala.inline
  implicit class InternalSuggestOptionsOps[Self <: InternalSuggestOptions] (val x: Self) extends AnyVal {
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
    def withFilteredTypes(value: Record[String, Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filteredTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocalityBonus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localityBonus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxVisibleSuggestions(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVisibleSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShareSuggestSelections(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareSuggestSelections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowIcons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showIcons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnippets(value: top | bottom | `inline` | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnippetsPreventQuickSuggestions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snippetsPreventQuickSuggestions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

