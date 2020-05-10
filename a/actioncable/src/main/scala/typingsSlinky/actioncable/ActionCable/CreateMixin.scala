package typingsSlinky.actioncable.ActionCable

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMixin
  extends /* key */ StringDictionary[js.Any] {
  var connected: js.UndefOr[js.Function0[Unit]] = js.native
  var disconnected: js.UndefOr[js.Function0[Unit]] = js.native
  var received: js.UndefOr[js.Function1[/* obj */ js.Any, Unit]] = js.native
}

object CreateMixin {
  @scala.inline
  def apply(): CreateMixin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMixin]
  }
  @scala.inline
  implicit class CreateMixinOps[Self <: CreateMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnected(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutConnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected")(js.undefined)
        ret
    }
    @scala.inline
    def withDisconnected(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDisconnected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnected")(js.undefined)
        ret
    }
    @scala.inline
    def withReceived(value: /* obj */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("received")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("received")(js.undefined)
        ret
    }
  }
  
}

