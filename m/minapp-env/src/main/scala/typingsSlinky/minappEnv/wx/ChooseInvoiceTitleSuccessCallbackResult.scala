package typingsSlinky.minappEnv.wx

import typingsSlinky.minappEnv.minappEnvNumbers.`0`
import typingsSlinky.minappEnv.minappEnvNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChooseInvoiceTitleSuccessCallbackResult extends js.Object {
  /** 银行账号 */
  var bankAccount: String = js.native
  /** 银行名称 */
  var bankName: String = js.native
  /** 单位地址 */
  var companyAddress: String = js.native
  /** 错误信息 */
  var errMsg: String = js.native
  /** 抬头税号 */
  var taxNumber: String = js.native
  /** 手机号码 */
  var telephone: String = js.native
  /** 抬头名称 */
  var title: String = js.native
  /** 抬头类型
    *
    * 可选值：
    * - 0: 单位;
    * - 1: 个人; */
  var `type`: `0` | `1` = js.native
}

object ChooseInvoiceTitleSuccessCallbackResult {
  @scala.inline
  def apply(
    bankAccount: String,
    bankName: String,
    companyAddress: String,
    errMsg: String,
    taxNumber: String,
    telephone: String,
    title: String,
    `type`: `0` | `1`
  ): ChooseInvoiceTitleSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(bankAccount = bankAccount.asInstanceOf[js.Any], bankName = bankName.asInstanceOf[js.Any], companyAddress = companyAddress.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], taxNumber = taxNumber.asInstanceOf[js.Any], telephone = telephone.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseInvoiceTitleSuccessCallbackResult]
  }
  @scala.inline
  implicit class ChooseInvoiceTitleSuccessCallbackResultOps[Self <: ChooseInvoiceTitleSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def withType(value: `0` | `1`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

