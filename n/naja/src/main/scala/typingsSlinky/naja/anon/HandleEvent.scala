package typingsSlinky.naja.anon

import typingsSlinky.naja.mod.SnippetUpdateEvent
import typingsSlinky.naja.mod.SnippetUpdateListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleEvent extends SnippetUpdateListener {
  def handleEvent(event: SnippetUpdateEvent): js.Promise[Unit] | Unit = js.native
}

object HandleEvent {
  @scala.inline
  def apply(handleEvent: SnippetUpdateEvent => js.Promise[Unit] | Unit): HandleEvent = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[HandleEvent]
  }
  @scala.inline
  implicit class HandleEventOps[Self <: HandleEvent] (val x: Self) extends AnyVal {
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

