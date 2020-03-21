package typingsSlinky.coinbaseCommerceNode

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

trait AnonContext extends js.Object {
  /**
    * Timeline entry context.
    */
  var context: js.UndefOr[UNDERPAID | OVERPAID | DELAYED | MULTIPLE | MANUAL | OTHER] = js.undefined
  /**
    * Timeline entry status.
    */
  var status: PaymentStatus
  /**
    * Timeline entry timestamp.
    */
  var time: Timestamp
}

object AnonContext {
  @scala.inline
  def apply(
    status: PaymentStatus,
    time: Timestamp,
    context: UNDERPAID | OVERPAID | DELAYED | MULTIPLE | MANUAL | OTHER = null
  ): AnonContext = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
}

