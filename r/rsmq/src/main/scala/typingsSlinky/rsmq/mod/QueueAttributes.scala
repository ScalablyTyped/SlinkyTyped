package typingsSlinky.rsmq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueAttributes extends js.Object {
  /**
  		 * Timestamp (epoch in seconds) when the queue was created
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var created: Double = js.native
  /**
  		 * The delay for new messages in seconds
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var delay: Double = js.native
  /**
  		 * Current number of hidden / not visible messages.
  		 * A message can be hidden while "in flight" due to a `vt` parameter or when sent with a `delay`
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var hiddenmsgs: Double = js.native
  /**
  		 * The maximum size of a message in bytes
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var maxsize: Double = js.native
  /**
  		 * Timestamp (epoch in seconds) when the queue was last modified with `setQueueAttributes`
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var modified: Double = js.native
  /**
  		 * Current number of messages in the queue
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var msgs: Double = js.native
  /**
  		 * Total number of messages received from the queue
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var totalrecv: Double = js.native
  /**
  		 * Total number of messages sent to the queue
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var totalsent: Double = js.native
  /**
  		 * The visibility timeout for the queue in seconds
  		 *
  		 * @type {number}
  		 * @memberof QueueAttributes
  		 */
  var vt: Double = js.native
}

object QueueAttributes {
  @scala.inline
  def apply(
    created: Double,
    delay: Double,
    hiddenmsgs: Double,
    maxsize: Double,
    modified: Double,
    msgs: Double,
    totalrecv: Double,
    totalsent: Double,
    vt: Double
  ): QueueAttributes = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], hiddenmsgs = hiddenmsgs.asInstanceOf[js.Any], maxsize = maxsize.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], msgs = msgs.asInstanceOf[js.Any], totalrecv = totalrecv.asInstanceOf[js.Any], totalsent = totalsent.asInstanceOf[js.Any], vt = vt.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueAttributes]
  }
  @scala.inline
  implicit class QueueAttributesOps[Self <: QueueAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHiddenmsgs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiddenmsgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModified(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMsgs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalrecv(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalrecv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalsent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalsent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

