package typingsSlinky.loopback

import typingsSlinky.loopback.mod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCaseSensitiveEmail extends js.Object {
  var acls: js.Array[ACL] = js.native
  var caseSensitiveEmail: Boolean = js.native
  var emailVerificationRequired: Boolean = js.native
  var http: AnonPath = js.native
  var maxTTL: Double = js.native
  var realmDelimiter: String = js.native
  var realmRequired: Boolean = js.native
  var resetPasswordTokenTTL: Double = js.native
  var saltWorkFactor: Double = js.native
  var ttl: Double = js.native
}

object AnonCaseSensitiveEmail {
  @scala.inline
  def apply(
    acls: js.Array[ACL],
    caseSensitiveEmail: Boolean,
    emailVerificationRequired: Boolean,
    http: AnonPath,
    maxTTL: Double,
    realmDelimiter: String,
    realmRequired: Boolean,
    resetPasswordTokenTTL: Double,
    saltWorkFactor: Double,
    ttl: Double
  ): AnonCaseSensitiveEmail = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], caseSensitiveEmail = caseSensitiveEmail.asInstanceOf[js.Any], emailVerificationRequired = emailVerificationRequired.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], maxTTL = maxTTL.asInstanceOf[js.Any], realmDelimiter = realmDelimiter.asInstanceOf[js.Any], realmRequired = realmRequired.asInstanceOf[js.Any], resetPasswordTokenTTL = resetPasswordTokenTTL.asInstanceOf[js.Any], saltWorkFactor = saltWorkFactor.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaseSensitiveEmail]
  }
  @scala.inline
  implicit class AnonCaseSensitiveEmailOps[Self <: AnonCaseSensitiveEmail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcls(value: js.Array[ACL]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaseSensitiveEmail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitiveEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailVerificationRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailVerificationRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttp(value: AnonPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxTTL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealmDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realmDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRealmRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realmRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetPasswordTokenTTL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetPasswordTokenTTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSaltWorkFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saltWorkFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTtl(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ttl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

