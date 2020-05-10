package typingsSlinky.hellosignEmbedded.mod.HelloSign

import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorMessageEvent extends MessageEvent {
  var description: String = js.native
  var event: error = js.native
}

object ErrorMessageEvent {
  @scala.inline
  def apply(description: String, event: error): ErrorMessageEvent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorMessageEvent]
  }
  @scala.inline
  implicit class ErrorMessageEventOps[Self <: ErrorMessageEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent(value: error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

