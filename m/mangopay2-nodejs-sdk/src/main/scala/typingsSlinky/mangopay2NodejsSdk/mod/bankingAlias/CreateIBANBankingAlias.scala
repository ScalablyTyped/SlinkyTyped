package typingsSlinky.mangopay2NodejsSdk.mod.bankingAlias

import typingsSlinky.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankingAlias.IBANBankingAliasData, 'Tag' | 'CreditedUserId', 'OwnerName' | 'Country'> */
@js.native
trait CreateIBANBankingAlias extends js.Object {
  var Country: CountryISO = js.native
  var CreditedUserId: js.UndefOr[String] = js.native
  var OwnerName: String = js.native
  var Tag: js.UndefOr[String] = js.native
}

object CreateIBANBankingAlias {
  @scala.inline
  def apply(Country: CountryISO, OwnerName: String): CreateIBANBankingAlias = {
    val __obj = js.Dynamic.literal(Country = Country.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIBANBankingAlias]
  }
  @scala.inline
  implicit class CreateIBANBankingAliasOps[Self <: CreateIBANBankingAlias] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: CountryISO): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerName")(value.asInstanceOf[js.Any])
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

