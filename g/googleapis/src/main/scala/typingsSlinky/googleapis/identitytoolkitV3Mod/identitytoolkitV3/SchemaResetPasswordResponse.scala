package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of resetting the password.
  */
@js.native
trait SchemaResetPasswordResponse extends js.Object {
  /**
    * The user&#39;s email. If the out-of-band code is for email recovery, the
    * user&#39;s original email.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The fixed string &quot;identitytoolkit#ResetPasswordResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * If the out-of-band code is for email recovery, the user&#39;s new email.
    */
  var newEmail: js.UndefOr[String] = js.native
  /**
    * The request type.
    */
  var requestType: js.UndefOr[String] = js.native
}

object SchemaResetPasswordResponse {
  @scala.inline
  def apply(): SchemaResetPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResetPasswordResponse]
  }
  @scala.inline
  implicit class SchemaResetPasswordResponseOps[Self <: SchemaResetPasswordResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withNewEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestType")(js.undefined)
        ret
    }
  }
  
}

