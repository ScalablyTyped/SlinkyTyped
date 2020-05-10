package typingsSlinky.recurlyRecurlyJs.adyenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdyenOptions extends js.Object {
  var countryCode: js.UndefOr[String] = js.native
  var invoiceUuid: String = js.native
  var shopperLocale: js.UndefOr[String] = js.native
  var skinCode: js.UndefOr[String] = js.native
}

object AdyenOptions {
  @scala.inline
  def apply(invoiceUuid: String): AdyenOptions = {
    val __obj = js.Dynamic.literal(invoiceUuid = invoiceUuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdyenOptions]
  }
  @scala.inline
  implicit class AdyenOptionsOps[Self <: AdyenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvoiceUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invoiceUuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withShopperLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shopperLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShopperLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shopperLocale")(js.undefined)
        ret
    }
    @scala.inline
    def withSkinCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skinCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkinCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skinCode")(js.undefined)
        ret
    }
  }
  
}

