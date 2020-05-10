package typingsSlinky.ngTagsInput.mod.angularAugmentingMod.ngTagsInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteParams extends js.Object {
  var debounceDelay: js.UndefOr[Double | Boolean] = js.native
  var displayProperty: js.UndefOr[String | Boolean] = js.native
  var highlightMatchedText: js.UndefOr[Boolean] = js.native
  var loadOnDownArrow: js.UndefOr[Boolean] = js.native
  var loadOnEmpty: js.UndefOr[Boolean] = js.native
  var loadOnFocus: js.UndefOr[Boolean] = js.native
  var matchClass: js.UndefOr[js.Any] = js.native
  var maxResultsToShow: js.UndefOr[Double | Boolean] = js.native
  var minLength: js.UndefOr[Double | Boolean] = js.native
  var selectFirstMatch: js.UndefOr[Boolean] = js.native
  var source: js.UndefOr[js.Any] = js.native
  var template: js.UndefOr[String | Boolean] = js.native
}

object AutocompleteParams {
  @scala.inline
  def apply(): AutocompleteParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutocompleteParams]
  }
  @scala.inline
  implicit class AutocompleteParamsOps[Self <: AutocompleteParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebounceDelay(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounceDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebounceDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounceDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayProperty(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlightMatchedText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatchedText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlightMatchedText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightMatchedText")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadOnDownArrow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnDownArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadOnDownArrow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnDownArrow")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadOnEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadOnEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchClass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchClass")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResultsToShow(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResultsToShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResultsToShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResultsToShow")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLength(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLength")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectFirstMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectFirstMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectFirstMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectFirstMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

