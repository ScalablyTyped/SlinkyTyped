package typingsSlinky.amqp.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueOptions extends js.Object {
  /**
    * a map of additional arguments to pass in when creating a queue
    */
  var arguments: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Default: true
    *
    * If set, the queue is deleted when all consumers have finished using it.
    *
    * Last consumer can be cancelled either explicitly or because its channel is closed.
    *
    * If there was no consumer ever on the queue, it won't be deleted
    */
  var autoDelete: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    *
    * when true the channel will close on unsubscribe
    */
  var closeChannelOnUnsubscribe: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    *
    * Durable queues remain active when a server restarts.
    *
    * Non-durable queues (transient queues) are purged if/when a server restarts.
    *
    * Note that durable queues do not necessarily hold persistent messages,
    * although it does not make sense to send persistent messages to a transient queue
    */
  var durable: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    *
    * Exclusive queues may only be consumed from by the current connection.
    *
    * Setting the 'exclusive' flag always implies 'autoDelete'
    */
  var exclusive: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    *
    * If set, the queue will not be declared, this will allow a queue to be deleted if you don't know its previous options
    */
  var noDeclare: js.UndefOr[Boolean] = js.native
  /**
    * Default: false
    *
    * If set, the server will not create the queue.
    *
    * The client can use this to check whether a queue exists without modifying the server state
    */
  var passive: js.UndefOr[Boolean] = js.native
}

object QueueOptions {
  @scala.inline
  def apply(): QueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueOptions]
  }
  @scala.inline
  implicit class QueueOptionsOps[Self <: QueueOptions] (val x: Self) extends AnyVal {
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
    def withCloseChannelOnUnsubscribe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeChannelOnUnsubscribe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseChannelOnUnsubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeChannelOnUnsubscribe")(js.undefined)
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
  }
  
}

