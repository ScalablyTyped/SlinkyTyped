package typingsSlinky.amqp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeOptions extends js.Object {
  /**
    * Default: false
    *
    * Make it so that the AMQP server only delivers single messages at a time.
    * When you want the next message, call queue.shift()
    *
    * When false, you will receive messages as fast as they are emitted
    */
  var ack: js.UndefOr[Boolean] = js.native
  /**
    * Default: undefined
    *
    * Will inject the routingKey into the payload received
    */
  var deliveryKeyInPayload: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    *
    * If set to true, only one subscriber is allowed at a time
    */
  var exclusive: js.UndefOr[Boolean] = js.native
  /**
    * Default: 1
    *
    * Will only send you N messages before you 'ack'.
    *
    * Setting to zero will widen that window to 'unlimited'. If this is set, queue.shift() should not be used
    */
  var prefetchCount: js.UndefOr[Double] = js.native
  /**
    * Default: undefined
    *
    * Will inject the routingKey into the payload received
    */
  var routingKeyInPayload: js.UndefOr[Boolean] = js.native
}

object SubscribeOptions {
  @scala.inline
  def apply(): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeOptions]
  }
  @scala.inline
  implicit class SubscribeOptionsOps[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ack")(js.undefined)
        ret
    }
    @scala.inline
    def withDeliveryKeyInPayload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryKeyInPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryKeyInPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryKeyInPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusive")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefetchCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetchCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefetchCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefetchCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutingKeyInPayload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingKeyInPayload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutingKeyInPayload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingKeyInPayload")(js.undefined)
        ret
    }
  }
  
}

