package typingsSlinky.googleapisCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Oauth2 extends js.Object {
  var oauth2: Scopes = js.native
}

object Oauth2 {
  @scala.inline
  def apply(oauth2: Scopes): Oauth2 = {
    val __obj = js.Dynamic.literal(oauth2 = oauth2.asInstanceOf[js.Any])
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
  }
  
}

