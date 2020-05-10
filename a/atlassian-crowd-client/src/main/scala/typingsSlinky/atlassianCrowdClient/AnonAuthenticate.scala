package typingsSlinky.atlassianCrowdClient

import typingsSlinky.atlassianCrowdClient.userMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAuthenticate extends js.Object {
  def authenticate(username: String, password: String): js.Promise[^] = js.native
}

object AnonAuthenticate {
  @scala.inline
  def apply(authenticate: (String, String) => js.Promise[^]): AnonAuthenticate = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate))
    __obj.asInstanceOf[AnonAuthenticate]
  }
  @scala.inline
  implicit class AnonAuthenticateOps[Self <: AnonAuthenticate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticate(value: (String, String) => js.Promise[^]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticate")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

