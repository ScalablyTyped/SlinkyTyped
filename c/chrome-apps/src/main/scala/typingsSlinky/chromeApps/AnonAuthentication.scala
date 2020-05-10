package typingsSlinky.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthentication extends js.Object {
  var Authentication: String = js.native
}

object AnonAuthentication {
  @scala.inline
  def apply(Authentication: String): AnonAuthentication = {
    val __obj = js.Dynamic.literal(Authentication = Authentication.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthentication]
  }
  @scala.inline
  implicit class AnonAuthenticationOps[Self <: AnonAuthentication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthentication(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Authentication")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

