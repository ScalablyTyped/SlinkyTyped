package typingsSlinky.mangopay2NodejsSdk.mod.PayOut

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYOUT
import typingsSlinky.mangopay2NodejsSdk.mod.MoneyData
import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.Omit<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.transfer.TransferData, 'Type'> */
@js.native
trait PayOutData extends js.Object {
  var AuthorId: String = js.native
  /**
    * An ID of a Bank Account
    */
  var BankAccountId: String = js.native
  /**
    * A custom reference you wish to appear on the user’s bank statement (your Client Name is already shown). This reference can contain max 12 characters
    */
  var BankWireRef: String = js.native
  var CreationDate: Double = js.native
  var CreditedFunds: MoneyData = js.native
  var CreditedUserId: String = js.native
  var CreditedWalletId: String = js.native
  var DebitedFunds: MoneyData = js.native
  var DebitedWalletId: String = js.native
  var ExecutionDate: Timestamp = js.native
  var Fees: MoneyData = js.native
  var Id: String = js.native
  var Nature: TransactionNature = js.native
  var PaymentType: BANK_WIRE = js.native
  var ResultCode: String = js.native
  var ResultMessage: String = js.native
  var Status: TransactionStatus = js.native
  var Tag: String = js.native
  /**
    * The type of the transaction
    */
  var Type: PAYOUT = js.native
}

object PayOutData {
  @scala.inline
  def apply(
    AuthorId: String,
    BankAccountId: String,
    BankWireRef: String,
    CreationDate: Double,
    CreditedFunds: MoneyData,
    CreditedUserId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    ExecutionDate: Timestamp,
    Fees: MoneyData,
    Id: String,
    Nature: TransactionNature,
    PaymentType: BANK_WIRE,
    ResultCode: String,
    ResultMessage: String,
    Status: TransactionStatus,
    Tag: String,
    Type: PAYOUT
  ): PayOutData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BankAccountId = BankAccountId.asInstanceOf[js.Any], BankWireRef = BankWireRef.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayOutData]
  }
  @scala.inline
  implicit class PayOutDataOps[Self <: PayOutData] (val x: Self) extends AnyVal {
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
    def withBankAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BankAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBankWireRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BankWireRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreditedFunds(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedFunds")(value.asInstanceOf[js.Any])
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
    def withDebitedFunds(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedFunds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebitedWalletId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedWalletId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutionDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFees(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNature(value: TransactionNature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaymentType(value: BANK_WIRE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaymentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: TransactionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: PAYOUT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

