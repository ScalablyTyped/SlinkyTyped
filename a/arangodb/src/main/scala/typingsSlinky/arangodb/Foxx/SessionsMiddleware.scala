package typingsSlinky.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionsMiddleware extends DelegateMiddleware {
  var storage: SessionStorage = js.native
  var transport: js.Array[SessionTransport] = js.native
}

object SessionsMiddleware {
  @scala.inline
  def apply(
    register: Endpoint => SimpleMiddleware,
    storage: SessionStorage,
    transport: js.Array[SessionTransport]
  ): SessionsMiddleware = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register), storage = storage.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionsMiddleware]
  }
  @scala.inline
  implicit class SessionsMiddlewareOps[Self <: SessionsMiddleware] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStorage(value: SessionStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransport(value: js.Array[SessionTransport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

