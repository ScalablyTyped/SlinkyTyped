package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An invitation for a new client user to get access to the Authorized Buyers
  * UI. All fields are required unless otherwise specified.
  */
@js.native
trait SchemaClientUserInvitation extends js.Object {
  /**
    * Numerical account ID of the client buyer that the invited user is
    * associated with. The value of this field is ignored in create operations.
    */
  var clientAccountId: js.UndefOr[String] = js.native
  /**
    * The email address to which the invitation is sent. Email addresses should
    * be unique among all client users under each sponsor buyer.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The unique numerical ID of the invitation that is sent to the user. The
    * value of this field is ignored in create operations.
    */
  var invitationId: js.UndefOr[String] = js.native
}

object SchemaClientUserInvitation {
  @scala.inline
  def apply(): SchemaClientUserInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientUserInvitation]
  }
  @scala.inline
  implicit class SchemaClientUserInvitationOps[Self <: SchemaClientUserInvitation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationId")(js.undefined)
        ret
    }
  }
  
}

