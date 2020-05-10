package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderContact extends js.Object {
  var contactInfo: js.UndefOr[String] = js.native
  var contactName: js.UndefOr[String] = js.native
  var contactTitle: js.UndefOr[String] = js.native
  var contactType: js.UndefOr[String] = js.native
  var signatureUserProfileId: js.UndefOr[String] = js.native
}

object OrderContact {
  @scala.inline
  def apply(): OrderContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderContact]
  }
  @scala.inline
  implicit class OrderContactOps[Self <: OrderContact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withContactName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactName")(js.undefined)
        ret
    }
    @scala.inline
    def withContactTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withContactType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactType")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureUserProfileId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureUserProfileId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureUserProfileId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureUserProfileId")(js.undefined)
        ret
    }
  }
  
}

