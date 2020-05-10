package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingGroupProperties extends js.Object {
  /**
    * The description of the billing group.
    */
  var billingGroupDescription: js.UndefOr[BillingGroupDescription] = js.native
}

object BillingGroupProperties {
  @scala.inline
  def apply(): BillingGroupProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingGroupProperties]
  }
  @scala.inline
  implicit class BillingGroupPropertiesOps[Self <: BillingGroupProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingGroupDescription(value: BillingGroupDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingGroupDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingGroupDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingGroupDescription")(js.undefined)
        ret
    }
  }
  
}

