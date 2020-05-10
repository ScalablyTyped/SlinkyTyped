package typingsSlinky.amqplib.propertiesMod.Replies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssertExchange extends js.Object {
  var exchange: String = js.native
}

object AssertExchange {
  @scala.inline
  def apply(exchange: String): AssertExchange = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertExchange]
  }
  @scala.inline
  implicit class AssertExchangeOps[Self <: AssertExchange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExchange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchange")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

