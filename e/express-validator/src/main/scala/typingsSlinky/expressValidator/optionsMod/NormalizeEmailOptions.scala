package typingsSlinky.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizeEmailOptions extends js.Object {
  var all_lowercase: js.UndefOr[Boolean] = js.native
  var gmail_convert_googlemaildotcom: js.UndefOr[Boolean] = js.native
  var gmail_lowercase: js.UndefOr[Boolean] = js.native
  var gmail_remove_dots: js.UndefOr[Boolean] = js.native
  var gmail_remove_subaddress: js.UndefOr[Boolean] = js.native
  var icloud_lowercase: js.UndefOr[Boolean] = js.native
  var icloud_remove_subaddress: js.UndefOr[Boolean] = js.native
  var outlookdotcom_lowercase: js.UndefOr[Boolean] = js.native
  var outlookdotcom_remove_subaddress: js.UndefOr[Boolean] = js.native
  var yahoo_lowercase: js.UndefOr[Boolean] = js.native
  var yahoo_remove_subaddress: js.UndefOr[Boolean] = js.native
}

object NormalizeEmailOptions {
  @scala.inline
  def apply(): NormalizeEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizeEmailOptions]
  }
  @scala.inline
  implicit class NormalizeEmailOptionsOps[Self <: NormalizeEmailOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAll_lowercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all_lowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAll_lowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("all_lowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withGmail_convert_googlemaildotcom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmail_convert_googlemaildotcom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmail_convert_googlemaildotcom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmail_convert_googlemaildotcom")(js.undefined)
        ret
    }
    @scala.inline
    def withGmail_lowercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmail_lowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmail_lowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmail_lowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withGmail_remove_dots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmail_remove_dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmail_remove_dots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmail_remove_dots")(js.undefined)
        ret
    }
    @scala.inline
    def withGmail_remove_subaddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmail_remove_subaddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmail_remove_subaddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmail_remove_subaddress")(js.undefined)
        ret
    }
    @scala.inline
    def withIcloud_lowercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icloud_lowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcloud_lowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icloud_lowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withIcloud_remove_subaddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icloud_remove_subaddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcloud_remove_subaddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icloud_remove_subaddress")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlookdotcom_lowercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlookdotcom_lowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlookdotcom_lowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlookdotcom_lowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withOutlookdotcom_remove_subaddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlookdotcom_remove_subaddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutlookdotcom_remove_subaddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outlookdotcom_remove_subaddress")(js.undefined)
        ret
    }
    @scala.inline
    def withYahoo_lowercase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yahoo_lowercase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYahoo_lowercase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yahoo_lowercase")(js.undefined)
        ret
    }
    @scala.inline
    def withYahoo_remove_subaddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yahoo_remove_subaddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYahoo_remove_subaddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yahoo_remove_subaddress")(js.undefined)
        ret
    }
  }
  
}

