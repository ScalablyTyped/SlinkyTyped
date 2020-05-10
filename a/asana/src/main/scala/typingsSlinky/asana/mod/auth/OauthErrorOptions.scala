package typingsSlinky.asana.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OauthErrorOptions extends js.Object {
  var error: js.UndefOr[String] = js.native
  var error_description: js.UndefOr[String] = js.native
  var error_uri: js.UndefOr[String] = js.native
}

object OauthErrorOptions {
  @scala.inline
  def apply(): OauthErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OauthErrorOptions]
  }
  @scala.inline
  implicit class OauthErrorOptionsOps[Self <: OauthErrorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withError_description(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_description")(js.undefined)
        ret
    }
    @scala.inline
    def withError_uri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError_uri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_uri")(js.undefined)
        ret
    }
  }
  
}

