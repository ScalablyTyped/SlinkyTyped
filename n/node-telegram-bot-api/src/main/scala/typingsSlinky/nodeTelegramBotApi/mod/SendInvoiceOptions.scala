package typingsSlinky.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendInvoiceOptions extends SendBasicOptions {
  var is_flexible: js.UndefOr[Boolean] = js.native
  var need_email: js.UndefOr[Boolean] = js.native
  var need_name: js.UndefOr[Boolean] = js.native
  var need_phone_number: js.UndefOr[Boolean] = js.native
  var need_shipping_address: js.UndefOr[Boolean] = js.native
  var photo_height: js.UndefOr[Double] = js.native
  var photo_size: js.UndefOr[Double] = js.native
  var photo_url: js.UndefOr[String] = js.native
  var photo_width: js.UndefOr[Double] = js.native
  var provider_data: js.UndefOr[String] = js.native
}

object SendInvoiceOptions {
  @scala.inline
  def apply(): SendInvoiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendInvoiceOptions]
  }
  @scala.inline
  implicit class SendInvoiceOptionsOps[Self <: SendInvoiceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIs_flexible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_flexible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_flexible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_flexible")(js.undefined)
        ret
    }
    @scala.inline
    def withNeed_email(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("need_email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeed_email: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("need_email")(js.undefined)
        ret
    }
    @scala.inline
    def withNeed_name(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("need_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeed_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("need_name")(js.undefined)
        ret
    }
    @scala.inline
    def withNeed_phone_number(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("need_phone_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeed_phone_number: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("need_phone_number")(js.undefined)
        ret
    }
    @scala.inline
    def withNeed_shipping_address(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("need_shipping_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeed_shipping_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("need_shipping_address")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoto_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoto_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo_height")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoto_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoto_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo_size")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoto_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoto_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo_url")(js.undefined)
        ret
    }
    @scala.inline
    def withPhoto_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhoto_width: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photo_width")(js.undefined)
        ret
    }
    @scala.inline
    def withProvider_data(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider_data: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider_data")(js.undefined)
        ret
    }
  }
  
}

