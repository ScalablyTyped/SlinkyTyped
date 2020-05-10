package typingsSlinky.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationConfig extends js.Object {
  /**
    * The name of the authorization provider, such as
    * firebaserules.googleapis.com.
    */
  var provider: js.UndefOr[String] = js.native
}

object AuthorizationConfig {
  @scala.inline
  def apply(): AuthorizationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationConfig]
  }
  @scala.inline
  implicit class AuthorizationConfigOps[Self <: AuthorizationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
  }
  
}

