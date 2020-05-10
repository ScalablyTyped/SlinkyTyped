package typingsSlinky.rsmq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiveMessageOptions extends BaseOptions {
  /**
  		 * *(Default: queue settings)*
  		 * The length of time, in seconds, that the received message will be invisible to others.
  		 * Allowed values: 0-9999999 (around 115 days)
  		 *
  		 * @type {number}
  		 * @memberof ReceiveMessageOptions
  		 */
  var vt: js.UndefOr[Double] = js.native
}

object ReceiveMessageOptions {
  @scala.inline
  def apply(qname: String): ReceiveMessageOptions = {
    val __obj = js.Dynamic.literal(qname = qname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveMessageOptions]
  }
  @scala.inline
  implicit class ReceiveMessageOptionsOps[Self <: ReceiveMessageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vt")(js.undefined)
        ret
    }
  }
  
}

