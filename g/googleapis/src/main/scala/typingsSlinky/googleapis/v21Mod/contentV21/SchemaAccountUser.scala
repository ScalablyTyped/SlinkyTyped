package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountUser extends js.Object {
  /**
    * Whether user is an admin.
    */
  var admin: js.UndefOr[Boolean] = js.native
  /**
    * User&#39;s email address.
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * Whether user is an order manager.
    */
  var orderManager: js.UndefOr[Boolean] = js.native
  /**
    * Whether user can access payment statements.
    */
  var paymentsAnalyst: js.UndefOr[Boolean] = js.native
  /**
    * Whether user can manage payment settings.
    */
  var paymentsManager: js.UndefOr[Boolean] = js.native
}

object SchemaAccountUser {
  @scala.inline
  def apply(): SchemaAccountUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountUser]
  }
  @scala.inline
  implicit class SchemaAccountUserOps[Self <: SchemaAccountUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdmin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdmin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("admin")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderManager(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderManager")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentsAnalyst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentsAnalyst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentsAnalyst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentsAnalyst")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentsManager(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentsManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentsManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentsManager")(js.undefined)
        ret
    }
  }
  
}

