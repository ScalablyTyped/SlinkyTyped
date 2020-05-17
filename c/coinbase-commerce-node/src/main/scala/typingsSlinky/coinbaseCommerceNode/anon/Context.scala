package typingsSlinky.coinbaseCommerceNode.anon

import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.DELAYED
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.MANUAL
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.MULTIPLE
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.OTHER
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.OVERPAID
import typingsSlinky.coinbaseCommerceNode.coinbaseCommerceNodeStrings.UNDERPAID
import typingsSlinky.coinbaseCommerceNode.mod.PaymentStatus
import typingsSlinky.coinbaseCommerceNode.mod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  /**
    * Timeline entry context.
    */
  var context: js.UndefOr[UNDERPAID | OVERPAID | DELAYED | MULTIPLE | MANUAL | OTHER] = js.native
  /**
    * Timeline entry status.
    */
  var status: PaymentStatus = js.native
  /**
    * Timeline entry timestamp.
    */
  var time: Timestamp = js.native
}

object Context {
  @scala.inline
  def apply(status: PaymentStatus, time: Timestamp): Context = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: PaymentStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: UNDERPAID | OVERPAID | DELAYED | MULTIPLE | MANUAL | OTHER): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
  }
  
}

