package typingsSlinky.nes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Socket extends js.Object {
  var app: js.Object = js.native
  var auth: SocketAuthObject = js.native
  var id: String = js.native
  def disconnect(): js.Promise[_] = js.native
  def publish(path: String, message: js.Any): js.Promise[_] = js.native
  def revoke(path: String, message: js.Any): js.Promise[_] = js.native
  def send(message: js.Any): js.Promise[_] = js.native
}

object Socket {
  @scala.inline
  def apply(
    app: js.Object,
    auth: SocketAuthObject,
    disconnect: () => js.Promise[_],
    id: String,
    publish: (String, js.Any) => js.Promise[_],
    revoke: (String, js.Any) => js.Promise[_],
    send: js.Any => js.Promise[_]
  ): Socket = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], disconnect = js.Any.fromFunction0(disconnect), id = id.asInstanceOf[js.Any], publish = js.Any.fromFunction2(publish), revoke = js.Any.fromFunction2(revoke), send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[Socket]
  }
  @scala.inline
  implicit class SocketOps[Self <: Socket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuth(value: SocketAuthObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisconnect(value: () => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublish(value: (String, js.Any) => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRevoke(value: (String, js.Any) => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revoke")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSend(value: js.Any => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

