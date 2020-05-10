package typingsSlinky.ngTagsInput.mod.angularAugmentingMod.ngTagsInput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagsInputParams extends js.Object {
  var addFromAutocompleteOnly: js.UndefOr[Boolean] = js.native
  var addOnBlur: js.UndefOr[Boolean] = js.native
  var addOnComma: js.UndefOr[Boolean] = js.native
  var addOnEnter: js.UndefOr[Boolean] = js.native
  var addOnPaste: js.UndefOr[Boolean] = js.native
  var addOnSpace: js.UndefOr[Boolean] = js.native
  var allowLeftoverText: js.UndefOr[Boolean] = js.native
  var allowedTagsPattern: js.UndefOr[String | Boolean] = js.native
  var displayProperty: js.UndefOr[String | Boolean] = js.native
  var enableEditingLastTag: js.UndefOr[Boolean] = js.native
  var keyProperty: js.UndefOr[String | Boolean] = js.native
  var maxLength: js.UndefOr[Double | Boolean] = js.native
  var maxTags: js.UndefOr[Double | Boolean] = js.native
  var minLength: js.UndefOr[Double | Boolean] = js.native
  var minTags: js.UndefOr[Double | Boolean] = js.native
  var ngModel: js.UndefOr[String] = js.native
  var onInvalidTag: js.UndefOr[js.Any] = js.native
  var onTagAdded: js.UndefOr[js.Any] = js.native
  var onTagAdding: js.UndefOr[js.Any] = js.native
  var onTagClicked: js.UndefOr[js.Any] = js.native
  var onTagRemoved: js.UndefOr[js.Any] = js.native
  var onTagRemoving: js.UndefOr[js.Any] = js.native
  var pasteSplitPattern: js.UndefOr[String | Boolean] = js.native
  var placeholder: js.UndefOr[String | Boolean] = js.native
  var removeTagSymbol: js.UndefOr[String | Boolean] = js.native
  var replaceSpacesWithDashes: js.UndefOr[Boolean] = js.native
  var spellcheck: js.UndefOr[Boolean] = js.native
  var tabindex: js.UndefOr[Double | Boolean] = js.native
  var tagClass: js.UndefOr[js.Any] = js.native
  var template: js.UndefOr[String | Boolean] = js.native
  var templateScope: js.UndefOr[String | Boolean] = js.native
  var text: js.UndefOr[String | Boolean] = js.native
  var `type`: js.UndefOr[String | Boolean] = js.native
  var useStrings: js.UndefOr[Boolean] = js.native
}

object TagsInputParams {
  @scala.inline
  def apply(): TagsInputParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagsInputParams]
  }
  @scala.inline
  implicit class TagsInputParamsOps[Self <: TagsInputParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddFromAutocompleteOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFromAutocompleteOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddFromAutocompleteOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFromAutocompleteOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withAddOnBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withAddOnComma(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnComma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOnComma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnComma")(js.undefined)
        ret
    }
    @scala.inline
    def withAddOnEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withAddOnPaste(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnPaste")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOnPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnPaste")(js.undefined)
        ret
    }
    @scala.inline
    def withAddOnSpace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddOnSpace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnSpace")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowLeftoverText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLeftoverText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowLeftoverText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowLeftoverText")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedTagsPattern(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedTagsPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedTagsPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedTagsPattern")(js.undefined)
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
    def withEnableEditingLastTag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEditingLastTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableEditingLastTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableEditingLastTag")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyProperty(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTags(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTags")(js.undefined)
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
    def withMinTags(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTags")(js.undefined)
        ret
    }
    @scala.inline
    def withNgModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNgModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ngModel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInvalidTag(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalidTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnInvalidTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInvalidTag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTagAdded(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTagAdded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTagAdded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTagAdded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTagAdding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTagAdding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTagAdding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTagAdding")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTagClicked(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTagClicked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTagClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTagClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTagRemoved(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTagRemoved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTagRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTagRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTagRemoving(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTagRemoving")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTagRemoving: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTagRemoving")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteSplitPattern(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteSplitPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteSplitPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteSplitPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveTagSymbol(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTagSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveTagSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTagSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceSpacesWithDashes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceSpacesWithDashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceSpacesWithDashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceSpacesWithDashes")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellcheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellcheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(js.undefined)
        ret
    }
    @scala.inline
    def withTabindex(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabindex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabindex")(js.undefined)
        ret
    }
    @scala.inline
    def withTagClass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagClass")(js.undefined)
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
    @scala.inline
    def withTemplateScope(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateScope")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStrings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStrings")(js.undefined)
        ret
    }
  }
  
}

