package typingsSlinky.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssertOptions extends js.Object {
  var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.native
  var request_body: js.UndefOr[js.Any] = js.native
}

object GetAssertOptions {
  @scala.inline
  def apply(): GetAssertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssertOptions]
  }
  @scala.inline
  implicit class GetAssertOptionsOps[Self <: GetAssertOptions] (val x: Self) extends AnyVal {
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
    def withRequest_body(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest_body: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_body")(js.undefined)
        ret
    }
  }
  
}

