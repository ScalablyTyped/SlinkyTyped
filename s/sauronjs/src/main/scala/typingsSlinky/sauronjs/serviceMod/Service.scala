package typingsSlinky.sauronjs.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  var broadcastSubject: js.Any = js.native
  def broadcast(event: String, data: js.Any): Unit = js.native
}

object Service {
  @scala.inline
  def apply(broadcast: (String, js.Any) => Unit, broadcastSubject: js.Any): Service = {
    val __obj = js.Dynamic.literal(broadcast = js.Any.fromFunction2(broadcast), broadcastSubject = broadcastSubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadcast(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcast")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBroadcastSubject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcastSubject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

