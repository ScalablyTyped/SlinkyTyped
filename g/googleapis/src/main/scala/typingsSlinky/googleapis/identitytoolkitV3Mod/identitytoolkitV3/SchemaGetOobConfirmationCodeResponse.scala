package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of getting a code for user confirmation (reset password, change
  * email etc.).
  */
@js.native
trait SchemaGetOobConfirmationCodeResponse extends js.Object {
  /**
    * The email address that the email is sent to.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The fixed string
    * &quot;identitytoolkit#GetOobConfirmationCodeResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The code to be send to the user.
    */
  var oobCode: js.UndefOr[String] = js.native
}

object SchemaGetOobConfirmationCodeResponse {
  @scala.inline
  def apply(): SchemaGetOobConfirmationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOobConfirmationCodeResponse]
  }
  @scala.inline
  implicit class SchemaGetOobConfirmationCodeResponseOps[Self <: SchemaGetOobConfirmationCodeResponse] (val x: Self) extends AnyVal {
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

