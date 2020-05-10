package typingsSlinky.chartmogulNode.mod.Subscription

import typingsSlinky.chartmogulNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription extends js.Object {
  var cancellation_dates: Strings = js.native
  var customer_uuid: String = js.native
  var data_source_uuid: String = js.native
  var external_id: String = js.native
  var plan_uuid: String = js.native
  var uuid: String = js.native
}

object Subscription {
  @scala.inline
  def apply(
    cancellation_dates: Strings,
    customer_uuid: String,
    data_source_uuid: String,
    external_id: String,
    plan_uuid: String,
    uuid: String
  ): Subscription = {
    val __obj = js.Dynamic.literal(cancellation_dates = cancellation_dates.asInstanceOf[js.Any], customer_uuid = customer_uuid.asInstanceOf[js.Any], data_source_uuid = data_source_uuid.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], plan_uuid = plan_uuid.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  @scala.inline
  implicit class SubscriptionOps[Self <: typingsSlinky.chartmogulNode.mod.Subscription.Subscription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancellation_dates(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellation_dates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomer_uuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer_uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData_source_uuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data_source_uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternal_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlan_uuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plan_uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

