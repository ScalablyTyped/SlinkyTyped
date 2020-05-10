package typingsSlinky.scBrokerCluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerSocket extends js.Object {
  var id: String = js.native
  def emit(eventName: String, args: js.Any*): Unit = js.native
}

object ServerSocket {
  @scala.inline
  def apply(emit: (String, /* repeated */ js.Any) => Unit, id: String): ServerSocket = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSocket]
  }
  @scala.inline
  implicit class ServerSocketOps[Self <: ServerSocket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmit(value: (String, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

