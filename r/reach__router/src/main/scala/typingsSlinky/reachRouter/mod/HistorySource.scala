package typingsSlinky.reachRouter.mod

import org.scalajs.dom.raw.Event
import typingsSlinky.history.mod.LocationState
import typingsSlinky.reachRouter.anon.PushState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistorySource extends js.Object {
  var history: PushState = js.native
  val location: WindowLocation[LocationState] = js.native
  def addEventListener(name: String, listener: js.Function1[/* event */ Event, Unit]): Unit = js.native
  def removeEventListener(name: String, listener: js.Function1[/* event */ Event, Unit]): Unit = js.native
}

object HistorySource {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* event */ Event, Unit]) => Unit,
    history: PushState,
    location: WindowLocation[LocationState],
    removeEventListener: (String, js.Function1[/* event */ Event, Unit]) => Unit
  ): HistorySource = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[HistorySource]
  }
  @scala.inline
  implicit class HistorySourceOps[Self <: HistorySource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(value: (String, js.Function1[/* event */ Event, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHistory(value: PushState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: WindowLocation[LocationState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (String, js.Function1[/* event */ Event, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

