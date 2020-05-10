package typingsSlinky.hapiBell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequiredProviderOptions extends js.Object {
  /**
    * the OAuth client identifier (consumer key).
    */
  var clientId: String = js.native
  /**
    * the OAuth client secret (consumer secret)
    */
  var clientSecret: String = js.native
  /**
    * the cookie encryption password.
    * Used to encrypt the temporary state cookie used by the module in
    * between the authorization protocol steps.
    */
  var password: String = js.native
}

object RequiredProviderOptions {
  @scala.inline
  def apply(clientId: String, clientSecret: String, password: String): RequiredProviderOptions = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredProviderOptions]
  }
  @scala.inline
  implicit class RequiredProviderOptionsOps[Self <: RequiredProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

