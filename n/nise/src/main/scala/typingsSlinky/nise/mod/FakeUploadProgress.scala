package typingsSlinky.nise.mod

import org.scalajs.dom.raw.Event
import typingsSlinky.nise.anon.Abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FakeUploadProgress extends js.Object {
  var eventListeners: Abort = js.native
  def addEventListener(event: String, listener: js.Function1[/* e */ Event, _]): Unit = js.native
  def dispatchEvent(event: Event): Unit = js.native
  def removeEventListener(event: String, listener: js.Function1[/* e */ Event, _]): Unit = js.native
}

object FakeUploadProgress {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* e */ Event, _]) => Unit,
    dispatchEvent: Event => Unit,
    eventListeners: Abort,
    removeEventListener: (String, js.Function1[/* e */ Event, _]) => Unit
  ): FakeUploadProgress = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), eventListeners = eventListeners.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[FakeUploadProgress]
  }
  @scala.inline
  implicit class FakeUploadProgressOps[Self <: FakeUploadProgress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(value: (String, js.Function1[/* e */ Event, _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDispatchEvent(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEventListeners(value: Abort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (String, js.Function1[/* e */ Event, _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

