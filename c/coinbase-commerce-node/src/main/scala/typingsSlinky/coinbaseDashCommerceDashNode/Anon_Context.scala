package typingsSlinky.coinbaseDashCommerceDashNode

import typingsSlinky.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod.PaymentStatus
import typingsSlinky.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeMod.Timestamp
import typingsSlinky.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.DELAYED
import typingsSlinky.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.MANUAL
import typingsSlinky.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.MULTIPLE
import typingsSlinky.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.OTHER
import typingsSlinky.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.OVERPAID
import typingsSlinky.coinbaseDashCommerceDashNode.coinbaseDashCommerceDashNodeStrings.UNDERPAID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
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

object Anon_Context {
  @scala.inline
  def apply(
    status: PaymentStatus,
    time: Timestamp,
    context: UNDERPAID | OVERPAID | DELAYED | MULTIPLE | MANUAL | OTHER = null
  ): Anon_Context = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Context]
  }
}

