package typingsSlinky.naja

import typingsSlinky.naja.mod.SnippetUpdateEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHandleEvent extends js.Object {
  def handleEvent(event: SnippetUpdateEvent): js.Promise[Unit] | Unit = js.native
}

object AnonHandleEvent {
  @scala.inline
  def apply(handleEvent: SnippetUpdateEvent => js.Promise[Unit] | Unit): AnonHandleEvent = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[AnonHandleEvent]
  }
  @scala.inline
  implicit class AnonHandleEventOps[Self <: AnonHandleEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleEvent(value: SnippetUpdateEvent => js.Promise[Unit] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleEvent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

