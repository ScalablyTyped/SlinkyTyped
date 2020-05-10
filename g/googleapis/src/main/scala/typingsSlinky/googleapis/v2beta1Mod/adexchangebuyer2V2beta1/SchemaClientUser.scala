package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client user is created under a client buyer and has restricted access to
  * the Marketplace and certain other sections of the Authorized Buyers UI
  * based on the role granted to the associated client buyer.  The only way a
  * new client user can be created is via accepting an email invitation (see
  * the accounts.clients.invitations.create method).  All fields are required
  * unless otherwise specified.
  */
@js.native
trait SchemaClientUser extends js.Object {
  /**
    * Numerical account ID of the client buyer with which the user is
    * associated; the buyer must be a client of the current sponsor buyer. The
    * value of this field is ignored in an update operation.
    */
  var clientAccountId: js.UndefOr[String] = js.native
  /**
    * User&#39;s email address. The value of this field is ignored in an update
    * operation.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The status of the client user.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The unique numerical ID of the client user that has accepted an
    * invitation. The value of this field is ignored in an update operation.
    */
  var userId: js.UndefOr[String] = js.native
}

object SchemaClientUser {
  @scala.inline
  def apply(): SchemaClientUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientUser]
  }
  @scala.inline
  implicit class SchemaClientUserOps[Self <: SchemaClientUser] (val x: Self) extends AnyVal {
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
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

