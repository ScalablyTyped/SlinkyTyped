package typingsSlinky.request.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connect extends js.Object {
  var connect: Double = js.native
  var end: Double = js.native
  var lookup: Double = js.native
  var response: Double = js.native
  var socket: Double = js.native
}

object Connect {
  @scala.inline
  def apply(connect: Double, end: Double, lookup: Double, response: Double, socket: Double): Connect = {
    val __obj = js.Dynamic.literal(connect = connect.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], lookup = lookup.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connect]
  }
  @scala.inline
  implicit class ConnectOps[Self <: Connect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnect(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLookup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponse(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocket(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

