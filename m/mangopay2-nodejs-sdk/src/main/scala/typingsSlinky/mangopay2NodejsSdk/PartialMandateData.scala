package typingsSlinky.mangopay2NodejsSdk

import typingsSlinky.mangopay2NodejsSdk.mod.mandate.MandateCultureCode
import typingsSlinky.mangopay2NodejsSdk.mod.mandate.MandateExecutionType
import typingsSlinky.mangopay2NodejsSdk.mod.mandate.MandateScheme
import typingsSlinky.mangopay2NodejsSdk.mod.mandate.MandateStatus
import typingsSlinky.mangopay2NodejsSdk.mod.mandate.MandateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.mandate.MandateData> */
@js.native
trait PartialMandateData extends js.Object {
  var BankAccountId: js.UndefOr[String] = js.native
  var BankReference: js.UndefOr[String] = js.native
  var CreationDate: js.UndefOr[Double] = js.native
  var Culture: js.UndefOr[MandateCultureCode] = js.native
  var DocumentURL: js.UndefOr[String] = js.native
  var ExecutionType: js.UndefOr[MandateExecutionType] = js.native
  var Id: js.UndefOr[String] = js.native
  var MandateType: js.UndefOr[typingsSlinky.mangopay2NodejsSdk.mod.mandate.MandateType] = js.native
  var RedirectURL: js.UndefOr[String] = js.native
  var ResultCode: js.UndefOr[String] = js.native
  var ResultMessage: js.UndefOr[String] = js.native
  var ReturnURL: js.UndefOr[String] = js.native
  var Scheme: js.UndefOr[MandateScheme] = js.native
  var Status: js.UndefOr[MandateStatus] = js.native
  var Tag: js.UndefOr[String] = js.native
  var UserId: js.UndefOr[String] = js.native
}

object PartialMandateData {
  @scala.inline
  def apply(): PartialMandateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMandateData]
  }
  @scala.inline
  implicit class PartialMandateDataOps[Self <: PartialMandateData] (val x: Self) extends AnyVal {
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
    def withoutBankAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BankAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withBankReference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BankReference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBankReference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BankReference")(js.undefined)
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
    def withCulture(value: MandateCultureCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Culture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCulture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Culture")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentURL")(js.undefined)
        ret
    }
    @scala.inline
    def withExecutionType(value: MandateExecutionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExecutionType")(js.undefined)
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
    def withMandateType(value: MandateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MandateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMandateType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MandateType")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedirectURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedirectURL")(js.undefined)
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
    def withReturnURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnURL")(js.undefined)
        ret
    }
    @scala.inline
    def withScheme(value: MandateScheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scheme")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: MandateStatus): Self = {
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
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserId")(js.undefined)
        ret
    }
  }
  
}

