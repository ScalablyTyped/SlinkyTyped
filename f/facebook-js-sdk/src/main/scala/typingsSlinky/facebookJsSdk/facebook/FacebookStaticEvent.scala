package typingsSlinky.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacebookStaticEvent extends js.Object {
  def subscribe[TEvent /* <: FacebookEventType */](event: TEvent, callback: FacebookEventCallback[TEvent]): Unit = js.native
  def unsubscribe[TEvent /* <: FacebookEventType */](event: TEvent, callback: FacebookEventCallback[TEvent]): Unit = js.native
}

object FacebookStaticEvent {
  @scala.inline
  def apply(
    subscribe: (js.Any, FacebookEventCallback[js.Any]) => Unit,
    unsubscribe: (js.Any, FacebookEventCallback[js.Any]) => Unit
  ): FacebookStaticEvent = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
    __obj.asInstanceOf[FacebookStaticEvent]
  }
  @scala.inline
  implicit class FacebookStaticEventOps[Self <: FacebookStaticEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubscribe(value: (js.Any, FacebookEventCallback[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnsubscribe(value: (js.Any, FacebookEventCallback[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsubscribe")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

