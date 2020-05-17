package typingsSlinky.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountInfo extends js.Object {
  var countryCode: String = js.native
  var email: String = js.native
  var name: String = js.native
  var privateBytes: Double = js.native
  var publicAppUrl: String = js.native
  var quota: Double = js.native
  var referralUrl: String = js.native
  var sharedBytes: Double = js.native
  var uid: String = js.native
  var usedQuota: Double = js.native
  def json(): js.Object = js.native
}

object AccountInfo {
  @scala.inline
  def apply(
    countryCode: String,
    email: String,
    json: () => js.Object,
    name: String,
    privateBytes: Double,
    publicAppUrl: String,
    quota: Double,
    referralUrl: String,
    sharedBytes: Double,
    uid: String,
    usedQuota: Double
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), name = name.asInstanceOf[js.Any], privateBytes = privateBytes.asInstanceOf[js.Any], publicAppUrl = publicAppUrl.asInstanceOf[js.Any], quota = quota.asInstanceOf[js.Any], referralUrl = referralUrl.asInstanceOf[js.Any], sharedBytes = sharedBytes.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], usedQuota = usedQuota.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountInfo]
  }
  @scala.inline
  implicit class AccountInfoOps[Self <: AccountInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJson(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicAppUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicAppUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuota(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferralUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referralUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsedQuota(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedQuota")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

