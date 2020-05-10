package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT_DEBIT
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYPAL
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PREAUTHORIZED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPayInPaymentType extends js.Object {
  var BankWire: BANK_WIRE = js.native
  var Card: CARD = js.native
  var DirectDebit: DIRECT_DEBIT = js.native
  var PayPal: PAYPAL = js.native
  var Preauthorized: PREAUTHORIZED = js.native
}

object IPayInPaymentType {
  @scala.inline
  def apply(
    BankWire: BANK_WIRE,
    Card: CARD,
    DirectDebit: DIRECT_DEBIT,
    PayPal: PAYPAL,
    Preauthorized: PREAUTHORIZED
  ): IPayInPaymentType = {
    val __obj = js.Dynamic.literal(BankWire = BankWire.asInstanceOf[js.Any], Card = Card.asInstanceOf[js.Any], DirectDebit = DirectDebit.asInstanceOf[js.Any], PayPal = PayPal.asInstanceOf[js.Any], Preauthorized = Preauthorized.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPayInPaymentType]
  }
  @scala.inline
  implicit class IPayInPaymentTypeOps[Self <: IPayInPaymentType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBankWire(value: BANK_WIRE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BankWire")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCard(value: CARD): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectDebit(value: DIRECT_DEBIT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectDebit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayPal(value: PAYPAL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PayPal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreauthorized(value: PREAUTHORIZED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Preauthorized")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

