package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to sign in with email.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest extends js.Object {
  /**
    * The email address of the user.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Token for linking flow.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * The confirmation code.
    */
  var oobCode: js.UndefOr[String] = js.native
}

object SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest {
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest]
  }
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequestOps[Self <: SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest] (val x: Self) extends AnyVal {
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
    def withIdToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOobCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oobCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOobCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oobCode")(js.undefined)
        ret
    }
  }
  
}

