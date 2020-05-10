package typingsSlinky.meteor.ddpMod.DDP

import typingsSlinky.meteor.Meteor.SubscriptionHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DDPStatic extends js.Object {
  @JSName("apply")
  def apply(method: String, parameters: js.Any*): js.Any = js.native
  def call(method: String, parameters: js.Any*): js.Any = js.native
  def disconnect(): Unit = js.native
  def methods(IMeteorMethodsDictionary: js.Any): js.Any = js.native
  def onReconnect(): Unit = js.native
  def reconnect(): Unit = js.native
  def status(): DDPStatus = js.native
  def subscribe(name: String, rest: js.Any*): SubscriptionHandle = js.native
}

object DDPStatic {
  @scala.inline
  def apply(
    apply: (String, /* repeated */ js.Any) => js.Any,
    call: (String, /* repeated */ js.Any) => js.Any,
    disconnect: () => Unit,
    methods: js.Any => js.Any,
    onReconnect: () => Unit,
    reconnect: () => Unit,
    status: () => DDPStatus,
    subscribe: (String, /* repeated */ js.Any) => SubscriptionHandle
  ): DDPStatic = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), call = js.Any.fromFunction2(call), disconnect = js.Any.fromFunction0(disconnect), methods = js.Any.fromFunction1(methods), onReconnect = js.Any.fromFunction0(onReconnect), reconnect = js.Any.fromFunction0(reconnect), status = js.Any.fromFunction0(status), subscribe = js.Any.fromFunction2(subscribe))
    __obj.asInstanceOf[DDPStatic]
  }
  @scala.inline
  implicit class DDPStaticOps[Self <: DDPStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApply(value: (String, /* repeated */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apply")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCall(value: (String, /* repeated */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDisconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMethods(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methods")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnReconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStatus(value: () => DDPStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubscribe(value: (String, /* repeated */ js.Any) => SubscriptionHandle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

