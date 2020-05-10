package typingsSlinky.rsmq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessageOptions extends BaseOptions {
  /**
  		 * *(Default: queue settings)*
  		 * The time in seconds that the delivery of the message will be delayed.
  		 * Allowed values: 0-9999999 (around 115 days)
  		 *
  		 * @type {number}
  		 * @memberof SendMessageOptions
  		 */
  var delay: js.UndefOr[Double] = js.native
  /**
  		 * Message for the queue
  		 *
  		 * @type {string}
  		 * @memberof SendMessageOptions
  		 */
  var message: String = js.native
}

object SendMessageOptions {
  @scala.inline
  def apply(message: String, qname: String): SendMessageOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], qname = qname.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageOptions]
  }
  @scala.inline
  implicit class SendMessageOptionsOps[Self <: SendMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
  }
  
}

