package typingsSlinky.atlassianCrowdClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRequest extends js.Object {
  def request(email: String): js.Promise[Unit] = js.native
}

object AnonRequest {
  @scala.inline
  def apply(request: String => js.Promise[Unit]): AnonRequest = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
    __obj.asInstanceOf[AnonRequest]
  }
  @scala.inline
  implicit class AnonRequestOps[Self <: AnonRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequest(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

