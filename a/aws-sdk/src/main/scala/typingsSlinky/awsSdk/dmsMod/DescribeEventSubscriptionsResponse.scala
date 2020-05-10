package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventSubscriptionsResponse extends js.Object {
  /**
    * A list of event subscriptions.
    */
  var EventSubscriptionsList: js.UndefOr[typingsSlinky.awsSdk.dmsMod.EventSubscriptionsList] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}

object DescribeEventSubscriptionsResponse {
  @scala.inline
  def apply(): DescribeEventSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventSubscriptionsResponse]
  }
  @scala.inline
  implicit class DescribeEventSubscriptionsResponseOps[Self <: DescribeEventSubscriptionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventSubscriptionsList(value: EventSubscriptionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSubscriptionsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventSubscriptionsList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventSubscriptionsList")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
  }
  
}

