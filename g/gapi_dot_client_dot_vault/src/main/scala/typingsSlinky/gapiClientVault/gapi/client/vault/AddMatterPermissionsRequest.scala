package typingsSlinky.gapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddMatterPermissionsRequest extends js.Object {
  /**
    * Only relevant if send_emails is true.
    * True to CC requestor in the email message.
    * False to not CC requestor.
    */
  var ccMe: js.UndefOr[Boolean] = js.native
  /** The MatterPermission to add. */
  var matterPermission: js.UndefOr[MatterPermission] = js.native
  /**
    * True to send notification email to the added account.
    * False to not send notification email.
    */
  var sendEmails: js.UndefOr[Boolean] = js.native
}

object AddMatterPermissionsRequest {
  @scala.inline
  def apply(): AddMatterPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddMatterPermissionsRequest]
  }
  @scala.inline
  implicit class AddMatterPermissionsRequestOps[Self <: AddMatterPermissionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCcMe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccMe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCcMe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ccMe")(js.undefined)
        ret
    }
    @scala.inline
    def withMatterPermission(value: MatterPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matterPermission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatterPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matterPermission")(js.undefined)
        ret
    }
    @scala.inline
    def withSendEmails(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSendEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendEmails")(js.undefined)
        ret
    }
  }
  
}

