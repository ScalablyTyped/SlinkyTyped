package typingsSlinky.nise.mod

import typingsSlinky.nise.AnonAbort
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FakeUploadProgress extends js.Object {
  var eventListeners: AnonAbort = js.native
  def addEventListener(event: String, listener: js.Function1[/* e */ Event_, _]): Unit = js.native
  def dispatchEvent(event: Event_): Unit = js.native
  def removeEventListener(event: String, listener: js.Function1[/* e */ Event_, _]): Unit = js.native
}

object FakeUploadProgress {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* e */ Event_, _]) => Unit,
    dispatchEvent: Event_ => Unit,
    eventListeners: AnonAbort,
    removeEventListener: (String, js.Function1[/* e */ Event_, _]) => Unit
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
    def withAddEventListener(value: (String, js.Function1[/* e */ Event_, _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDispatchEvent(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEventListeners(value: AnonAbort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (String, js.Function1[/* e */ Event_, _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

