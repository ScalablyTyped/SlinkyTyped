package typingsSlinky.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLogoutResponseUrlOptions extends js.Object {
  var in_response_to: js.UndefOr[String] = js.native
  var relay_state: js.UndefOr[String] = js.native
  var sign_get_request: js.UndefOr[Boolean] = js.native
}

object CreateLogoutResponseUrlOptions {
  @scala.inline
  def apply(): CreateLogoutResponseUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLogoutResponseUrlOptions]
  }
  @scala.inline
  implicit class CreateLogoutResponseUrlOptionsOps[Self <: CreateLogoutResponseUrlOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIn_response_to(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_response_to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIn_response_to: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in_response_to")(js.undefined)
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

