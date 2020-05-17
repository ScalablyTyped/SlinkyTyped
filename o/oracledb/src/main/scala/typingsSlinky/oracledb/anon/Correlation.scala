package typingsSlinky.oracledb.anon

import typingsSlinky.node.Buffer
import typingsSlinky.oracledb.mod.DBObject
import typingsSlinky.oracledb.mod.EnqueueMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Correlation extends EnqueueMessage {
  /** Correlation that was used during enqueue. */
  var correlation: String = js.native
  /** Number of seconds the message was delayed before it could be dequeued. */
  var delay: Double = js.native
  /** Name of the exception queue defined when the message was enqueued. */
  var exceptionQueue: String = js.native
  /** Number of seconds until expiration defined when the message was enqueued. */
  var expiration: Double = js.native
  /** Contains the payload of the message, with type depending on the value of queue.payloadType.
    * Note that enqueued Strings are returned as UTF-8 encoded Buffers.
    */
  var payload: Buffer | DBObject = js.native
  /** Priority of the message when it was enqueued. */
  var priority: Double = js.native
}

object Correlation {
  @scala.inline
  def apply(
    correlation: String,
    delay: Double,
    exceptionQueue: String,
    expiration: Double,
    payload: Buffer | DBObject,
    priority: Double
  ): Correlation = {
    val __obj = js.Dynamic.literal(correlation = correlation.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], exceptionQueue = exceptionQueue.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Correlation]
  }
  @scala.inline
  implicit class CorrelationOps[Self <: Correlation] (val x: Self) extends AnyVal {
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
  }
  
}

