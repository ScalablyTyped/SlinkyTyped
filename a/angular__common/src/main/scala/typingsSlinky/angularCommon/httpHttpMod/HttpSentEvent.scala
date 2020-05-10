package typingsSlinky.angularCommon.httpHttpMod

import typingsSlinky.angularCommon.httpHttpMod.HttpEventType.Sent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpSentEvent
  extends HttpEvent[js.Any] {
  var `type`: Sent = js.native
}

object HttpSentEvent {
  @scala.inline
  def apply(`type`: Sent): HttpSentEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpSentEvent]
  }
  @scala.inline
  implicit class HttpSentEventOps[Self <: HttpSentEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: Sent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

