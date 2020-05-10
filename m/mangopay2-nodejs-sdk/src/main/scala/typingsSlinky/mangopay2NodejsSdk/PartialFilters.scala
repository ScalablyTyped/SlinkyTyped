package typingsSlinky.mangopay2NodejsSdk

import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionType
import typingsSlinky.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.report.Filters> */
@js.native
trait PartialFilters extends js.Object {
  var AfterDate: js.UndefOr[Timestamp] = js.native
  var AuthorId: js.UndefOr[String] = js.native
  var BeforeDate: js.UndefOr[Timestamp] = js.native
  var MaxDebitedFundsAmount: js.UndefOr[Double] = js.native
  var MaxDebitedFundsCurrency: js.UndefOr[CurrencyISO] = js.native
  var MaxFeesAmount: js.UndefOr[Double] = js.native
  var MaxFeesCurrency: js.UndefOr[CurrencyISO] = js.native
  var MinDebitedFundsAmount: js.UndefOr[Double] = js.native
  var MinDebitedFundsCurrency: js.UndefOr[CurrencyISO] = js.native
  var MinFeesAmount: js.UndefOr[Double] = js.native
  var MinFeesCurrency: js.UndefOr[CurrencyISO] = js.native
  var Nature: js.UndefOr[js.Array[TransactionNature]] = js.native
  var Status: js.UndefOr[js.Array[TransactionStatus]] = js.native
  var Type: js.UndefOr[js.Array[TransactionType]] = js.native
  var WalletId: js.UndefOr[String] = js.native
}

object PartialFilters {
  @scala.inline
  def apply(): PartialFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFilters]
  }
  @scala.inline
  implicit class PartialFiltersOps[Self <: PartialFilters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AfterDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AfterDate")(js.undefined)
        ret
    }
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
    def withBeforeDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeforeDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeforeDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDebitedFundsAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxDebitedFundsAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDebitedFundsAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxDebitedFundsAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDebitedFundsCurrency(value: CurrencyISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxDebitedFundsCurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDebitedFundsCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxDebitedFundsCurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFeesAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxFeesAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFeesAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxFeesAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFeesCurrency(value: CurrencyISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxFeesCurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFeesCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxFeesCurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDebitedFundsAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinDebitedFundsAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDebitedFundsAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinDebitedFundsAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDebitedFundsCurrency(value: CurrencyISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinDebitedFundsCurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDebitedFundsCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinDebitedFundsCurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFeesAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinFeesAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinFeesAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinFeesAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinFeesCurrency(value: CurrencyISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinFeesCurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinFeesCurrency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinFeesCurrency")(js.undefined)
        ret
    }
    @scala.inline
    def withNature(value: js.Array[TransactionNature]): Self = {
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
    def withStatus(value: js.Array[TransactionStatus]): Self = {
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
    def withType(value: js.Array[TransactionType]): Self = {
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
    @scala.inline
    def withWalletId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WalletId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWalletId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WalletId")(js.undefined)
        ret
    }
  }
  
}

