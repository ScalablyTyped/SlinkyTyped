package typingsSlinky.mangopay2NodejsSdk.mod.wallet

import typingsSlinky.mangopay2NodejsSdk.typesMod.CurrencyISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.wallet.UpdateWallet & std.Pick<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.wallet.WalletData, 'Owners' | 'Currency' | 'Description'> */
@js.native
trait CreateWallet extends js.Object {
  var Currency: CurrencyISO = js.native
  var Description: js.UndefOr[String] = js.native
  var Owners: js.Array[String] = js.native
  var Tag: js.UndefOr[String] = js.native
}

object CreateWallet {
  @scala.inline
  def apply(Currency: CurrencyISO, Owners: js.Array[String]): CreateWallet = {
    val __obj = js.Dynamic.literal(Currency = Currency.asInstanceOf[js.Any], Owners = Owners.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWallet]
  }
  @scala.inline
  implicit class CreateWalletOps[Self <: CreateWallet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrency(value: CurrencyISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Currency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwners(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Owners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
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

