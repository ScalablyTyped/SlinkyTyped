package typingsSlinky.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLogoutRequestUrlOptions extends js.Object {
  var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.native
  var name_id: js.UndefOr[String] = js.native
  var relay_state: js.UndefOr[String] = js.native
  var session_index: js.UndefOr[String] = js.native
  var sign_get_request: js.UndefOr[Boolean] = js.native
}

object CreateLogoutRequestUrlOptions {
  @scala.inline
  def apply(): CreateLogoutRequestUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLogoutRequestUrlOptions]
  }
  @scala.inline
  implicit class CreateLogoutRequestUrlOptionsOps[Self <: CreateLogoutRequestUrlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow_unencrypted_assertion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_unencrypted_assertion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_unencrypted_assertion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_unencrypted_assertion")(js.undefined)
        ret
    }
    @scala.inline
    def withName_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name_id")(js.undefined)
        ret
    }
    @scala.inline
    def withRelay_state(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relay_state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelay_state: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relay_state")(js.undefined)
        ret
    }
    @scala.inline
    def withSession_index(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession_index: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_index")(js.undefined)
        ret
    }
    @scala.inline
    def withSign_get_request(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign_get_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSign_get_request: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sign_get_request")(js.undefined)
        ret
    }
  }
  
}

