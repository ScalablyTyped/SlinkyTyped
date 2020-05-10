package typingsSlinky.nodeGeocoder.mod

import typingsSlinky.nodeGeocoder.nodeGeocoderStrings.smartyStreet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartyStreetsOptions extends js.Object {
  var auth_id: String = js.native
  var auth_token: String = js.native
  var provider: smartyStreet = js.native
}

object SmartyStreetsOptions {
  @scala.inline
  def apply(auth_id: String, auth_token: String, provider: smartyStreet): SmartyStreetsOptions = {
    val __obj = js.Dynamic.literal(auth_id = auth_id.asInstanceOf[js.Any], auth_token = auth_token.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartyStreetsOptions]
  }
  @scala.inline
  implicit class SmartyStreetsOptionsOps[Self <: SmartyStreetsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuth_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvider(value: smartyStreet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

