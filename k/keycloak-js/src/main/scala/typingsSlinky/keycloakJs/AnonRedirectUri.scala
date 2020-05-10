package typingsSlinky.keycloakJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRedirectUri extends js.Object {
  var redirectUri: String = js.native
}

object AnonRedirectUri {
  @scala.inline
  def apply(redirectUri: String): AnonRedirectUri = {
    val __obj = js.Dynamic.literal(redirectUri = redirectUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRedirectUri]
  }
  @scala.inline
  implicit class AnonRedirectUriOps[Self <: AnonRedirectUri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedirectUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

