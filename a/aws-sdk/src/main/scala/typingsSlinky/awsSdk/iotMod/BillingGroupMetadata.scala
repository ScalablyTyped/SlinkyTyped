package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingGroupMetadata extends js.Object {
  /**
    * The date the billing group was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
}

object BillingGroupMetadata {
  @scala.inline
  def apply(creationDate: js.Date = null): BillingGroupMetadata = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingGroupMetadata]
  }
}

