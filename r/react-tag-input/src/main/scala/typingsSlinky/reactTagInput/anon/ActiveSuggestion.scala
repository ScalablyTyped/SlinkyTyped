package typingsSlinky.reactTagInput.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveSuggestion extends js.Object {
  var activeSuggestion: js.UndefOr[String] = js.native
  var remove: js.UndefOr[String] = js.native
  var selected: js.UndefOr[String] = js.native
  var suggestions: js.UndefOr[String] = js.native
  var tag: js.UndefOr[String] = js.native
  var tagInput: js.UndefOr[String] = js.native
  var tagInputField: js.UndefOr[String] = js.native
  var tags: js.UndefOr[String] = js.native
}

object ActiveSuggestion {
  @scala.inline
  def apply(): ActiveSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveSuggestion]
  }
  @scala.inline
  implicit class ActiveSuggestionOps[Self <: ActiveSuggestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveSuggestion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSuggestion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveSuggestion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeSuggestion")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(js.undefined)
        ret
    }
    @scala.inline
    def withTagInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagInput")(js.undefined)
        ret
    }
    @scala.inline
    def withTagInputField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagInputField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagInputField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagInputField")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

