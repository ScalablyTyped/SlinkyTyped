package typingsSlinky.atlassianCrowdClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCookie extends js.Object {
  def cookie(): js.Promise[_] = js.native
}

object AnonCookie {
  @scala.inline
  def apply(cookie: () => js.Promise[_]): AnonCookie = {
    val __obj = js.Dynamic.literal(cookie = js.Any.fromFunction0(cookie))
    __obj.asInstanceOf[AnonCookie]
  }
  @scala.inline
  implicit class AnonCookieOps[Self <: AnonCookie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookie(value: () => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

