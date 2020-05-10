package typingsSlinky.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDebit extends js.Object {
  var Commercial: String = js.native
  var CountryOfIssuance: String = js.native
  var Debit: String = js.native
  var DurbinRegulated: String = js.native
  var Fraud: String = js.native
  var Healthcare: String = js.native
  var Hiper: String = js.native
  var HiperCard: String = js.native
  var IssuingBank: String = js.native
  var No: String = js.native
  var Payroll: String = js.native
  var Prepaid: String = js.native
  var Unknown: String = js.native
}

object AnonDebit {
  @scala.inline
  def apply(
    Commercial: String,
    CountryOfIssuance: String,
    Debit: String,
    DurbinRegulated: String,
    Fraud: String,
    Healthcare: String,
    Hiper: String,
    HiperCard: String,
    IssuingBank: String,
    No: String,
    Payroll: String,
    Prepaid: String,
    Unknown: String
  ): AnonDebit = {
    val __obj = js.Dynamic.literal(Commercial = Commercial.asInstanceOf[js.Any], CountryOfIssuance = CountryOfIssuance.asInstanceOf[js.Any], Debit = Debit.asInstanceOf[js.Any], DurbinRegulated = DurbinRegulated.asInstanceOf[js.Any], Fraud = Fraud.asInstanceOf[js.Any], Healthcare = Healthcare.asInstanceOf[js.Any], Hiper = Hiper.asInstanceOf[js.Any], HiperCard = HiperCard.asInstanceOf[js.Any], IssuingBank = IssuingBank.asInstanceOf[js.Any], No = No.asInstanceOf[js.Any], Payroll = Payroll.asInstanceOf[js.Any], Prepaid = Prepaid.asInstanceOf[js.Any], Unknown = Unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDebit]
  }
  @scala.inline
  implicit class AnonDebitOps[Self <: AnonDebit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommercial(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Commercial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCountryOfIssuance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryOfIssuance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Debit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurbinRegulated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurbinRegulated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFraud(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fraud")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealthcare(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Healthcare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hiper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiperCard(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HiperCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIssuingBank(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IssuingBank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("No")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayroll(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Payroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrepaid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prepaid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnknown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unknown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

