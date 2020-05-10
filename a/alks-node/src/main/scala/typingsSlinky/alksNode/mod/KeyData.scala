package typingsSlinky.alksNode.mod

import typingsSlinky.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyData extends js.Object {
  var accessKey: String = js.native
  var alksAccount: String = js.native
  var alksRole: String = js.native
  var expires: Moment = js.native
  var secretKey: String = js.native
  var sessionTime: String = js.native
  var sessionToken: String = js.native
}

object KeyData {
  @scala.inline
  def apply(
    accessKey: String,
    alksAccount: String,
    alksRole: String,
    expires: Moment,
    secretKey: String,
    sessionTime: String,
    sessionToken: String
  ): KeyData = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], alksAccount = alksAccount.asInstanceOf[js.Any], alksRole = alksRole.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any], sessionTime = sessionTime.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyData]
  }
  @scala.inline
  implicit class KeyDataOps[Self <: KeyData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlksAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alksAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlksRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alksRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpires(value: Moment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecretKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionToken")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

