package typingsSlinky.nodeOpenload.mod

import typingsSlinky.nodeOpenload.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The account info response
  */
@js.native
trait AccountInfo extends js.Object {
  var balance: Double = js.native
  var email: String = js.native
  var extid: String = js.native
  var signup_at: String = js.native
  var storage_left: Double = js.native
  var storage_used: String = js.native
  var traffic: Left = js.native
}

object AccountInfo {
  @scala.inline
  def apply(
    balance: Double,
    email: String,
    extid: String,
    signup_at: String,
    storage_left: Double,
    storage_used: String,
    traffic: Left
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(balance = balance.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], extid = extid.asInstanceOf[js.Any], signup_at = signup_at.asInstanceOf[js.Any], storage_left = storage_left.asInstanceOf[js.Any], storage_used = storage_used.asInstanceOf[js.Any], traffic = traffic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  @scala.inline
  implicit class AccountInfoOps[Self <: AccountInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBalance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("balance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignup_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signup_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorage_left(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage_left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorage_used(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage_used")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraffic(value: Left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traffic")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

