package typingsSlinky.jqueryUniform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UniformCoreOptions extends js.Object {
  var activeClass: js.UndefOr[String] = js.native
  var autoHide: js.UndefOr[Boolean] = js.native
  var buttonClass: js.UndefOr[String] = js.native
  var checkboxClass: js.UndefOr[String] = js.native
  var checkedClass: js.UndefOr[String] = js.native
  var disabledClass: js.UndefOr[String] = js.native
  var eventNamespace: js.UndefOr[String] = js.native
  var fileButtonClass: js.UndefOr[String] = js.native
  var fileButtonHtml: js.UndefOr[String] = js.native
  var fileClass: js.UndefOr[String] = js.native
  var fileDefaultHtml: js.UndefOr[String] = js.native
  var filenameClass: js.UndefOr[String] = js.native
  var focusClass: js.UndefOr[String] = js.native
  var hoverClass: js.UndefOr[String] = js.native
  var idPrefix: js.UndefOr[String] = js.native
  var inputAddTypeAsClass: js.UndefOr[Boolean] = js.native
  var inputClass: js.UndefOr[String] = js.native
  var radioClass: js.UndefOr[String] = js.native
  var resetDefaultHtml: js.UndefOr[String] = js.native
  var resetSelector: js.UndefOr[js.Any] = js.native
  var selectAutoWidth: js.UndefOr[Boolean] = js.native
  var selectClass: js.UndefOr[String] = js.native
  var selectMultiClass: js.UndefOr[String] = js.native
  var submitDefaultHtml: js.UndefOr[String] = js.native
  var textareaClass: js.UndefOr[String] = js.native
  var useID: js.UndefOr[Boolean] = js.native
  var wrapperClass: js.UndefOr[String] = js.native
}

object UniformCoreOptions {
  @scala.inline
  def apply(): UniformCoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniformCoreOptions]
  }
  @scala.inline
  implicit class UniformCoreOptionsOps[Self <: UniformCoreOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoHide")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkedClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledClass")(js.undefined)
        ret
    }
    @scala.inline
    def withEventNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withFileButtonClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileButtonClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileButtonClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileButtonClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFileButtonHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileButtonHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileButtonHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileButtonHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withFileClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFileDefaultHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDefaultHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileDefaultHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDefaultHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withFilenameClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenameClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilenameClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filenameClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocusClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusClass")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverClass")(js.undefined)
        ret
    }
    @scala.inline
    def withIdPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withInputAddTypeAsClass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAddTypeAsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputAddTypeAsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAddTypeAsClass")(js.undefined)
        ret
    }
    @scala.inline
    def withInputClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClass")(js.undefined)
        ret
    }
    @scala.inline
    def withRadioClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadioClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radioClass")(js.undefined)
        ret
    }
    @scala.inline
    def withResetDefaultHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetDefaultHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetDefaultHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetDefaultHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withResetSelector(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAutoWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAutoWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAutoWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAutoWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectMultiClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectMultiClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectMultiClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectMultiClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmitDefaultHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitDefaultHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubmitDefaultHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submitDefaultHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withTextareaClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textareaClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextareaClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textareaClass")(js.undefined)
        ret
    }
    @scala.inline
    def withUseID(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useID")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapperClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapperClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapperClass")(js.undefined)
        ret
    }
  }
  
}

