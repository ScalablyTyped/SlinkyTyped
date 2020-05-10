package typingsSlinky.jackrabbit

import typingsSlinky.amqplib.mod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAmqp extends js.Object {
  var amqp: js.Any = js.native
  var connection: Connection = js.native
}

object AnonAmqp {
  @scala.inline
  def apply(amqp: js.Any, connection: Connection): AnonAmqp = {
    val __obj = js.Dynamic.literal(amqp = amqp.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmqp]
  }
  @scala.inline
  implicit class AnonAmqpOps[Self <: AnonAmqp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmqp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amqp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection(value: Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

