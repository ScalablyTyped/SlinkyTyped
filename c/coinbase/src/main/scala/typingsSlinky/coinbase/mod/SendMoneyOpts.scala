package typingsSlinky.coinbase.mod

import typingsSlinky.coinbase.coinbaseStrings.send
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMoneyOpts extends js.Object {
  /**
    * Amount to be sent
    */
  var amount: String = js.native
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: String = js.native
  /**
    * Notes to be included in the email that the recipient receives
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Transaction fee in BTC/ETH/LTC if you would like to pay it. Fees can be added as a string, such as 0.0005
    */
  var fee: js.UndefOr[String] = js.native
  /**
    * The website of the financial institution or exchange. Required if to_financial_institution is true.
    */
  var financial_institution_website: js.UndefOr[String] = js.native
  /**
    * *Recommended* A token to ensure idempotence. If a previous transaction with the same idem parameter already exists for this sender,
    * that previous transaction will be returned and a new one will not be created. Max length 100 characters
    */
  var idem: js.UndefOr[String] = js.native
  /**
    * Don’t send notification emails for small amounts (e.g. tips)
    */
  var skip_notifications: js.UndefOr[Boolean] = js.native
  /**
    * A bitcoin address, litecoin address, ethereum address, or an email of the recipient
    */
  var to: String = js.native
  /**
    * Whether this send is to another financial institution or exchange. Required if this send is to an address and is valued at over USD$3000.
    */
  var to_financial_institution: js.UndefOr[Boolean] = js.native
  /**
    * Type send is required when sending money
    */
  var `type`: send = js.native
}

object SendMoneyOpts {
  @scala.inline
  def apply(amount: String, currency: String, to: String, `type`: send): SendMoneyOpts = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMoneyOpts]
  }
  @scala.inline
  implicit class SendMoneyOptsOps[Self <: SendMoneyOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: send): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withFee(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fee")(js.undefined)
        ret
    }
    @scala.inline
    def withFinancial_institution_website(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("financial_institution_website")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinancial_institution_website: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("financial_institution_website")(js.undefined)
        ret
    }
    @scala.inline
    def withIdem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idem")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip_notifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip_notifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip_notifications")(js.undefined)
        ret
    }
    @scala.inline
    def withTo_financial_institution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_financial_institution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo_financial_institution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_financial_institution")(js.undefined)
        ret
    }
  }
  
}

