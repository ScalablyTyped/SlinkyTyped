package typingsSlinky.jqueryTagsmanager

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITagsManagerOptions extends js.Object {
  var AjaxPush: js.UndefOr[String] = js.native
  var CapitalizeFirstLetter: js.UndefOr[Boolean] = js.native
  var backspace: js.UndefOr[js.Array[Double]] = js.native
  var blinkBGColor_1: js.UndefOr[String] = js.native
  var blinkBGColor_2: js.UndefOr[String] = js.native
  var deleteTagsOnBackspace: js.UndefOr[Boolean] = js.native
   //url
  var delimeters: js.UndefOr[js.Array[Double]] = js.native
  var hiddenTagListId: js.UndefOr[String] = js.native
  var hiddenTagListName: js.UndefOr[String] = js.native
  var isClearInputOnEsc: js.UndefOr[Boolean] = js.native
  var maxTags: js.UndefOr[Double] = js.native
  var prefilled: js.UndefOr[js.Any] = js.native
  var preventSubmitOnEnter: js.UndefOr[Boolean] = js.native
  var tagClass: js.UndefOr[String] = js.native
  var tagCloseIcon: js.UndefOr[String] = js.native
  var tagsContainer: js.UndefOr[HTMLElement] = js.native
  var typeahead: js.UndefOr[Boolean] = js.native
  var typeaheadAjaxPolling: js.UndefOr[Boolean] = js.native
  var typeaheadAjaxSource: js.UndefOr[String] = js.native
  var typeaheadDelegate: js.UndefOr[js.Function] = js.native
  var typeaheadOverrides: js.UndefOr[ITypeaheadOverrides] = js.native
  var typeaheadSource: js.UndefOr[js.Any] = js.native
  var validator: js.UndefOr[js.Function] = js.native
}

object ITagsManagerOptions {
  @scala.inline
  def apply(): ITagsManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITagsManagerOptions]
  }
  @scala.inline
  implicit class ITagsManagerOptionsOps[Self <: ITagsManagerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjaxPush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AjaxPush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AjaxPush")(js.undefined)
        ret
    }
    @scala.inline
    def withCapitalizeFirstLetter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapitalizeFirstLetter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapitalizeFirstLetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapitalizeFirstLetter")(js.undefined)
        ret
    }
    @scala.inline
    def withBackspace(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backspace")(js.undefined)
        ret
    }
    @scala.inline
    def withBlinkBGColor_1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blinkBGColor_1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlinkBGColor_1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blinkBGColor_1")(js.undefined)
        ret
    }
    @scala.inline
    def withBlinkBGColor_2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blinkBGColor_2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlinkBGColor_2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blinkBGColor_2")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteTagsOnBackspace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTagsOnBackspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteTagsOnBackspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteTagsOnBackspace")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimeters(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimeters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimeters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimeters")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenTagListId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenTagListId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenTagListId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenTagListId")(js.undefined)
        ret
    }
    @scala.inline
    def withHiddenTagListName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenTagListName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiddenTagListName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenTagListName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsClearInputOnEsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClearInputOnEsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsClearInputOnEsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isClearInputOnEsc")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTags(value: Double): Self = {
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
    def withPrefilled(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefilled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefilled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefilled")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventSubmitOnEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventSubmitOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventSubmitOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventSubmitOnEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withTagClass(value: String): Self = {
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
    def withTagCloseIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagCloseIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagCloseIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagCloseIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withTagsContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagsContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagsContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeahead(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeahead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeahead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeahead")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeaheadAjaxPolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeaheadAjaxPolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeaheadAjaxPolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeaheadAjaxPolling")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeaheadAjaxSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeaheadAjaxSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeaheadAjaxSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeaheadAjaxSource")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeaheadDelegate(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeaheadDelegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeaheadDelegate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeaheadDelegate")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeaheadOverrides(value: ITypeaheadOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeaheadOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeaheadOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeaheadOverrides")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeaheadSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeaheadSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeaheadSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeaheadSource")(js.undefined)
        ret
    }
    @scala.inline
    def withValidator(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validator")(js.undefined)
        ret
    }
  }
  
}

