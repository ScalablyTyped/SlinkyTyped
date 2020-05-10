package typingsSlinky.amqp.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.amqp.amqpStrings.direct
import typingsSlinky.amqp.amqpStrings.fanout
import typingsSlinky.amqp.amqpStrings.topic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExchangeOptions extends js.Object {
  /**
    * a map of additional arguments to pass in when creating an exchange
    */
  var arguments: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Default: true
    *
    * If set, the exchange is deleted when there are no longer queues bound to it
    */
  var autoDelete: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    *
    * If set, the exchange will be in confirm mode, and you will get a 'ack'|'error' event emitted on a publish,
    * or the callback on the publish will be called
    */
  var confirm: js.UndefOr[Boolean] = js.native
  /**
    * Default: true
    *
    * If set when creating a new exchange, the exchange will be marked as durable.
    *
    * Durable exchanges remain active when a server restarts.
    *
    * Non-durable exchanges (transient exchanges) are purged if/when a server restarts
    */
  var durable: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    *
    * If set, the exchange will not be declared,
    * this will allow the exchange to be deleted if you dont know its previous options
    */
  var noDeclare: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    *
    * f set, the server will not create the exchange. The client can use this to check whether an exchange exists without modifying the server state
    */
  var passive: js.UndefOr[Boolean] = js.native
  /**
    * Default: 'topic'
    */
  var `type`: js.UndefOr[direct | fanout | topic] = js.native
}

object ExchangeOptions {
  @scala.inline
  def apply(): ExchangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangeOptions]
  }
  @scala.inline
  implicit class ExchangeOptionsOps[Self <: ExchangeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArguments(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArguments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arguments")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDelete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(js.undefined)
        ret
    }
    @scala.inline
    def withDurable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durable")(js.undefined)
        ret
    }
    @scala.inline
    def withNoDeclare(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDeclare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoDeclare: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noDeclare")(js.undefined)
        ret
    }
    @scala.inline
    def withPassive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passive")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: direct | fanout | topic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

