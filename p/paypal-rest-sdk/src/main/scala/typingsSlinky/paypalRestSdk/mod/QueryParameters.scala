package typingsSlinky.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryParameters extends js.Object {
  var anchor_type: js.UndefOr[String] = js.native
  var count: js.UndefOr[Double] = js.native
  var end_time: js.UndefOr[String] = js.native
  var event_type: js.UndefOr[String] = js.native
  var page: js.UndefOr[Double] = js.native
  var page_size: js.UndefOr[Double] = js.native
  var payee_id: js.UndefOr[String] = js.native
  var sort_by: js.UndefOr[String] = js.native
  var sort_order: js.UndefOr[String] = js.native
  var start_id: js.UndefOr[String] = js.native
  var start_index: js.UndefOr[Double] = js.native
  var start_time: js.UndefOr[String] = js.native
  var status: js.UndefOr[js.Array[String]] = js.native
  var total_count_required: js.UndefOr[Boolean] = js.native
  var transaction_id: js.UndefOr[String] = js.native
  var webhook_id: js.UndefOr[String] = js.native
}

object QueryParameters {
  @scala.inline
  def apply(): QueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameters]
  }
  @scala.inline
  implicit class QueryParametersOps[Self <: QueryParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor_type")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_time")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_type")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPage_size(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage_size: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page_size")(js.undefined)
        ret
    }
    @scala.inline
    def withPayee_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payee_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayee_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payee_id")(js.undefined)
        ret
    }
    @scala.inline
    def withSort_by(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort_by: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort_by")(js.undefined)
        ret
    }
    @scala.inline
    def withSort_order(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort_order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort_order: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort_order")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_id")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_index(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_index: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_index")(js.undefined)
        ret
    }
    @scala.inline
    def withStart_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal_count_required(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count_required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal_count_required: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count_required")(js.undefined)
        ret
    }
    @scala.inline
    def withTransaction_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction_id")(js.undefined)
        ret
    }
    @scala.inline
    def withWebhook_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhook_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebhook_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhook_id")(js.undefined)
        ret
    }
  }
  
}

