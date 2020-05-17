package typingsSlinky.gapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Oauth2 extends js.Object {
  /** OAuth 2.0 authentication information. */
  var oauth2: js.UndefOr[Scopes] = js.native
}

object Oauth2 {
  @scala.inline
  def apply(): Oauth2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Oauth2]
  }
  @scala.inline
  implicit class Oauth2Ops[Self <: Oauth2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOauth2(value: Scopes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauth2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauth2")(js.undefined)
        ret
    }
  }
  
}

