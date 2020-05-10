package typingsSlinky.mangopay2NodejsSdk.mod.cardPreAuthorization

import typingsSlinky.mangopay2NodejsSdk.mod.BillingData
import typingsSlinky.mangopay2NodejsSdk.mod.MoneyData
import typingsSlinky.mangopay2NodejsSdk.mod.SecureMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.cardPreAuthorization.CardPreAuthorizationData, 'Tag' | 'Billing' | 'SecureMode', 'AuthorId' | 'DebitedFunds' | 'CardId' | 'SecureModeReturnURL'> */
@js.native
trait CreateCardPreAuthorization extends js.Object {
  var AuthorId: String = js.native
  var Billing: js.UndefOr[BillingData] = js.native
  var CardId: String = js.native
  var DebitedFunds: MoneyData = js.native
  var SecureMode: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.SecureMode] = js.native
  var SecureModeReturnURL: String = js.native
  var Tag: js.UndefOr[String] = js.native
}

object CreateCardPreAuthorization {
  @scala.inline
  def apply(AuthorId: String, CardId: String, DebitedFunds: MoneyData, SecureModeReturnURL: String): CreateCardPreAuthorization = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCardPreAuthorization]
  }
  @scala.inline
  implicit class CreateCardPreAuthorizationOps[Self <: CreateCardPreAuthorization] (val x: Self) extends AnyVal {
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
    def withCardId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CardId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebitedFunds(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedFunds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecureModeReturnURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecureModeReturnURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBilling(value: BillingData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Billing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Billing")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureMode(value: SecureMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecureMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecureMode")(js.undefined)
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

