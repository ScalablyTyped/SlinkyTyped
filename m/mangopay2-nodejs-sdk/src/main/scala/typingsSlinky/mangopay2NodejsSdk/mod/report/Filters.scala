package typingsSlinky.mangopay2NodejsSdk.mod.report

import typingsSlinky.mangopay2NodejsSdk.mod.Timestamp
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typingsSlinky.mangopay2NodejsSdk.mod.transaction.TransactionType
import typingsSlinky.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filters extends js.Object {
  /**
    * To return only resources that have CreationDate AFTER this date
    */
  var AfterDate: Timestamp = js.native
  /**
    * A user's ID
    */
  var AuthorId: String = js.native
  /**
    * To return only resources that have CreationDate BEFORE this date
    */
  var BeforeDate: Timestamp = js.native
  /**
    * The maximum amount of DebitedFunds
    */
  var MaxDebitedFundsAmount: Double = js.native
  /**
    * The currency for the maximum amount of DebitedFunds
    */
  var MaxDebitedFundsCurrency: CurrencyISO = js.native
  /**
    * The maximum amount of Fees
    */
  var MaxFeesAmount: Double = js.native
  /**
    * The currency for the maximum amount of Fees
    */
  var MaxFeesCurrency: CurrencyISO = js.native
  /**
    * The minimum amount of DebitedFunds
    */
  var MinDebitedFundsAmount: Double = js.native
  /**
    * The currency for the minimum amount of DebitedFunds
    */
  var MinDebitedFundsCurrency: CurrencyISO = js.native
  /**
    * The minimum amount of Fees
    */
  var MinFeesAmount: Double = js.native
  /**
    * The currency for the minimum amount of Fees
    */
  var MinFeesCurrency: CurrencyISO = js.native
  /**
    * The nature of the transaction
    */
  var Nature: js.Array[TransactionNature] = js.native
  /**
    * The status of the transaction
    */
  var Status: js.Array[TransactionStatus] = js.native
  /**
    * The type of the transaction
    */
  var Type: js.Array[TransactionType] = js.native
  /**
    * The ID of a wallet
    */
  var WalletId: String = js.native
}

object Filters {
  @scala.inline
  implicit class FiltersOps[Self <: Filters] (val x: Self) extends AnyVal {
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
    def withAuthorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBeforeDate(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeforeDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDebitedFundsAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxDebitedFundsAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDebitedFundsCurrency(value: CurrencyISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxDebitedFundsCurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxFeesAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxFeesAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxFeesCurrency(value: CurrencyISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxFeesCurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDebitedFundsAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinDebitedFundsAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDebitedFundsCurrency(value: CurrencyISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinDebitedFundsCurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinFeesAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinFeesAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinFeesCurrency(value: CurrencyISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinFeesCurrency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNature(value: js.Array[TransactionNature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Nature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: js.Array[TransactionStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: js.Array[TransactionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWalletId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WalletId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

