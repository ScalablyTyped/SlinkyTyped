package typingsSlinky.reachRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History extends js.Object {
  val location: HistoryLocation = js.native
  var navigate: NavigateFn = js.native
  val transitioning: Boolean = js.native
  def listen(listener: HistoryListener): HistoryUnsubscribe = js.native
}

object History {
  @scala.inline
  def apply(
    listen: HistoryListener => HistoryUnsubscribe,
    location: HistoryLocation,
    navigate: NavigateFn,
    transitioning: Boolean
  ): History = {
    val __obj = js.Dynamic.literal(listen = js.Any.fromFunction1(listen), location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any], transitioning = transitioning.asInstanceOf[js.Any])
    __obj.asInstanceOf[History]
  }
  @scala.inline
  implicit class HistoryOps[Self <: History] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListen(value: HistoryListener => HistoryUnsubscribe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLocation(value: HistoryLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNavigate(value: NavigateFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitioning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitioning")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

