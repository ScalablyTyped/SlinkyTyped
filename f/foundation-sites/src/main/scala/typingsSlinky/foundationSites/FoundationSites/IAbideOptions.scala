package typingsSlinky.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAbideOptions extends js.Object {
  var formErrorClass: js.UndefOr[String] = js.native
  var formErrorSelector: js.UndefOr[String] = js.native
  var inputErrorClass: js.UndefOr[String] = js.native
  var labelErrorClass: js.UndefOr[String] = js.native
  var liveValidate: js.UndefOr[Boolean] = js.native
  var validateOn: js.UndefOr[String] = js.native
  var validators: js.UndefOr[js.Any] = js.native
}

object IAbideOptions {
  @scala.inline
  def apply(): IAbideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbideOptions]
  }
  @scala.inline
  implicit class IAbideOptionsOps[Self <: IAbideOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormErrorClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formErrorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormErrorClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formErrorClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFormErrorSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formErrorSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormErrorSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formErrorSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withInputErrorClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputErrorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputErrorClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputErrorClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelErrorClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelErrorClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelErrorClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelErrorClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOn")(js.undefined)
        ret
    }
    @scala.inline
    def withValidators(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(js.undefined)
        ret
    }
  }
  
}

