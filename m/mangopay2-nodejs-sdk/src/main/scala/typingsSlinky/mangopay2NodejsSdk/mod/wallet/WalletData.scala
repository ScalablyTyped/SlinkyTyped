package typingsSlinky.mangopay2NodejsSdk.mod.wallet

import typingsSlinky.mangopay2NodejsSdk.mod.MoneyData
import typingsSlinky.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typingsSlinky.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WalletData extends EntityBaseData {
  /**
    * The current balance of the wallet
    */
  var Balance: MoneyData = js.native
  /**
    * The currency - should be ISO_4217 format
    */
  var Currency: CurrencyISO = js.native
  /**
    * A desciption of the wallet
    */
  var Description: String = js.native
  /**
    * The type of funds in the wallet
    */
  var FundsType: typingsSlinky.mangopay2NodejsSdk.mod.wallet.FundsType = js.native
  /**
    * An array of userIDs of who own's the wallet. For now, you only can set up a unique owner.
    */
  var Owners: js.Array[String] = js.native
}

object WalletData {
  @scala.inline
  def apply(
    Balance: MoneyData,
    CreationDate: Double,
    Currency: CurrencyISO,
    Description: String,
    FundsType: FundsType,
    Id: String,
    Owners: js.Array[String],
    Tag: String
  ): WalletData = {
    val __obj = js.Dynamic.literal(Balance = Balance.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Currency = Currency.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], FundsType = FundsType.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Owners = Owners.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletData]
  }
  @scala.inline
  implicit class WalletDataOps[Self <: WalletData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBalance(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Balance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrency(value: CurrencyISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFundsType(value: FundsType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FundsType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwners(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owners")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

