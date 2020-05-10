package typingsSlinky.auth0Widget.mod

import typingsSlinky.auth0Js.mod.AuthOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0Constructor extends AuthOptions {
  var assetsUrl: js.UndefOr[String] = js.native
  var cdn: js.UndefOr[String] = js.native
  var dict: js.UndefOr[js.Any] = js.native
}

object Auth0Constructor {
  @scala.inline
  def apply(clientID: String, domain: String): Auth0Constructor = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0Constructor]
  }
  @scala.inline
  implicit class Auth0ConstructorOps[Self <: Auth0Constructor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetsUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCdn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdn")(js.undefined)
        ret
    }
    @scala.inline
    def withDict(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dict")(js.undefined)
        ret
    }
  }
  
}

