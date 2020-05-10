package typingsSlinky.oracledb.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message dequeued from an advanced queue.
  * 
  * @since 4.0
  */
@js.native
trait AdvancedQueueMessage extends js.Object {
  /** Correlation that was used during enqueue. */
  var correlation: String = js.native
  /** Number of seconds the message was delayed before it could be dequeued. */
  var delay: Double = js.native
  /** Delivery mode the messages was enqueued with. */
  var deliveryMode: Double = js.native
  /** Name of the exception queue defined when the message was enqueued. */
  var exceptionQueue: String = js.native
  /** Number of seconds until expiration defined when the message was enqueued. */
  var expiration: Double = js.native
  /** Contains the unique identifier of the message. */
  var msgId: Buffer = js.native
  /** Number of attempts that were made to dequeue the message. */
  var numAttempts: Double = js.native
  /** Contains the unique identifier of the message in the last queue that generated it. */
  var originalMsgId: Buffer = js.native
  /** Contains the payload of the message, with type depending on the value of queue.payloadType.
    * Note that enqueued Strings are returned as UTF-8 encoded Buffers.
    */
  var payload: Buffer | DBObject = js.native
  /** Priority of the message when it was enqueued. */
  var priority: Double = js.native
  /** State of the message. It can be any one of the AQ_MSG_STATE constants. */
  var state: Double = js.native
}

object AdvancedQueueMessage {
  @scala.inline
  def apply(
    correlation: String,
    delay: Double,
    deliveryMode: Double,
    exceptionQueue: String,
    expiration: Double,
    msgId: Buffer,
    numAttempts: Double,
    originalMsgId: Buffer,
    payload: Buffer | DBObject,
    priority: Double,
    state: Double
  ): AdvancedQueueMessage = {
    val __obj = js.Dynamic.literal(correlation = correlation.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], deliveryMode = deliveryMode.asInstanceOf[js.Any], exceptionQueue = exceptionQueue.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], msgId = msgId.asInstanceOf[js.Any], numAttempts = numAttempts.asInstanceOf[js.Any], originalMsgId = originalMsgId.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedQueueMessage]
  }
  @scala.inline
  implicit class AdvancedQueueMessageOps[Self <: AdvancedQueueMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorrelation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("correlation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeliveryMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExceptionQueue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exceptionQueue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsgId(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginalMsgId(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalMsgId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: Buffer | DBObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

