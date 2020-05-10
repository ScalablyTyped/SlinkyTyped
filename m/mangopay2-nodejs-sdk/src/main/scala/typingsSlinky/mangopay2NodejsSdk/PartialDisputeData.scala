package typingsSlinky.mangopay2NodejsSdk

import typingsSlinky.mangopay2NodejsSdk.mod.MoneyData
import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.dispute.DisputeReason
import typingsSlinky.mangopay2NodejsSdk.mod.dispute.DisputeStatus
import typingsSlinky.mangopay2NodejsSdk.mod.dispute.DisputeType
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.dispute.DisputeData> */
@js.native
trait PartialDisputeData extends js.Object {
  var ContestDeadlineDate: js.UndefOr[Timestamp] = js.native
  var ContestedFunds: js.UndefOr[MoneyData] = js.native
  var CreationDate: js.UndefOr[Double] = js.native
  var DisputeReason: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.dispute.DisputeReason] = js.native
  var DisputeType: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.dispute.DisputeType] = js.native
  var DisputedFunds: js.UndefOr[MoneyData] = js.native
  var Id: js.UndefOr[String] = js.native
  var InitialTransactionId: js.UndefOr[String] = js.native
  var InitialTransactionType: js.UndefOr[TransactionType] = js.native
  var RepudiationId: js.UndefOr[String] = js.native
  var ResultCode: js.UndefOr[String] = js.native
  var ResultMessage: js.UndefOr[String] = js.native
  var Status: js.UndefOr[DisputeStatus] = js.native
  var StatusMessage: js.UndefOr[String] = js.native
  var Tag: js.UndefOr[String] = js.native
}

object PartialDisputeData {
  @scala.inline
  def apply(): PartialDisputeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDisputeData]
  }
  @scala.inline
  implicit class PartialDisputeDataOps[Self <: PartialDisputeData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContestDeadlineDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContestDeadlineDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContestDeadlineDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContestDeadlineDate")(js.undefined)
        ret
    }
    @scala.inline
    def withContestedFunds(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContestedFunds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContestedFunds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContestedFunds")(js.undefined)
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
    def withDisputeReason(value: DisputeReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisputeReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisputeReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisputeReason")(js.undefined)
        ret
    }
    @scala.inline
    def withDisputeType(value: DisputeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisputeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisputeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisputeType")(js.undefined)
        ret
    }
    @scala.inline
    def withDisputedFunds(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisputedFunds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisputedFunds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisputedFunds")(js.undefined)
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
    def withRepudiationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepudiationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepudiationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepudiationId")(js.undefined)
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
    def withStatus(value: DisputeStatus): Self = {
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
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
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

