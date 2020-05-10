package typingsSlinky.mangopay2NodejsSdk.mod

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPayOutPaymentType extends js.Object {
  var BankWire: BANK_WIRE = js.native
}

object IPayOutPaymentType {
  @scala.inline
  def apply(BankWire: BANK_WIRE): IPayOutPaymentType = {
    val __obj = js.Dynamic.literal(BankWire = BankWire.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPayOutPaymentType]
  }
  @scala.inline
  implicit class IPayOutPaymentTypeOps[Self <: IPayOutPaymentType] (val x: Self) extends AnyVal {
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
  }
  
}

