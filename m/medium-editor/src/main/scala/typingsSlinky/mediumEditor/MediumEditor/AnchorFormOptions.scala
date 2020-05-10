package typingsSlinky.mediumEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorFormOptions extends js.Object {
  var customClassOption: js.UndefOr[String] = js.native
  var customClassOptionText: js.UndefOr[String] = js.native
  var linkValidation: js.UndefOr[Boolean] = js.native
  var placeholderText: js.UndefOr[String] = js.native
  var targetCheckbox: js.UndefOr[Boolean] = js.native
  var targetCheckboxText: js.UndefOr[String] = js.native
}

object AnchorFormOptions {
  @scala.inline
  def apply(): AnchorFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorFormOptions]
  }
  @scala.inline
  implicit class AnchorFormOptionsOps[Self <: AnchorFormOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomClassOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClassOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomClassOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClassOption")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomClassOptionText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClassOptionText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomClassOptionText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customClassOptionText")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkValidation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholderText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholderText")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetCheckboxText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCheckboxText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCheckboxText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCheckboxText")(js.undefined)
        ret
    }
  }
  
}

