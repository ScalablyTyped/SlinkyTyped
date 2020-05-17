package typingsSlinky.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BankAccount extends js.Object {
   // 银行名称
  var bankAccount: String = js.native
   // 手机号码
  var bankName: String = js.native
   // 抬头税号
  var companyAddress: String = js.native
   // 银行账号
  var errMsg: String = js.native
   // 抬头名称
  var taxNumber: String = js.native
   // 单位地址
  var telephone: String = js.native
   // 抬头类型（0：单位，1：个人）
  var title: String = js.native
  var `type`: String = js.native
}

object BankAccount {
  @scala.inline
  def apply(
    bankAccount: String,
    bankName: String,
    companyAddress: String,
    errMsg: String,
    taxNumber: String,
    telephone: String,
    title: String,
    `type`: String
  ): BankAccount = {
    val __obj = js.Dynamic.literal(bankAccount = bankAccount.asInstanceOf[js.Any], bankName = bankName.asInstanceOf[js.Any], companyAddress = companyAddress.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], taxNumber = taxNumber.asInstanceOf[js.Any], telephone = telephone.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankAccount]
  }
  @scala.inline
  implicit class BankAccountOps[Self <: BankAccount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBankAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bankAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBankName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bankName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompanyAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("companyAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTaxNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTelephone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("telephone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

