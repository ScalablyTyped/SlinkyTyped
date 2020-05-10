package typingsSlinky.amqplib.propertiesMod

import typingsSlinky.amqplib.Anon
import typingsSlinky.amqplib.amqplibStrings.expired
import typingsSlinky.amqplib.amqplibStrings.maxlen
import typingsSlinky.amqplib.amqplibStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XDeath extends js.Object {
  var count: Double = js.native
  var exchange: String = js.native
  var `original-expiration`: js.UndefOr[js.Any] = js.native
  var queue: String = js.native
  var reason: rejected | expired | maxlen = js.native
  var `routing-keys`: js.Array[String] = js.native
  var time: Anon = js.native
}

object XDeath {
  @scala.inline
  def apply(
    count: Double,
    exchange: String,
    queue: String,
    reason: rejected | expired | maxlen,
    `routing-keys`: js.Array[String],
    time: Anon
  ): XDeath = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.updateDynamic("routing-keys")(`routing-keys`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDeath]
  }
  @scala.inline
  implicit class XDeathOps[Self <: XDeath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExchange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: rejected | expired | maxlen): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withRouting-keys`(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routing-keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Anon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOriginal-expiration`(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original-expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutOriginal-expiration`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original-expiration")(js.undefined)
        ret
    }
  }
  
}

