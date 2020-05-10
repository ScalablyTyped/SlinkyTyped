package typingsSlinky.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Categories extends js.Object {
  var PNAccessDeniedCategory: String = js.native
  var PNBadRequestCategory: String = js.native
  var PNConnectedCategory: String = js.native
  var PNMalformedResponseCategory: String = js.native
  var PNNetworkDownCategory: String = js.native
  var PNNetworkIssuesCategory: String = js.native
  var PNNetworkUpCategory: String = js.native
  var PNReconnectedCategory: String = js.native
  var PNRequestMessageCountExceedCategory: String = js.native
  var PNTimeoutCategory: String = js.native
  var PNUnknownCategory: String = js.native
}

object Categories {
  @scala.inline
  def apply(
    PNAccessDeniedCategory: String,
    PNBadRequestCategory: String,
    PNConnectedCategory: String,
    PNMalformedResponseCategory: String,
    PNNetworkDownCategory: String,
    PNNetworkIssuesCategory: String,
    PNNetworkUpCategory: String,
    PNReconnectedCategory: String,
    PNRequestMessageCountExceedCategory: String,
    PNTimeoutCategory: String,
    PNUnknownCategory: String
  ): Categories = {
    val __obj = js.Dynamic.literal(PNAccessDeniedCategory = PNAccessDeniedCategory.asInstanceOf[js.Any], PNBadRequestCategory = PNBadRequestCategory.asInstanceOf[js.Any], PNConnectedCategory = PNConnectedCategory.asInstanceOf[js.Any], PNMalformedResponseCategory = PNMalformedResponseCategory.asInstanceOf[js.Any], PNNetworkDownCategory = PNNetworkDownCategory.asInstanceOf[js.Any], PNNetworkIssuesCategory = PNNetworkIssuesCategory.asInstanceOf[js.Any], PNNetworkUpCategory = PNNetworkUpCategory.asInstanceOf[js.Any], PNReconnectedCategory = PNReconnectedCategory.asInstanceOf[js.Any], PNRequestMessageCountExceedCategory = PNRequestMessageCountExceedCategory.asInstanceOf[js.Any], PNTimeoutCategory = PNTimeoutCategory.asInstanceOf[js.Any], PNUnknownCategory = PNUnknownCategory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Categories]
  }
  @scala.inline
  implicit class CategoriesOps[Self <: Categories] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPNAccessDeniedCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNAccessDeniedCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNBadRequestCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNBadRequestCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNConnectedCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNConnectedCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNMalformedResponseCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNMalformedResponseCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNNetworkDownCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNNetworkDownCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNNetworkIssuesCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNNetworkIssuesCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNNetworkUpCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNNetworkUpCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNReconnectedCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNReconnectedCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNRequestMessageCountExceedCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNRequestMessageCountExceedCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNTimeoutCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNTimeoutCategory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPNUnknownCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PNUnknownCategory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

