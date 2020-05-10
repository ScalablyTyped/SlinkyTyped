package typingsSlinky.mangopay2NodejsSdk.mod.payIn

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typingsSlinky.mangopay2NodejsSdk.mod.MoneyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.payIn.BankWireDirectPayInData, 'Tag', 'AuthorId' | 'CreditedUserId' | 'CreditedWalletId' | 'DeclaredDebitedFunds' | 'DeclaredFees'> */
@js.native
trait CreateBankWireDirectPayIn extends js.Object {
  var AuthorId: String = js.native
  var CreditedUserId: String = js.native
  var CreditedWalletId: String = js.native
  var DeclaredDebitedFunds: MoneyData = js.native
  var DeclaredFees: MoneyData = js.native
  var ExecutionType: DIRECT = js.native
  var PaymentType: BANK_WIRE = js.native
  var Tag: js.UndefOr[String] = js.native
}

object CreateBankWireDirectPayIn {
  @scala.inline
  def apply(
    AuthorId: String,
    CreditedUserId: String,
    CreditedWalletId: String,
    DeclaredDebitedFunds: MoneyData,
    DeclaredFees: MoneyData,
    ExecutionType: DIRECT,
    PaymentType: BANK_WIRE
  ): CreateBankWireDirectPayIn = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DeclaredDebitedFunds = DeclaredDebitedFunds.asInstanceOf[js.Any], DeclaredFees = DeclaredFees.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBankWireDirectPayIn]
  }
  @scala.inline
  implicit class CreateBankWireDirectPayInOps[Self <: CreateBankWireDirectPayIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreditedUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreditedWalletId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedWalletId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclaredDebitedFunds(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclaredDebitedFunds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeclaredFees(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeclaredFees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionType(value: DIRECT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaymentType(value: BANK_WIRE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaymentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(js.undefined)
        ret
    }
  }
  
}

