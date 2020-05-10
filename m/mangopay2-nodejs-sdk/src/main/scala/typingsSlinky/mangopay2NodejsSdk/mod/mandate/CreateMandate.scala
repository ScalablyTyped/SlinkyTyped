package typingsSlinky.mangopay2NodejsSdk.mod.mandate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.mandate.MandateData, 'Tag', 'BankAccountId' | 'Culture' | 'ReturnURL'> */
@js.native
trait CreateMandate extends js.Object {
  var BankAccountId: String = js.native
  var Culture: MandateCultureCode = js.native
  var ReturnURL: String = js.native
  var Tag: js.UndefOr[String] = js.native
}

object CreateMandate {
  @scala.inline
  def apply(BankAccountId: String, Culture: MandateCultureCode, ReturnURL: String): CreateMandate = {
    val __obj = js.Dynamic.literal(BankAccountId = BankAccountId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMandate]
  }
  @scala.inline
  implicit class CreateMandateOps[Self <: CreateMandate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBankAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BankAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCulture(value: MandateCultureCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Culture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnURL")(value.asInstanceOf[js.Any])
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

