package typingsSlinky.hubot.anon

import typingsSlinky.hubot.mod.Adapter
import typingsSlinky.hubot.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listener[A /* <: Adapter */] extends js.Object {
  var listener: Middleware[A] = js.native
  var receive: Middleware[A] = js.native
  var response: Middleware[A] = js.native
}

object Listener {
  @scala.inline
  def apply[A](listener: Middleware[A], receive: Middleware[A], response: Middleware[A]): Listener[A] = {
    val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any], receive = receive.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Listener[A]]
  }
  @scala.inline
  implicit class ListenerOps[Self[a] <: Listener[a], A] (val x: Self[A]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[A] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[A] with Other]
    @scala.inline
    def withListener(value: Middleware[A]): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceive(value: Middleware[A]): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: Middleware[A]): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

