package typingsSlinky.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnlinkIdentityInput extends js.Object {
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: typingsSlinky.awsSdk.cognitoidentityMod.IdentityId = js.native
  /**
    * A set of optional name-value pairs that map provider names to provider tokens.
    */
  var Logins: LoginsMap = js.native
  /**
    * Provider names to unlink from this identity.
    */
  var LoginsToRemove: LoginsList = js.native
}

object UnlinkIdentityInput {
  @scala.inline
  def apply(IdentityId: IdentityId, Logins: LoginsMap, LoginsToRemove: LoginsList): UnlinkIdentityInput = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any], Logins = Logins.asInstanceOf[js.Any], LoginsToRemove = LoginsToRemove.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlinkIdentityInput]
  }
  @scala.inline
  implicit class UnlinkIdentityInputOps[Self <: UnlinkIdentityInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentityId(value: IdentityId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdentityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogins(value: LoginsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Logins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoginsToRemove(value: LoginsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoginsToRemove")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

