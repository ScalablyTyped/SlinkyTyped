package typingsSlinky.mangopay2NodejsSdk.mod.repudiation

import typingsSlinky.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REPUDIATION
import typingsSlinky.mangopay2NodejsSdk.mod.MoneyData
import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.refund.RefundReason
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionData
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepudiationData extends TransactionData {
  /**
    * The initial transaction ID
    */
  var InitialTransactionId: String = js.native
  /**
    * The initial transaction type
    */
  var InitialTransactionType: TransactionType = js.native
  /**
    * The nature of the transaction
    */
  @JSName("Nature")
  var Nature_RepudiationData: REPUDIATION = js.native
  /**
    * Contains info about the reason for refund
    */
  var RefundReason: typingsSlinky.mangopay2NodejsSdk.mod.refund.RefundReason = js.native
}

object RepudiationData {
  @scala.inline
  def apply(
    AuthorId: String,
    CreationDate: Double,
    CreditedFunds: MoneyData,
    CreditedUserId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    ExecutionDate: Timestamp,
    Fees: MoneyData,
    Id: String,
    InitialTransactionId: String,
    InitialTransactionType: TransactionType,
    Nature: REPUDIATION,
    RefundReason: RefundReason,
    ResultCode: String,
    ResultMessage: String,
    Status: TransactionStatus,
    Tag: String,
    Type: TransactionType
  ): RepudiationData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InitialTransactionId = InitialTransactionId.asInstanceOf[js.Any], InitialTransactionType = InitialTransactionType.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], RefundReason = RefundReason.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepudiationData]
  }
  @scala.inline
  implicit class RepudiationDataOps[Self <: RepudiationData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialTransactionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialTransactionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialTransactionType(value: TransactionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialTransactionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNature(value: REPUDIATION): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefundReason(value: RefundReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefundReason")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

