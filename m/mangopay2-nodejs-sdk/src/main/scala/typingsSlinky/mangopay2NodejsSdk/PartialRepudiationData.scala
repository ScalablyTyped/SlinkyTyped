package typingsSlinky.mangopay2NodejsSdk

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION
import typingsSlinky.mangopay2NodejsSdk.mod.MoneyData
import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.refund.RefundReason
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.repudiation.RepudiationData> */
@js.native
trait PartialRepudiationData extends js.Object {
  var AuthorId: js.UndefOr[String] = js.native
  var CreationDate: js.UndefOr[Double] = js.native
  var CreditedFunds: js.UndefOr[MoneyData] = js.native
  var CreditedUserId: js.UndefOr[String] = js.native
  var CreditedWalletId: js.UndefOr[String] = js.native
  var DebitedFunds: js.UndefOr[MoneyData] = js.native
  var DebitedWalletId: js.UndefOr[String] = js.native
  var ExecutionDate: js.UndefOr[Timestamp] = js.native
  var Fees: js.UndefOr[MoneyData] = js.native
  var Id: js.UndefOr[String] = js.native
  var InitialTransactionId: js.UndefOr[String] = js.native
  var InitialTransactionType: js.UndefOr[TransactionType] = js.native
  var Nature: js.UndefOr[REPUDIATION] = js.native
  var RefundReason: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.refund.RefundReason] = js.native
  var ResultCode: js.UndefOr[String] = js.native
  var ResultMessage: js.UndefOr[String] = js.native
  var Status: js.UndefOr[TransactionStatus] = js.native
  var Tag: js.UndefOr[String] = js.native
  var Type: js.UndefOr[TransactionType] = js.native
}

object PartialRepudiationData {
  @scala.inline
  def apply(): PartialRepudiationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRepudiationData]
  }
  @scala.inline
  implicit class PartialRepudiationDataOps[Self <: PartialRepudiationData] (val x: Self) extends AnyVal {
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
    def withoutAuthorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditedFunds(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedFunds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditedFunds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedFunds")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditedUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditedUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedUserId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditedWalletId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedWalletId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditedWalletId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedWalletId")(js.undefined)
        ret
    }
    @scala.inline
    def withDebitedFunds(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedFunds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebitedFunds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedFunds")(js.undefined)
        ret
    }
    @scala.inline
    def withDebitedWalletId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedWalletId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebitedWalletId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedWalletId")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionDate")(js.undefined)
        ret
    }
    @scala.inline
    def withFees(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fees")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialTransactionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialTransactionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialTransactionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialTransactionId")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialTransactionType(value: TransactionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialTransactionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialTransactionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialTransactionType")(js.undefined)
        ret
    }
    @scala.inline
    def withNature(value: REPUDIATION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nature")(js.undefined)
        ret
    }
    @scala.inline
    def withRefundReason(value: RefundReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefundReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefundReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefundReason")(js.undefined)
        ret
    }
    @scala.inline
    def withResultCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultCode")(js.undefined)
        ret
    }
    @scala.inline
    def withResultMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: TransactionStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
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
    @scala.inline
    def withType(value: TransactionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

