package typingsSlinky.reactPlaidLink

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccounts extends js.Object {
  var accounts: js.Array[AnonId] = js.native
  var institution: AnonInstitutionid = js.native
  var link_session_id: String = js.native
}

object AnonAccounts {
  @scala.inline
  def apply(accounts: js.Array[AnonId], institution: AnonInstitutionid, link_session_id: String): AnonAccounts = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], institution = institution.asInstanceOf[js.Any], link_session_id = link_session_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccounts]
  }
  @scala.inline
  implicit class AnonAccountsOps[Self <: AnonAccounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccounts(value: js.Array[AnonId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstitution(value: AnonInstitutionid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("institution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink_session_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link_session_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

