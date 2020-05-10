package typingsSlinky.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEnterSelect extends js.Object {
  var enterSelect: js.UndefOr[String] = js.native
  var suggestionIsOpen: js.UndefOr[String] = js.native
  var suggestionsCount: js.UndefOr[String] = js.native
  var suggestionsExist: js.UndefOr[String] = js.native
}

object AnonEnterSelect {
  @scala.inline
  def apply(): AnonEnterSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEnterSelect]
  }
  @scala.inline
  implicit class AnonEnterSelectOps[Self <: AnonEnterSelect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnterSelect(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionIsOpen(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionIsOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionIsOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionsExist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsExist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionsExist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionsExist")(js.undefined)
        ret
    }
  }
  
}

